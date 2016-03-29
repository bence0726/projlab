package projlab;
import java.io.File;
import java.util.*;

/**
 * 
 */
public abstract class Elem {

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
    public Elem(File img, boolean reach, boolean fire, boolean pick, Terulet po) {
    	System.out.println("Elem:: Létrejön egy elem a megadott paraméterek alapján.");
    	this.fireable=fire;
    	this.image=img;
    	this.pickable=pick;
    	this.pos=po;
    	this.reachable=reach;
    	
    }

    /**
     * @param val
     */
    public void setReachable(boolean val) {
    	System.out.println("setReachable("+val+"):: Az elem elérhetővé/elérhetetlenné  válik.");
    	reachable=val;
    }

    /**
     * @return
     */
    public boolean getReachable() {
    	System.out.println("getReachable():: Az elem elérhetősége: " + reachable);
    	
        return reachable;
    }

    /**
     * @return
     */
    public boolean getFireable() {
    	System.out.println("getFireable():: Az elem lőhetősége: "+ fireable);
    	
        return fireable;
    }

    /**
     * @return
     */
    public boolean getPickable() {
    	System.out.println("getPickable():: Az elem felvehetősége: "+ pickable);
    	
        return pickable;
    }

    /**
     * @return
     */
    public Terulet getPos() {
    	System.out.println("getPos():: Az elem helyzete: "+ pos);
        return pos;
    }

    /**
     * @param val
     */
    public void setImage(File val) {
    	System.out.println("setImage(File val):: Az elem képének változtatása: ");
    	this.image=val;
    }

    /**
     * @return
     */
    public File getImage() {
    	System.out.println("getImage():: Az elem képének lekérdezése: ");
    	
        return image;
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