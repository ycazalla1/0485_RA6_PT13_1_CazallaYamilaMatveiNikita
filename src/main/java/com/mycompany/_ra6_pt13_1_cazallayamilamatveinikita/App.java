/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._ra6_pt13_1_cazallayamilamatveinikita;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Enunciat. En aquesta pràctica heu de cercar una API que doni una resposta en
 * format JSON i crear un array list d’objectes del json retornat (podeu fer una
 * crida o vàries, segons el servei web que consumiu).
 *
 * @author Nikita i Yamila
 */
public class App {

    public static void main(String[] args) {

        ArrayList<MyAnimeList> llista = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            try {
                String apiURL = "https://api.animechan.io/v1/quotes/random";
                URL url = new URL(apiURL);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setRequestMethod("GET");
                connection.setRequestProperty("Accept", "application/json");

                int status = connection.getResponseCode();
                if (status == 200) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    StringBuilder json = new StringBuilder();
                    String line;

                    while ((line = in.readLine()) != null) {
                        json.append(line);
                    }

                    in.close();

                    //Convertim JSON a objecte Java
                    Gson gson = new Gson();
                    MyAnimeList anime = gson.fromJson(json.toString(), MyAnimeList.class);
                    llista.add(anime);
                    System.out.println(llista);
                    /* Imprimir la llista
                for (MyAnimeList a : llista) {
                    System.out.println(a);
                }
                     */
                } else {
                    System.out.println("Error en la connexió. Codi resposta: " + status);
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
}
