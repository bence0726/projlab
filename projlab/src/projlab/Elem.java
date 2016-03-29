package projlab;
import java.io.File;
import java.util.*;

/**
 * 
 */
public abstract class Elem {

    /**
     * Default constructor
     */
    public Elem() {
    }

    /**
     * 
     */
    private boolean reachable;

    /**
     * 
     */
    private boolean fireable;

    /**
     * 
     */
    private boolean pickable;

    /**
     * 
     */
    private File image;


    /**
     * 
     */
    private Terulet pos;

    /**
     * @param img
     */
    public void Elem(File img) {
        // TODO implement here
    }

    /**
     * @param val
     */
    public void setReachable(boolean val) {
        // TODO implement here
    }

    /**
     * @return
     */
    public boolean getReachable() {
        // TODO implement here
        return true;
    }

    /**
     * @return
     */
    public boolean getFireable() {
        // TODO implement here
        return true;
    }

    /**
     * @return
     */
    public boolean getPickable() {
        // TODO implement here
        return true;
    }

    /**
     * @return
     */
    public Terulet getPos() {
        // TODO implement here
        return null;
    }

    /**
     * @param val
     */
    public void setImage(File val) {
        // TODO implement here
    }

    /**
     * @return
     */
    public File getImage() {
        // TODO implement here
        return null;
    }

    /**
     * @param k
     */
    public abstract void Activate(Karakter k) throws Exception;

    /**
     * 
     */
    public abstract void deActivate();

}