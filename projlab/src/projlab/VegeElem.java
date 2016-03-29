package projlab;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 
 */
public class VegeElem extends Elem {

	static String answer;
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    /**
     * Default constructor
     */
    public VegeElem() {
    }

    /**
     * A VegeElem osztály Activate() metódusa úgy implementálja ezt 
     * a függvényt, hogy az operandusként kapott Karakter objektumnál
     * megnézi, hogy hány ZPM van. Aztán megkérdezi a Labirintust, hogy
     * a játék kezdetén mennyi ZPM volt. Ha megegyezik, megnyertük a játékot,
     * egyébként nincs esemény.
     * @author zsigatibor
     * @param Az a karakter, aki rálépett
     */
	public void Activate(Karakter k) {
		System.out.println("VegeElem.Activate():: Kedves Labirintus, mennyi ZPM volt összesen?");
		int labzpm = Labirintus.getZPM();
		System.out.println("VegeElem.Activate():: Kedves Karakter, mennyi ZPM van nálad?");
		int karzpm = k.getZPM();
		
		if(labzpm == karzpm)
			JatekMotor.EndGame(true);
		else return;
	}

	@Override
	public void deActivate() {
		// TODO Auto-generated method stub
		
	}


    
}