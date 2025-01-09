package programacio;
import java.util.Scanner;
public class iteracio93{

	public static void main (String args[]) {

		String passwd;
		String passwd2;

		Scanner in = new Scanner (System.in);
		
			
		
		do {
				
				System.out.println("Introdueix una contrasenya");
				passwd = in.nextLine();
				System.out.println("Introdueix un altre cop la contrasenya");
				passwd2 = in.nextLine();
				
				if(passwd!=passwd2) {
					System.out.println("Les contrasenyes no coincideixen");

					System.out.println("Introdueix una contrasenya");
					passwd = in.nextLine();
					System.out.println("Introdueix un altre cop la contrasenya");
					passwd2 = in.nextLine();
					
				}
				else	System.out.println("Les contrasenyes coincideixen");
			}while (passwd==passwd2);
				
					
		}
	}
