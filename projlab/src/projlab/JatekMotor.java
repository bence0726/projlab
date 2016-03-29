package projlab;
import java.util.*;

/**
 * 
 */
public class JatekMotor {

    /**
     * Default constructor
     */
    public JatekMotor() {
    }



    /**
     * 
     */
    private Karakter kar;

    /**
     * 
     */
    private Labirintus lab;




    /**
     * 
     */
    public void JatekMotor() {
        // TODO implement here
    }

    /**
     * 
     */
    public void startGame() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Reset() {
        // TODO implement here
    }

    /**
     * @param nyert_e - nyertünk?
     * 
     */
    public static void EndGame(boolean nyert_e) {
        if(nyert_e)
        	System.out.println("JatekMotor.EndGame():: Gratulálok, nyertél!");
        else
        	System.out.println("JatekMotor.EndGame():: Sajnálom, vesztettél!");
    }

}