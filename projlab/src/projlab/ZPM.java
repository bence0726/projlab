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
	 * A karakter ZPM-számlálóját inkrementálja, 
	 * majd letörölteti magát a labirintusról.
	 */
	public void Activate(Karakter k) {
		System.out.println("ZPM.Activate():: Meghívom Karakter.addZPM() metódust...\n");
		k.addZPM();
		System.out.println("ZPM.Activate():: Megkérem a Labirintust, hogy töröljön engem...\n");
		Labirintus.RemoveElem(new ZPM());
		
	}

	@Override
	public void deActivate() {
		// TODO Auto-generated method stub
		
	}

    
}