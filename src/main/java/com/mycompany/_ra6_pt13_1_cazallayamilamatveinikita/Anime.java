/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ra6_pt13_1_cazallayamilamatveinikita;

/**
 *
 * @author ycaza
 */
public class Anime {
    String id;
    String name;
    String altName;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAltName() {
        return altName;
    }

    @Override
    public String toString() {
        return "Anime{" + "\nid=" + id + ", \nname=" + name + ", \naltName=" + altName + '}';
    }
    
}
