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
        System.out.println("Labirintus.getZPM(): Kedves Felhasználó, hány ZPM-e van a karakternek?");
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
     */
    //Csupán azért van szükség ilyen menüpont-mágiára,
    //mert nem mentünk el értékeket, így minden metódushívásnál
    //new Object()-et kap kb minden függvény. Későbbi release-ekből
    //ezeket kivezetjük...
    public static void Move(Vektor dir){
    								//itt most gonoszul módosítani fogom a megnyomott gomb értékét,
    								//de készül róla backup:
        int megnyomottMenu = Menu.n;//elkérjük a megnyomott menügomb értékét
        
        Menu.n = 42;				//ebből fogja tudni a WhatsThere(), hogy mi a szitu
    	System.out.println("Karakter.Move()::"
    			+ " Kedves labirintus: miről készülök lelépni?");
       								//Megvizsgáljuk, hogy a karakter helyén van-e elem.
        Elem itteni = Labirintus.WhatsThere(new Karakter().getPos());
        							
        Menu.n = megnyomottMenu;	//Visszaállítom a menügombot
        
        System.out.println("Karakter.Move():: Kedves labirintus: mire készülök rálépni?");
    	Elem  e = Labirintus.WhatsThere(new Terulet());
    	if(e == null)
    	{
    		if(itteni != null)			//Ha el tudunk lépni, deaktiváljuk  
            	itteni.deActivate();    //az alattunk levő mezőt
    		Karakter.setPos(new Vektor());
    		return;
    	}
        System.out.println("Karakter.Move():: Kedves elem: rádléphetek?");
        if(!e.getReachable())		//Ha nem lehet rálépni, return!
        	return;
        
        Karakter.setPos(new Vektor());
        e.Activate(new Karakter());
    }

    /**
     * @param dir
     */
  //Csupán azért van szükség ilyen menüpont-mágiára,
    //mert nem mentünk el értékeket, így minden metódushívásnál
    //new Object()-et kap kb minden függvény. Későbbi release-ekből
    //ezeket kivezetjük...
    public static void Pick(Vektor dir) {
		//itt most gonoszul módosítani fogom a megnyomott gomb értékét,
		//de készül róla backup:
    	int megnyomottMenu = Menu.n;//elkérjük a megnyomott menügomb értékét

    	Menu.n = 42;				//ebből fogja tudni a WhatsThere(), hogy mi a szitu
    	System.out.println("Karakter.Move()::"
    			+ " Kedves labirintus: Van nálam doboz?");
			//Megvizsgáljuk, hogy a karakter helyén van-e elem.
    	Elem itteni = Labirintus.WhatsThere(new Karakter().getPos());
		
    	Menu.n = megnyomottMenu;	//Visszaállítom a menügombot

    	Elem e = Labirintus.WhatsThere(new Terulet());
    	if(e.getPickable())
    		e.Activate(new Karakter());
    	Karakter.changeBoxVal();
    	Labirintus.RemoveElem(e);	
    }

    /**
     * @param dir
     */
    
    	public static void Drop(Vektor dir) {
    		//itt most gonoszul módosítani fogom a megnyomott gomb értékét,
			//de készül róla backup:
	    	int megnyomottMenu = Menu.n;//elkérjük a megnyomott menügomb értékét

	    	Menu.n = 42;				//ebből fogja tudni a WhatsThere(), hogy mi a szitu
				//Megvizsgáljuk, hogy a karakter helyén van-e elem.
	    	Elem itteni = Labirintus.WhatsThere(new Karakter().getPos());
			
	    	Menu.n = megnyomottMenu;	//Visszaállítom a menügombot
	    	
         	Elem e=	Labirintus.WhatsThere(new Terulet());
    		if(e.getReachable()==true){
    			
    			Labirintus.AddElem(new Doboz());
    			Karakter.changeBoxVal();
    		
    			Menu.n = 666; //csalok
    			e = Labirintus.WhatsThere(new Terulet());
    			e.Activate(new Karakter());    			
    		}
    	}
}