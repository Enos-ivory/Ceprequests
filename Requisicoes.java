package desafios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requisicoes {


    public String request(String search) throws IOException, InterruptedException {
        String cep = search;
        String url = "https://viacep.com.br/ws/"+ cep + "/json";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      ;
        return   response.body();
        }

}
