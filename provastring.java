package programacio;

import java.util.Scanner;

public class provastring{
	
	public static void main (String []args) {
		
	String nom;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Digues un nom");
	nom = in.nextLine();
	
	System.out.println(nom.length());
	
	
	for(int i=0;i<nom.length();i++) {
		
		System.out.println(nom.charAt(i) + " ");
		
	}	
  }
}