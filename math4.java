package programacio;

import java.util.Scanner;

public class math4{
	
	public static void main (String []args) {
		
	double num=0;
	double resultat=0;
	double mitjana=0;
	
	Scanner in = new Scanner(System.in);
	
	for(int i=0;i<5;i++) {
		System.out.println("Digues un numero real");
		num=in.nextDouble();
		resultat=num+resultat;
		
	}
	mitjana=resultat/5;

	System.out.println("La mitjana és: " + mitjana);
	
	
	System.out.println("La mitjana arrodonint cap a baix és: " + Math.floor(mitjana));

	;
	System.out.println("La mitjana arrodonint cap amunt és: " + Math.ceil(mitjana));

	
	}
}