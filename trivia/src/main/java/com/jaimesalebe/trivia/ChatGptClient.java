package com.jaimesalebe.trivia;

import io.github.cdimascio.dotenv.Dotenv;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatGptClient {

    public String generarPregunta(String categoria) {
        Dotenv dotenv = Dotenv.load();
        String respuestaDeChatGpt = "";
        try {
            // URL de la API de ChatGPT
            URL url = new URL("https://api.openai.com/v1/chat/completions");

            // Establecer la conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");

            // Establecer los encabezados de la solicitud
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + dotenv.get("API_KEY_GPT"));

            connection.setDoOutput(true);
            DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

            // Crear el cuerpo de la solicitud
            String requestBody =
                        "{\"model\": \"gpt-3.5-turbo\", \"messages\": [{\"role\": \"system\", \"content\": \"Dame una pregunta para un juego de trivia con la categoria " + categoria + " que contenga la siguiente estrucuta en json (colocale las comillas y cada llave y respuesta como si de un json se tratara). category: aqui va la categoria, question: aqui va la pregunta, answer: la respuesta es el numero de la posicion de options partiendo desde 0, explanation:aqui va una explicacion de porque es la respuesta correcta de manera resumida y precisa, options: [option1, option2, option3] \"}, {\"role\": \"user\", \"content\": \"response in spanish\"}]}";

            // Enviar la solicitud
            outputStream.writeBytes(requestBody);
            outputStream.flush();
            outputStream.close();

            // Obtener la respuesta
            int responseCode = connection.getResponseCode();
            BufferedReader inputReader;
            if (responseCode == HttpURLConnection.HTTP_OK) {
                inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            } else {
                inputReader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            }

            // Leer la respuesta línea por línea
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = inputReader.readLine()) != null) {
                response.append(inputLine);
            }
            inputReader.close();
            // Imprimir la respuesta
            System.out.println(response.toString());
            respuestaDeChatGpt = response.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return respuestaDeChatGpt;
    }
}
