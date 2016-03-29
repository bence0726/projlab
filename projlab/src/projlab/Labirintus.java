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
        System.out.println("Labirintus.RemoveElem():: A kapott elemet kidobtam a listámból.");
    }

    /**
     * @param ter 
     * @return
     * @throws IOException 
     */
    public static Elem WhatsThere(Terulet ter) throws IOException {
    	
    switch(Menu.n){
    case 8:
    	System.out.println("Labirintus.WhatsThere():: A karakter ZPM-re lépett? I/N");
    	answer=in.readLine();
    	if(answer.toUpperCase().equals("I"))
    		return new ZPM();
    	return null;//Ha nincs itt semmi, null-t adunk vissza.
    case 9:
    	System.out.println("Labirintus.WhatsThere():: A karakter szakadékba lépett? I/N");
    	answer=in.readLine();
    	if(answer.toUpperCase().equals("I"))
    	{
    		return new Szakadek();
    	}
    	return null;//Ha nincs itt semmi, null-t adunk vissza.
    case 10: 
    		System.out.println("Labirintus.WhatsThere():: A karakter a vége elemre került? I/N");
    		answer=in.readLine();
    		if(answer.toUpperCase().equals("I"))
    			return new VegeElem();
    		else return null;//Ha nincs itt semmi, null-t adunk vissza.
    }
	return null;//Ha nincs itt semmi, null-t adunk vissza.
    		
    }
        
    

    /**
     * @return
     */
    public static int getZPM() {
        System.out.println("Labirintus.getZPM(): Kedves Felhasználó, hány ZPM volt a játék kezdetén?");
        int i = 0;
        try {
			String szam=in.readLine();
			i = Integer.parseInt(szam);//string --> int
		} catch (IOException e) {
			// TODO Majd töröld ki, csak szkeleton miatt kell
			e.printStackTrace();
		}
        return i;
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