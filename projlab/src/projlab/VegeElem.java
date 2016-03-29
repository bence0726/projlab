package projlab;
import java.io.BufferedReader;
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

	public void Activate(Karakter k) throws IOException {
		System.out.println("VegeElem.Activate():: Nála van az összes ZPM? I/N");
		answer=in.readLine();
		if(answer.toUpperCase().equals("I"))
			System.out.println("VegeElem.Activate():: Gratulálok, nyertél!");
		else return;
	}

	@Override
	public void deActivate() {
		// TODO Auto-generated method stub
		
	}


    
}