package programacio;
import java.util.Scanner;
public class exdowhile2 {

	public static void main (String args[]) {

		int premi;
		int resultat=0;
		int anys=1;
		
		
Scanner in = new Scanner(System.in);

System.out.println("Quants diners vols regalar?");
premi = in.nextInt();

	resultat=premi*2;
	
	System.out.println("El premi és:" + resultat);
	do {
		
	resultat=resultat+resultat;
	   if(resultat>=1000) {
		System.out.println("El premi ha passat de 1000€");
	   }
	   else {
		System.out.println("El premi és:" + resultat);
	   }
		anys++;	
		
	} while (resultat<1000);		
	
	System.out.println("Han passat " + anys + " anys");
	System.out.println("Guanyara:" + resultat + " €");
 }
}