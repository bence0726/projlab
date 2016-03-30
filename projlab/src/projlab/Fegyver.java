package projlab;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 
 */
public class Fegyver {

    /**
     * Default constructor
     */
    public Fegyver() {
    }

    /**
     * 
     */
    private enum PortalStatus{};
 
    public void Fegyver() {
        

    }

    /**
     * Megvalósítja a kapuk nyitását.
     * @param dir 
     * @param szin 
     * @param kar
     */
    public static void Fire(Vektor dir, String szin, Karakter kar) {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	Elem elem=null;
    	while (elem == null)
    		elem = Labirintus.WhatsThere(new Terulet());
				if (elem.getReachable() && elem.getFireable())
				{System.out.println("Tehát a lövedék speciális falat talált el,a portál létrejött az adott színnel");
					elem.setReachable(true);
					}
						else System.out.println("Az elem nem spec. falat talált el így nem tudott kaput nyitni.");
		
    }
    
    public SpecFal getSargaP(){
    	return new SpecFal();
    }
    
    public SpecFal getKekP(){
    	return new SpecFal();
    }

}