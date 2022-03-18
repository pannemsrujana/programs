package java112;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Http {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient client=HttpClient.newHttpClient();
		HttpRequest request=HttpRequest.newBuilder().uri(URI.create("https://httpbin.org/get")).GET().build();
		HttpResponse<void>response=client.send(request,HttpResponse.BodyHandler.discarding());
		System.out.prinln(response.statuscode());

	}

}
