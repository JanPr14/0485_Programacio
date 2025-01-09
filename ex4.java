package programacio;
import java.util.Scanner;
public class ex4{

	public static void main (String args[]) {
		//declarem la variable numero i multiplicar que la triarà l'usuari
		
		int num=2;
		int multiplicar=0;

Scanner in = new Scanner(System.in);

		/*
		 * fem un do while que faigi la iteració mentres el numero que digui l'usuari sigui plural
		 * a dintre la iteració preguntara a l'usuari un numero i és multplicara aquest numero per el numero inicial	
		 */
		do {
			System.out.println("Digues un numero del 1 al 10 per a la multiplicació");
			multiplicar = in.nextInt();	
			num=num*multiplicar;
			
		}while(multiplicar%2==0);
		//per ultim imprimim 
		System.out.println("Has posat un numero imparell, el resultat és:" + num);
		
	}
}