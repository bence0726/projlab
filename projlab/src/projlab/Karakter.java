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
     */
    //Csupán azért van szükség ilyen menüpont-mágiára,
    //mert nem mentünk el értékeket, így minden metódushívásnál
    //new Object()-et kap kb minden függvény. Későbbi release-ekből
    //ezeket kivezetjük...
    public static void Move(Vektor dir){
    	//itt most gonoszul módosítani fogom a megnyomott gomb értékét,
        //de készül róla backup:
        int megnyomottMenu = Menu.n;//elkérjük a megnyomott menügomb értékét
        
        Menu.n = 42;//ebből fogja tudni a WhatsThere(),      									//hogy mi a szitu
    	System.out.println("Karakter.Move():: Kedves labirintus: miről készülök lelépni?");
        //Megvizsgáljuk, hogy a karakter helyén van-e elem.
        Elem itteni = Labirintus.WhatsThere(new Karakter().getPos());
    	
        //Visszaállítom a menügombot:
        Menu.n = megnyomottMenu;
        System.out.println("Karakter.Move():: Kedves labirintus: mire készülök rálépni?");
    	Elem  e = Labirintus.WhatsThere(new Terulet());
        if(e == null)return;
        System.out.println("Karakter.Move():: Kedves elem: rádléphetek?");
        if(!e.getReachable())//Ha nem lehet rálépni, return!
        	return;
                
        if(itteni != null)//Ha el tudunk lépni, deaktiváljuk az alattunk levő mezőt
        	itteni.deActivate();      
        
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