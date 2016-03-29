package projlab;
import java.util.*;

/**
 * 
 */
public class ZPM extends Elem {

    /**
     * Default constructor
     */
    public ZPM() {
    }

	/**
	 * 
	 */
	public void Activate(Karakter k) {
		System.out.println("ZPM.Activate():: Meghívom Karakter.addZPM() metódust...\n");
		k.addZPM();
	}

	@Override
	public void deActivate() {
		// TODO Auto-generated method stub
		
	}

    
}