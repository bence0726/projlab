package projlab;
import java.io.File;
import java.util.*;

/**
 * 
 */
public class Karakter {

    /**
     * Default constructor
     */
    public Karakter() {
    }

    /**
     * 
     */
    private int ZPM;

    /**
     * 
     */
    private int PickRange;

    /**
     * 
     */
    private boolean GotBox;

    /**
     * 
     */
    private Elem LastMove;






    /**
     * 
     */
    private Fegyver fegyver;

    /**
     * 
     */
    private Labirintus lab;

    /**
     * 
     */
    private Terulet pos;

    /**
     * @param lab 
     * @param img
     */
    public void Karakter(Labirintus lab, File img) {
        // TODO implement here
    }

    /**
     * @param val
     */
    public void setPos(Vektor val) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Terulet getPos() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void addZPM() {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getZPM() {
        // TODO implement here
        return 0;
    }

    /**
     * 
     */
    public void changeBoxVal() {
        // TODO implement here
    }

    /**
     * @param dir
     */
    public void Move(Vektor dir) {
        // TODO implement here
    }

    /**
     * @param dir
     */
    public void Pick(Vektor dir) {
        // TODO implement here
    }

    /**
     * @param dir
     */
    public void Drop(Vektor dir) {
        // TODO implement here
    }

}