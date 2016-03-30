package projlab;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.swing.text.Position;

/**
 * 
 */
public class Karakter {

    /**
     * Default constructor
     */
    public Karakter() {
    }

//    /**
//     * 
//     */
//    private int ZPM;
//
//    /**
//     * 
//     */
//    private int PickRange;
//
//    /**
//     * 
//     */
//    private boolean GotBox;
//
//    /**
//     * 
//     */
//    private Elem LastMove;
//
//    /**
//     * 
//     */
//    private Fegyver fegyver;
//
//    /**
//     * 
//     */
//    private Labirintus lab;
//
//    /**
//     * 
//     */
//    private Terulet pos;

    /**
     * @param lab 
     * @param img
     */
    public void Karakter(Labirintus lab, File img) {
        // TODO implement here
    }

    /**
     * @param val
     */
    public static void setPos(Vektor val) {
        System.out.println("Karakter.setPos():: A Karakter pozícióját a kívánt értékre állítottam.\n");
    }

    /**
     * @return
     */
    public Terulet getPos() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void addZPM() {
        System.out.println("Karakter.addZPM:: Kaptam egy ZPM-et.");
    }

    /**
     * @return
     */
    public int getZPM() {
        System.out.println("Karakter.getZPM:: Küldöm a ZPM-eim számát.");
        return 1;//TODO most fix, később módosítani!
    }
    
    public Fegyver getFegyver(){
    	return new Fegyver();
    }

    /**
     * 
     */
    public void changeBoxVal() {
        // TODO implement here
    }

    /**
     * @param dir
     * @throws Exception 
     */
    public static void Move(Vektor dir) throws Exception {
        System.out.println("Karakter.Move():: Kedves labirintus: mi van itt?");
        
        Elem  e = Labirintus.WhatsThere(new Terulet());
        if(e == null)return;
        if(!e.getReachable())//Ha nem lehet rálépni, return!
        	return;
        Karakter.setPos(new Vektor());
        
        
        e.Activate(new Karakter());
        
    }

    /**
     * @param dir
     */
    public void Pick(Vektor dir) {
        // TODO implement here
    }

    /**
     * @param dir
     */
    public void Drop(Vektor dir) {
        // TODO implement here
    }
    

}