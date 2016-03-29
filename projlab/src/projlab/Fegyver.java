package projlab;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 
 */
public class Fegyver {

    /**
     * Default constructor
     */
    public Fegyver() {
    }

    /**
     * 
     */
    private enum PortalStatus{};
 
    public void Fegyver() {
        

    }

    /**
     * @param dir 
     * @param szin 
     * @param kar
     */
    public static void Fire(Vektor dir, String szin, Karakter kar) {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("6.1 A lövedék eltalált valamit? I/N");
		String answer;
		try {
			answer = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(answer.toUpperCase().equals("I"))
		{
			System.out.println("6.2 Amit eltalált speciális fal volt? I/N");
				answer=in.readLine();
					if(answer.toUpperCase().equals("N"))
					{
				
					}
					else
						;
		}
		else
			;
    }
    
    public SpecFal getSargaP(){
    	return new SpecFal();
    }
    
    public SpecFal getKekP(){
    	return new SpecFal();
    }

}