package projlab;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
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

    /**
     * 
     */
    private int ZPM;

    /**
     * 
     */
    private int PickRange;

    /**
     * 
     */
    private boolean GotBox;

    /**
     * 
     */
    private Elem LastMove;

    /**
     * 
     */
    private Fegyver fegyver;

    /**
     * 
     */
    private Labirintus lab;

    /**
     * 
     */
    private Terulet pos;

    /**
     * @param lab 
     * @param img
     */
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static String answer;
	
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
    public static void changeBoxVal() {
    	System.out.println("Karakter.changeBoxVal(): Felvettünk vagy letettünk egy dobozt.");
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
    public static void Pick(Vektor dir) {
    	System.out.println("Karakter.Pick::Karakternél van doboz? I/N");
		try {
			answer=in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			if(answer.toUpperCase().equals("I"))
			{
		
			} else{
				try {
					Elem e=	Labirintus.WhatsThere(new Terulet());
					
					if(e.getPickable()==true)
						try {
							e.Activate(new Karakter());
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					Karakter.changeBoxVal();
					Labirintus.RemoveElem(e);
						
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
			
			}
				
				
    }

    /**
     * @param dir
     */
    public void Drop(Vektor dir) {
        // TODO implement here
    }
    

}