
package desafios;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requisicoes {


    public String request(String search) throws IOException, InterruptedException {
        String cep = search;
        String url = "https://viacep.com.br/ws/" + cep + "/json";
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                throw new IOException("Erro na requisição: codígo " + response.statusCode());
            }
            String body = response.body();
            if (body.contains("\"erro\": true")) {
                throw new IllegalArgumentException("CEP não encontrado! ");
            }
            return body;

        }  catch (IllegalArgumentException e) {
                System.out.println("⚠️ Erro: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("❌ Falha ao conectar à API: " + e.getMessage());
            } catch (InterruptedException e) {
                System.out.println("⚠️ A requisição foi interrompida!");
                Thread.currentThread().interrupt(); // boa prática
            } catch (Exception e) {
                System.out.println("❗ Erro inesperado: " + e.getMessage());
            }

            return null; // caso dê erro, retorna nulo
        }

}






