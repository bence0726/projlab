package projlab;
import java.util.*;

/**
 * 
 */
public class SpecFal extends Elem {

    /**
     * Default constructor
     */
    public SpecFal() {
    }

    /**
     * 
     */
    private Vektor irany;

	/**
	 * A függvény abból a kapuból amibe beléptünk a másikba helyezi a karaktert.
	 */
	public void Activate(Karakter k) {
		if (this == k.getFegyver().getSargaP()){                     //Ha sárga kapuba léptünk
			k.setPos(k.getFegyver().getSargaP().getPos().getKezd()); //áthelyez a kékbe
			System.out.println("Teleportálás kékből sárgába");
		}else{														//egyébként ha kékbe
			k.setPos(k.getFegyver().getKekP().getPos().getKezd());  //áthelyez a sárgába
			System.out.println("Teleportálás sárgából kékbe");		
		}
	}

	@Override
	public void deActivate() {
		// TODO Auto-generated method stub
	}
}