package movieCatalog;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
//	@Autowired
//	private WebClient.Builder webClientBuilder; 
	@HystrixCommand(fallbackMethod = "getFallback",
			commandProperties = {
					@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="2000"),
					@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="4"),
					@HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value="5000"),
					@HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value="50")
			}
			)
	@RequestMapping("/{userId}")
	public List<CatalogItem>getCatalog(@PathVariable("userId") String userId){
		
		//WebClient.Builder builder=WebClient.builder();

			UserRating ratings=restTemplate.getForObject("http://ratingdata/ratingsdata/users/"+userId,UserRating.class);
			
			return ratings.getUserRating().stream().
					map(rating -> {
				Movie movie=restTemplate.getForObject("http://movieinfo/movies/"+rating.getMovieId(),Movie.class);
				/* Movie movie=webClientBuilder.build()
						.get()
						.uri("http://localhost:8081/movies/"+rating.getMovieId()).retrieve()
						.bodyToMono(Movie.class)
						.block();
						*/
				return new CatalogItem(movie.getName(),movie.getDescription(),rating.getRating());
				
			})
			.collect(Collectors.toList());
				
}
	public List<CatalogItem>getFallback(@PathVariable("userId") String userId){
		return Arrays.asList(new CatalogItem("Not Found","N/A",0));
	}
	}