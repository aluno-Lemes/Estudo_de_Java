package br.com.conversor;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.net.URI;

public class ExchangeApiClient {

    private static final String api_key = System.getenv("######");

    public String getBody(String valorBase, String valorAlvo, double quantia) throws IOException, InterruptedException {
        try {
            if(api_key == null || api_key.isBlank()){
                throw new IllegalStateException("API_KEY não definida no ambiente.");
            }
            String url = "https://v6.exchangerate-api.com/v6/"+api_key+"/pair/"+valorBase+"/"+valorAlvo+"/"+quantia;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Accept", "application/json")
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() != 200){
                throw new IOException("Erro na API: Código " +response.statusCode());
            }
            return response.body();
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao conectar com o servidor de câmbio: " + e.getMessage());
            throw e;
        }
    }
}
