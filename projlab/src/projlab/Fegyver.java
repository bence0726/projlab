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
     * @param dir 
     * @param szin 
     * @param kar
     */
    public static void Fire(Vektor dir, String szin, Karakter kar) {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	Menu.n=10;
    	Elem elem = Labirintus.WhatsThere(new Terulet());
    	
		String answer;
		try {
			System.out.println("Idaig eljutottam");
			answer = in.readLine();
			if(answer.toUpperCase().equals("I"))
			{
				System.out.println("Idaig is");
				if (elem.getReachable() && elem.getFireable())
				{System.out.println("Tehát a lövedék speciális falat talált el");
					elem.setReachable(true);
					}
						else System.out.println("Az elem nem spec. falat talált el így nem tudott kaput nyitni.");
							;
			}
			else System.out.println("Sajnos nem talált el semmit.");
				;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
    
    public SpecFal getSargaP(){
    	return new SpecFal();
    }
    
    public SpecFal getKekP(){
    	return new SpecFal();
    }

}