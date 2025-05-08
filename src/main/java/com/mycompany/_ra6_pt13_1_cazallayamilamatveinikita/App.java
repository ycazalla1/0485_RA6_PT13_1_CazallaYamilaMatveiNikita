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
        
        /* Declaració de constants */
        
        // Nombre de quotes que volem guardar en l'ArrayList
        final int NUMERO_QUOTES = 3;
        
        // URL de l'API, la qual retorna frases aleatòries d'anime en format JSON
        final String API_URL = "https://api.animechan.io/v1/quotes/random";
        
        
        /* ArrayList on s'emmagatzemen les instàncies de la classe MyAnimeList
           És on es troba la informació de la quota */
        ArrayList<MyAnimeList> llista = new ArrayList<>();
        
        // Bucle per fer tantes crides com quotes volem
        for (int i = 0; i < NUMERO_QUOTES; i++) {
            // try-catch per controlar excepcions
            try {
                //Instànciem la URL i obrim connexió HTTP amb l'API
                URL url = new URL(API_URL);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                
                // Declarem que volem fer una lectura de dades (GET) 
                connection.setRequestMethod("GET");
                
                // Declarem que s'espera una resposta d'accept en format JSON
                connection.setRequestProperty("Accept", "application/json");
                
                // Es guarda codi que obtenim al intentar connectar-nos
                int status = connection.getResponseCode();
                
                /* En base si el codi és 200(OK), extreiem la informació de
                   l'API o mostrem un missatge d'error */
                if (status == HttpURLConnection.HTTP_OK) {
                    
                    /* Instanciem un BufferedReader i un StringBuilder
                       per llegir línia per línia la resposta */
                    BufferedReader in = new BufferedReader(new InputStreamReader
                                        (connection.getInputStream()));
                    StringBuilder json = new StringBuilder();
                    String line;
                    
                    // El bucle finalitza quan ja no troba més línies per llegir
                    while ((line = in.readLine()) != null) {
                        json.append(line);
                    }

                    // Es tanca el lector
                    in.close();

                    /* A través de la importació de GSON el transformem en una
                       instància de la classe MyAnimeList */
                    Gson gson = new Gson();
                    MyAnimeList anime = gson.fromJson(json.toString(), MyAnimeList.class);
                    
                    // Afegim aquesta instància a l'ArrayList
                    llista.add(anime);
                    
                } else {
                    System.out.println("Error en la connexió. Codi resposta: " + status);
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        // Imprimeix la llista per mostrar el contingut de l'API
        System.out.println("---------------\n"
                            + "MY ANIME LIST\n"
                            + "---------------");
        for (MyAnimeList a : llista) {
            System.out.println("--- API ---");
            System.out.println(a);
            System.out.println("\n");
        }

    }
}
