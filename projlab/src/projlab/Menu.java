package projlab;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Menu {

	public static void main(String[] args) throws IOException {
		
		Scanner menu = new Scanner(System.in);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String answer;
		int n=20;
		
		while(n!=0)
		{
		System.out.println("K�rlek v�lassz a k�vetkez� men�pontok k�z�l:\n"
				+ "1. Mozg�s\n"
				+ "2. Ajt� nyit�sa\n"
				+ "3. Ajt� z�r�sa\n"
				+ "4. Doboz felv�tele\n"
				+ "5. Doboz lerak�sa\n"
				+ "6. L�v�s\n"
				+ "7. Teleport�l�s\n"
				+ "8. ZPM felv�tele\n"
				+ "9. J�t�k elveszt�se\n"
				+ "10. J�t�k megnyer�se\n");
		
		n=menu.nextInt();
		
		switch(n){
		
		
		case 1:	System.out.println("1.1 A karakter el�tt van valami?  I/N ");
				answer=in.readLine();	
				if(answer.toUpperCase().equals("I"))
				{
					System.out.println("1.2 Az a valami r�l�phet�?  I/N ");
					answer=in.readLine();
					if(answer.toUpperCase().equals("I"))
						;
					else
						;
				}
				else
					;
				break;
				
		case 2: System.out.println("2.1 A karakter m�rlegre l�pett a k�vetkez� l�p�sn�l?  I/N ");
				answer=in.readLine();
				if(answer.toUpperCase().equals("I"))
					;
				else
					;
				break;
				
		case 3:System.out.println("3.1 A karakter tal�l utat a m�rlegr�l lel�pve? I/N");
				answer=in.readLine();
					if(answer.toUpperCase().equals("I"))
						;
					else
						;
					break;
						
		case 4:System.out.println("4.1 A karaktern�l van doboz? I/N");
				answer=in.readLine();
				if(answer.toUpperCase().equals("N"))
				{
					System.out.println("4.2 Tal�l valamit a karakter maga el�tt? I/N");
						answer=in.readLine();
							if(answer.toUpperCase().equals("I"))
							{
								System.out.println("4.3 Felvehet�? I/N");
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
		
		case 5:System.out.println("5.1 A karaktern�l van doboz? I/N");
				answer=in.readLine();
				if(answer.toUpperCase().equals("I"))
				{
					System.out.println("5.2 A karakter el�tt nincs semmi? I/N");
						answer=in.readLine();
							if(answer.toUpperCase().equals("N"))
							{
								System.out.println("5.3 Rakhat� r� doboz? I/N");
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
		case 6:System.out.println("6.1 A l�ved�k eltal�lt valamit? I/N");
				answer=in.readLine();
				if(answer.toUpperCase().equals("I"))
				{
					System.out.println("6.2 Amit eltal�lt speci�lis fal volt? I/N");
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
		case 7:System.out.println("7.1 A karakter olyan speci�lis falra l�pett amin van nyitott csillag kapu? I/N");
				answer=in.readLine();
				if(answer.toUpperCase().equals("I"))
				{
	
				}
				else
					;
				break;
		case 8:System.out.println("8.1 A karakter ZPM-re l�pett? I/N");
				answer=in.readLine();
				if(answer.toUpperCase().equals("I"))
				{
					
				}
				else
					;
				break;
		case 9:System.out.println("9.1 A karakter szakad�kba l�pett? I/N");
				answer=in.readLine();
				if(answer.toUpperCase().equals("I"))
				{
			
				}
				else
					;
				break;
		case 10:System.out.println("10.1 A karakter a v�ge elemre ker�lt? I/N");
				answer=in.readLine();
				if(answer.toUpperCase().equals("I"))
				{
					System.out.println("10.2 N�la van az �sszes ZPM? I/N");
						answer=in.readLine();
						if(answer.toUpperCase().equals("I"))
						{
				
						}
						else
							;
				}
				else
					;
				break;
		
		}
		
	}
	menu.close();

}
}
