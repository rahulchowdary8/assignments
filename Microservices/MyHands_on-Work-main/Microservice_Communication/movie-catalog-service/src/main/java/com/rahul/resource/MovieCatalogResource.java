package com.rahul.resource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.rahul.models.CatalogItem;
import com.rahul.models.Movie;
import com.rahul.models.Rating;
import com.rahul.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	@Autowired 
	private RestTemplate restTemplate;
	
	@Autowired
	private  DiscoveryClient discoveryClient;//we use this instance like the rest-template,get function but we use resttemp coz it do all the automatically
	
	@Autowired
	private WebClient.Builder webClientBuilder ;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem>getCatalog(@PathVariable("userId") String userId){
//coz we add the bean in main we do not need the resttemplate instance
		//		RestTemplate restTemplate =new RestTemplate();
		
		
//		List<Rating> ratings =Arrays.asList(
//				new Rating("123",4),
//				new Rating("124",3)
//				);
		
		//insted of this we  use resttemplaate
		UserRating ratings =  restTemplate.getForObject("http://rating-data-service/rating/users/" + userId, UserRating.class );
		
		return ratings.getUserRating().stream().map(rating ->{ 
			//for each movie ID,call movie info service and get details
			
		//resttemplate 	
		Movie movie= restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
		
		//webclient THEY SAY USE THIS INSSTED OF RESTTEMPLATE
			/*
			Movie movie= webClientBuilder.build()
             .get()	
             .uri("http://localhost:8081/movies/" + rating.getMovieId())
             .retrieve()
             .bodyToMono(Movie.class)
             .block();
			*/
		
		
		//Put them all together
			return new CatalogItem(movie.getName(), "test", rating.getRating());
			})
		.collect(Collectors.toList());
               
		
//		return Collections.singletonList(
//				new CatalogItem("Titanic", "test",  4)
//				);			
		
	}

}
