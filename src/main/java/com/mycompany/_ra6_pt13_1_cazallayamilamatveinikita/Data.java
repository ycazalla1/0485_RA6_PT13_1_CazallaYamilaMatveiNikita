/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ra6_pt13_1_cazallayamilamatveinikita;

/**
 * Classe Data.
 * S'omplirà amb les dades de tipus JSON que obitingui de l'API.
 * 
 * @author Nikita i Yamila
 */
public class Data {
    
    /* Declarem els atributs segons l'API */
    String content;
    Anime anime;
    Character character;

    /**
     * Getter per obtenir el valor de content
     * 
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * Getter per obtenir el valor de la classe Anime
     * 
     * @return anime
     */
    public Anime getAnime() {
        return anime;
    }

    /**
     * Getter per obtenir el valor de la classe Character
     * 
     * @return character
     */
    public Character getCharacter() {
        return character;
    }

    /**
     * Mètode toString() per imprimir els valors dels atributs
     * 
     * @return content, anime i character
     */
    @Override
    public String toString() {
        return "Contingut: " + content + "\n\n++++ Anime ++++" + anime +
                "\n\n++++ Personatge ++++" + character;
    }
    
}
