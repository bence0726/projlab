package projlab;
import java.util.*;

/**
 * 
 */
public class Doboz extends Elem {

    /**
     * Default constructor
     */
    public Doboz() {
    	System.out.println("Doboz konstruktor");
    }

    /**
     * @param k
     */
    @Override
    public void Activate(Karakter k) {
    	System.out.println("Doboz.Activate: A karakter felveszi a dobozt.");
        
    }

    
    @Override
    public void deActivate(){
    	System.out.println("Doboz.Activate: A karakter leteszi a dobozt.");
        
    }
    }

