package projlab;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Menu {

	public static int n;
	public static void main(String[] args) throws Exception {
		
		Scanner menu = new Scanner(System.in);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String answer;
		n = 20;
		
		while(n!=0)
		{
		System.out.println("Kérlek válassz a következő menüpontok közül:\n"
				+ "1. Mozgás\n"
				+ "2. Ajtó nyitása\n"
				+ "3. Ajtó zárása\n"
				+ "4. Doboz felvétele\n"
				+ "5. Doboz lerakása\n"
				+ "6. Lövés\n"
				+ "7. Teleportálás\n"
				+ "8. ZPM felvétele\n"
				+ "9. Játék elvesztése\n"
				+ "10. Játék megnyerése\n");
		
		n=menu.nextInt();
		
		switch(n){
		case 1:
			Karakter.Move(new Vektor());
			break;		
		case 2:
			Karakter.Move(new Vektor());
			break;
		case 3:
			Karakter.Move(new Vektor());
			break;
		case 4:Karakter.Pick(new Vektor());
		
		case 5:System.out.println("5.1 A karakternél van doboz? I/N");
				answer=in.readLine();
				if(answer.toUpperCase().equals("I"))
				{
					System.out.println("5.2 A karakter előtt nincs semmi? I/N");
						answer=in.readLine();
							if(answer.toUpperCase().equals("N"))
							{
								System.out.println("5.3 Rakható rá doboz? I/N");
									answer=in.readLine();
										if(answer.toUpperCase().equals("I"))
										{
									
										}
										else
											;
							}
							else
								;
				}
				else
					;
				break;
		case 6: Fegyver.Fire(new Vektor(), "sarga", new Karakter());
				break;
		case 7:Karakter.Move(new Vektor());
				break;
		case 8:Karakter.Move(new Vektor());
				break;
		case 9:Karakter.Move(new Vektor());
				break;
		case 10:Karakter.Move(new Vektor());
				break;
		}
		
	}
	menu.close();

}
}
