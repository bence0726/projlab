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
    public static void RemoveElem(Elem param) {
        System.out.println("Labirintus.RemoveElem():: A kapott elemet kidobtam a listámból.");
    }

    /**
     * @param ter 
     * @return
     * @throws IOException 
     */
    public static Elem WhatsThere(Terulet ter){
    try{
    	switch(Menu.n){
    	
    	case 2:System.out.println("Labirintus.WhatsThere():: Talál valamit a karakter maga előtt? I/N");
		answer=in.readLine();
		if(answer.toUpperCase().equals("I"))
			return new Doboz();
		else 
			return null;
        case 6:
    		System.out.println("6.1 A lövedék eltalált valamit? I/N");
    		
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
        case 42:
        	System.out.println("Labirintus.WhatsThere():: A karakter alatt van valami? I/N");
        	answer=in.readLine();
        	if(answer.toUpperCase().equals("I"))
        	{
        		return new VegeElem();	//majdnem mindegy, hogy mi, nem lényeges,
        								//csak rá lehessen lépni.
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
        		
    }catch(IOException e){
    	e.printStackTrace();
    }
	return null;
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