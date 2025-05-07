/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ra6_pt13_1_cazallayamilamatveinikita;

/**
 *
 * @author ycaza
 */
public class Data {
    String content;
    Anime anime;
    Character character;

    public String getContent() {
        return content;
    }

    public Anime getAnime() {
        return anime;
    }

    public Character getCharacter() {
        return character;
    }

    @Override
    public String toString() {
        return "Data{" + "\ncontent=" + content + ", \nanime=" + anime + ", \ncharacter=" + character + '}';
    }
    
}
