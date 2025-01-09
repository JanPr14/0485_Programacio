package programacio;
import java.util.Scanner;
public class tasca4{

	public static void main (String args[]) {

		//declarem la variable opció
		byte opcio=0;
				
		//iniciem l'escanner
		Scanner in = new Scanner (System.in);
		
		
		//preguntem a l'usuari quina opció vol i la guardem en la variable opció
		 
		 
		System.out.println("Tria una opció del 1 al 6");
		opcio = in.nextByte();
		
		/**
		 * fem un switch amb 6 casos diferents, un amb cada opció
		 * també posarem un default per si l'opció triada no és del 1 al 6
		 */
		
		switch (opcio) {
		
		case 1:
			System.out.println("Has triat l'opció Nº1");
		break;
		
		case 2:
			System.out.println("Has triat l'opció Nº2");
		break;
		
		case 3:
			System.out.println("Has triat l'opció Nº3");
		break;
		
		case 4:
			System.out.println("Has triat l'opció Nº4");
		break;
		
		case 5:
			System.out.println("Has triat l'opció Nº5");
		break;
		
		case 6:
			System.out.println("Has triat l'opció Nº6");
		break;
		
		default: System.out.println("L'opció triada no és correcta");
		
		}
		
	}
}