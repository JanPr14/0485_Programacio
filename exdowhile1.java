package programacio;
import java.util.Scanner;
public class exdowhile1 {

	public static void main (String args[]) {

		int num1;
		int resultat=0;
		
		
	
	Scanner in = new Scanner(System.in);
	
				
	do  {
		 				
			System.out.println("Suma de numeros");
			
			System.out.println("Digues un numero");
			num1 = in.nextInt();
			
			resultat=resultat+num1;
			
					
		} while (num1!=0);		
	System.out.println("El resultat és:" + resultat);
			
 }
}