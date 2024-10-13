import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiServices {

    public Moedas buscaMoedas(String moedaBase) {
        String apiKey = "ddacb704e35035adab7142dd";
        URI moedas = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/"+moedaBase);
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(moedas).build();

            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moedas.class);

        } catch (Exception e) {
            throw new RuntimeException("Não consegui encontrar a moeda solciitada");
        }
    }
}
