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
    public void setReachable(/*boolean val*/) {
    	System.out.println("setReachable():: Az elem elérhetővé/elérhetetlenné válik.");
    	//reachable=val;
    }

    /**
     * @return
     * @throws IOException 
     */
    public boolean getReachable(){
    	
    	System.out.println("getReachable():: Az elem elérhető? I/N ");
    	
    	try {
			answer=in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(answer.toUpperCase().equals("I"))
			return true;
		else
			return false;
        
    }

    /**
     * @return
     * @throws IOException 
     */
    public boolean getFireable(){
    	System.out.println("getFireable():: Az elem lőhető? I/N ");
    	
    	try {
			answer=in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(answer.toUpperCase().equals("I"))
			return true;
		else
			return false;
    }

    /**
     * @return
     * @throws IOException 
     */
    public boolean getPickable(){
    	System.out.println("getPickable():: Az elem felvehető? I/N ");
    	
    	try {
			answer=in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(answer.toUpperCase().equals("I"))
			return true;
		else
			return false;
    }

    /**
     * @return
     */
    public Terulet getPos() {
    	System.out.println("getPos():: Az elem helyzete: xyz");
        return new Terulet();
    }

    /**
     * @param val
     */
    public void setImage() {
    	System.out.println("setImage(File val):: Az elem képének változtatása: ");
    	//this.image=val;
    }

  /**
     * @return 
     * Itt File-nak kéne lennie, de szkeletonhoz csak Objectet írtunk, majd át kell írni.
     */
    public Object getImage() {
    	System.out.println("getImage():: Az elem képének lekérdezése: ");
    	
        return new Object();
    }
    /**
     * @param k
     */
    public abstract void Activate(Karakter k);

    /**
     * 
     */
    public abstract void deActivate();

}