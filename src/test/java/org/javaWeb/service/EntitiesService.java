package org.javaWeb.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EntitiesService {
    private String BASE_URL = "https://apichallenges.eviltester.com/sim/entities";

    public void getAllEntities() {
        try {
            URL url = new URL(BASE_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int statusCode = connection.getResponseCode();
            System.out.println("Status HTTP: " + statusCode);

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder repsonde = new StringBuilder();
            while ((line= reader.readLine()) != null) {
                repsonde.append(line).append("\n");
            }
//            System.out.println("Body: " + repsonde.toString());

            reader.close();
            connection.disconnect();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonElement jsonElement = JsonParser.parseString(repsonde.toString());
            String prettyJson = gson.toJson(jsonElement);
            System.out.println(prettyJson);
            System.out.println("--------------------------------------------------");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getEntityById(int id) {
        try {
            URL url = new URL(BASE_URL + "/" + id);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int statusCode = connection.getResponseCode();
            System.out.println("Status HTTP: " + statusCode + "|" + " ID: " + id);


            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonElement jsonElement = JsonParser.parseString(response.toString());
            String prettyJson = gson.toJson(jsonElement);

            System.out.println("Resposta:\n" + prettyJson);
            System.out.println("--------------------------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
