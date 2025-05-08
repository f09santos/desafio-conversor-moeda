package br.com.conversormoedas;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoConversorApi {
    public void serviceApi(String moeda1, String moeda2, double valor) {

        String apiKey = "c43b28c708328f57fa48a617";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + moeda1 + "/" + moeda2 + "/" + valor))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Gson gson = new Gson();
            Moeda moeda = gson.fromJson(json, Moeda.class);
            double valorConvertido = Double.parseDouble(moeda.conversion_result());
            System.out.println("Valor para ser convertido: "+valor+ " ["+moeda1+"]");
            System.out.println("Resultado da conversão: "+moeda.conversion_result()+" ["+moeda2+"]");
            System.out.printf("%.2f [%s] corresponde ao valor de >>> %.2f [%s]",valor, moeda1, valorConvertido, moeda2);
            System.out.println("\n");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }





    }
}
