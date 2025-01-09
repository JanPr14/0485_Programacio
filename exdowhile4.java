package programacio;
import java.util.Scanner;
public class exdowhile4{

	public static void main (String args[]) {

		final int CONSTANT=33;
		int numero=0;
		int intents;
		int cont=1;		

		Scanner in = new Scanner (System.in);
		
		System.out.println("Has d'adivinar un numero del 1 al 100, quants intents vols tenir?");
		intents = in.nextInt();
		
				
		do {
			
			System.out.println("Adivina el numero");
			numero = in.nextInt();
			
		if (numero==CONSTANT)System.out.println("Has adivinat el numero!");
			
		else if (numero<CONSTANT)System.out.println("Es un numero més gran");	
		
		else if (numero>CONSTANT)System.out.println("Es un numero més petit");
			
		else System.out.println("Introdueix un numero");
		
		cont++;
		} while (intents>cont);
		System.out.println("S'han acabat els intents");
	}
}