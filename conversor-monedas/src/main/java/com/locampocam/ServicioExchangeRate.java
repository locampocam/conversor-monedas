package com.locampocam;

import java.io.InputStream;
import java.util.Properties;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicioExchangeRate {

    private static final String API_KEY;

    static {
        try {
            Properties props = new Properties();

            InputStream archivo = ServicioExchangeRate.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            props.load(archivo);

            API_KEY = props.getProperty("API_KEY");

        } catch (Exception e) {
            throw new RuntimeException("No se pudo leer config.properties", e);
        }
    }

    private static final String URL_BASE = "https://v6.exchangerate-api.com/v6/";

    public static double obtenerTasa(String base, String destino) throws Exception {

        String url = URL_BASE + API_KEY + "/pair/" + base + "/" + destino;

        HttpClient cliente = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response =
                cliente.send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

        return json.get("conversion_rate").getAsDouble();
    }
}
