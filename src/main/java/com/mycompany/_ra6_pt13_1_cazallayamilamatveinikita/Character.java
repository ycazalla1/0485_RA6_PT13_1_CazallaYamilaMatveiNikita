/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ra6_pt13_1_cazallayamilamatveinikita;

/**
 * Classe Character.
 * S'omplirà amb les dades de tipus JSON que obitingui de l'API.
 * 
 * @author Nikita i Yamila
 */
public class Character {
    
    /* Declarem els atributs segons l'API */
    String id;
    String name;

    /**
     * Getter per obtenir el valor de id
     * 
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Getter per obtenir el valor de name
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Mètode toString() per imprimir els valor dels atributs
     * 
     * @return id i name
     */
    @Override
    public String toString() {
        return "\nId: " + id + "\nName:" + name;
    }
    
}
