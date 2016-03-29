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
		
		
		case 1:	System.out.println("1.1 A karakter előtt van valami?  I/N ");
				answer=in.readLine();	
				if(answer.toUpperCase().equals("I"))
				{
					System.out.println("1.2 Az a valami ráléphető?  I/N ");
					answer=in.readLine();
					if(answer.toUpperCase().equals("I"))
						;
					else
						;
				}
				else
					;
				break;
				
		case 2: System.out.println("2.1 A karakter mérlegre lépett a következő lépésnél?  I/N ");
				answer=in.readLine();
				if(answer.toUpperCase().equals("I"))
					;
				else
					;
				break;
				
		case 3:System.out.println("3.1 A karakter talál utat a mérlegről lelépve? I/N");
				answer=in.readLine();
					if(answer.toUpperCase().equals("I"))
						;
					else
						;
					break;
						
		case 4:System.out.println("4.1 A karakternél van doboz? I/N");
				answer=in.readLine();
				if(answer.toUpperCase().equals("N"))
				{
					System.out.println("4.2 Talál valamit a karakter maga előtt? I/N");
						answer=in.readLine();
							if(answer.toUpperCase().equals("I"))
							{
								System.out.println("4.3 Felvehető? I/N");
									answer=in.readLine();
										if(answer.toUpperCase().equals("I"))
										{
											System.out.println("4.4 Volt valami alatta? I/N");
												answer=in.readLine();
													if(answer.toUpperCase().equals("I"))
														;
													else
														;
										}
										else
											;
							}
							else
								;
				}
				else
					
				break;
		
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
		case 6:System.out.println("6.1 A lövedék eltalált valamit? I/N");
				answer=in.readLine();
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
				break;
		case 7:System.out.println("7.1 A karakter olyan speciális falra lépett amin van nyitott csillag kapu? I/N");
				answer=in.readLine();
				if(answer.toUpperCase().equals("I"))
				{
	
				}
				else
					;
				break;
		case 8:System.out.println("8.1 A karakter ZPM-re lépett? I/N");
				answer=in.readLine();
				if(answer.toUpperCase().equals("I"))
				{
					
				}
				else
					;
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
