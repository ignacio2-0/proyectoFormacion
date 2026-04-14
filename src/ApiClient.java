import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    private final HttpClient client = HttpClient.newHttpClient();

    public String getJSON(String urlStr) {

        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlStr)) .GET().build();

            HttpResponse<String> response = client.send( request, HttpResponse.BodyHandlers.ofString()
            );
            return response.body();

        } catch (Exception e) {
            System.out.println("Error al llamar a la API: " + e.getMessage());
            return null;
        }
    }
}
