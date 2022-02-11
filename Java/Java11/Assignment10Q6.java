import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Assignment10Q6 {

	public static void main(String[] args) {
		String uri = "https://httpbin.org/get";
		
		HttpRequest req = HttpRequest.newBuilder()
		.uri(URI.create(uri))
		.GET()
		.version(Version.HTTP_2)
		.build();
		
		HttpClient client = HttpClient.newBuilder()
							.build();
		
		try {
			HttpResponse<String> resp = client.send(req, BodyHandlers.ofString());
			System.out.println(resp.statusCode());
			System.out.println(resp.body());
			System.out.println(resp.headers());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
