package programacio;
import java.util.Scanner;
public class iteracio9{

	public static void main (String args[]) {

		float saldo=3000;
		float diners;
		char opcio;

		Scanner in = new Scanner (System.in);
		
		System.out.println("El teu saldo actual és de " + saldo + "€");
		
		
		System.out.println("Quina acció vols fer?");
		System.out.println("Opció 1: Veure saldo actual");
		System.out.println("Opció 2: Afegir diners");
		System.out.println("Opció 3: Treure diners");
		System.out.println("Opció 4: Sortir del caixer");
		opcio= in.nextLine().charAt(0);
		
					
			switch (opcio) {
			
				case '1':
					System.out.println("El teu saldo actual és de " + saldo + "€");
	
				break;
			
				case '2':
					System.out.println("Quants diners vols afegir?");
					diners = in.nextFloat();
					saldo=saldo+diners;
					System.out.println("El teu saldo actual és de " + saldo + "€");
				
				break;
				
				case '3':
					System.out.println("Quants diners vols treure?");
					diners = in.nextFloat();
						if (diners<saldo) {
						saldo=saldo-diners;
						System.out.println("El teu saldo actual és de " + saldo + "€");
						}
						
						else {
							System.out.println("Saldo insuficient");

						}
					
				break;
				
				case '4':
					System.out.println("Has sortit del caixer");
				
				break;
				
			
			
		}
	}
}
		