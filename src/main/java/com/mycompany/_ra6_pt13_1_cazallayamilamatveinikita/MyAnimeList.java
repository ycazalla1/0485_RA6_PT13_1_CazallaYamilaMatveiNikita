/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ra6_pt13_1_cazallayamilamatveinikita;

/**
 * Classe MyAnimeList.
 * S'omplirà amb les dades de tipus JSON que obitingui de l'API.
 * 
 * @author Nikita i Yamila
 */
public class MyAnimeList {
    
    /* Declarem els seus atributs segons l'API */
    String status;
    Data data;

    /**
     * Getter per obtenir el valor d'estatus
     * 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Getter per obtenir el valor de l'instància Data
     * 
     * @return data
     */
    public Data getData() {
        return data;
    }

    /**
     * Mètode toString() per imprimir els valors dels atributs
     * 
     * @return status i data
     */
    @Override
    public String toString() {
        return "Estatus: " + status + "\n" + data;
    }
}
