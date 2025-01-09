package programacio;
import java.util.Scanner;
public class exfor2{

	public static void main (String args[]) {

				
		Scanner in = new Scanner (System.in);
		
//Demana un número a l'usuari. Escriu la taula de multiplicar del 0 al 10.

		int num;
		
		System.out.println("Digues un numero del 0 al 10");
		num = in.nextInt();
		
		for (int i=0;i<=10;i++) {	
			
			System.out.println(num + " x " + i + " = " + num*i);
				
		}
	}
}