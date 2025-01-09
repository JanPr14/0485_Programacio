package programacio;

import java.util.Scanner;

public class metode3{
	
	public static void main (String []args) {
		
	String nom;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Digues un nom");
	nom = in.nextLine();
	
		
	for(int i=nom.length() -1;i>=0;i--){
		System.out.println(nom.charAt(i));
		
	}
	
	
	
	
	}
	
	
}
