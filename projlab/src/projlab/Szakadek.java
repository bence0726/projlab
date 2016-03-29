package projlab;
import java.util.*;

/**
 * 
 */
public class Szakadek extends Elem {

    /**
     * Default constructor
     */
    public Szakadek() {
    }

	@Override
	public void Activate(Karakter k) {
		System.out.println("Szakadék.Activate():: Meghaltál!\n");		
	}

	@Override
	public void deActivate() {
		// TODO Auto-generated method stub
		
	}

    
}