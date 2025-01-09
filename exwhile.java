package programacio;

import java.util.Scanner;
public class exwhile{
public static void main (String args[]) {

	String nom;
	int num=1;
	
Scanner in = new Scanner (System.in);
	
System.out.println("Quin és el teu nom?");
nom = in.nextLine();

while (num<=5) {
	System.out.println(num + nom);
	num++;
	
  }
 }
}