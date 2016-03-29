package projlab;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * dontLove IIT!
 */
public class Labirintus {
	static String answer;
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    /**
     * Default constructor
     */
    public Labirintus() {
    }

    /**
     * 
     */
    private int osszZPM;

    /**
     * 
     */
    private Vektor KezdoPont;

    /**
     * 
     */
    private Elem VegeElem;



    /**
     * 
     */
    private Karakter kar;

    /**
     * 
     */
    private Set<Elem> list;

    /**
     * 
     */
    public void Labirintus() {
        // TODO implement here
    }

    /**
     * @param kar
     */
    public void AddKar(Karakter kar) {
        // TODO implement here
    }

    /**
     * @param param
     */
    public void AddElem(Elem param) {
        // TODO implement here
    }

    /**
     * @param param
     */
    public void RemoveElem(Elem param) {
        // TODO implement here
    }

    /**
     * @param ter 
     * @return
     * @throws IOException 
     */
    public static Elem WhatsThere(Terulet ter) throws IOException {
    	
    switch(Menu.n){
    	case 10: 
    		System.out.println("10.1 A karakter a vége elemre került? I/N");
    		answer=in.readLine();
    		if(answer.toUpperCase().equals("I"))
    			return new VegeElem();
    		else return null;
    }
	return null;
    		
    }
        
    

    /**
     * @return
     */
    public int getZPM() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public Elem getVegeElem() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Vektor getKezdoPont() {
        // TODO implement here
        return null;
    }

}