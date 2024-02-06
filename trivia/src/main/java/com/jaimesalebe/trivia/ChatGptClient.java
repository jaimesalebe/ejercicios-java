package com.jaimesalebe.trivia;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatGptClient {

    public String generarPregunta(String pregunta) {

        try {
            String apiKey = "TU_API_KEY_AQUI";
            String prompt = "Hola, ¿cómo estás?";
            String apiUrl = "https://api.openai.com/v1/chat/completions";

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Configuración de la conexión
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + apiKey);
            connection.setDoOutput(true);

            // Creación del cuerpo de la solicitud
            String requestBody = "{\"messages\": [{\"role\": \"system\", \"content\": \"You are a helpful assistant.\"}, {\"role\": \"user\", \"content\": \"" + prompt + "\"}]}";

            // Envío de la solicitud
            try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                wr.writeBytes(requestBody);
                wr.flush();
            }

            // Obtención de la respuesta
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                // Imprimir la respuesta
                System.out.println(response.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "{\n" +
                "\"category\": \"Cultura\",\n" +
                "\"options\": [\n" +
                "\"Ballet\",\n" +
                "\"Ópera\",\n" +
                "\"Teatro\"\n" +
                "],\n" +
                "\"answer\": \"2\",\n" +
                "\"explanation\": \"La ópera es un género musical que combina música y drama, caracterizado por el canto de los personajes principales.\",\n" +
                "\"question\": \"¿En qué tipo de presentación musical los personajes principales expresan sus emociones a través del canto?\"\n" +
                "}";
    }
}
