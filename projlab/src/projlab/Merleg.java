package projlab;
import java.util.*;

/**
 * 
 */
public class Merleg extends Elem {

    /**
     * Default constructor
     */
    public Merleg(/*Elem E, Fal ajto*/) {
    	System.out.println("Merleg:: Létrejön egy merleg a megadott paraméterek alapján.");
    }

    /**
     * 
     */
    //private boolean aktiv;

    /**
     * 
     */
    //private Fal ajto;

	@Override
	public void Activate(Karakter k) {
		System.out.println("Merleg.Activate:: Aktiválódik a merleg.");
		Fal tmp=new Fal();
		tmp.setReachable();		
	}

	@Override
	public void deActivate() {
		System.out.println("Merleg.deActivate:: Deaktiválódik a merleg.");
		Fal tmp=new Fal();
		tmp.setReachable();
		
	}

}