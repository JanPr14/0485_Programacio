package programacio;

import java.util.Scanner;

public class arrays1{
	
	public static void main (String []args) {
	
	int[] num = new int[5];
	
	Scanner in = new Scanner(System.in);

	for(int i=0;i<5;i++) {
	 System.out.println("Digues un numero " + (i+1));
	 num[i] = in.nextInt();
	
	}
	
	System.out.println("Els teus numeros són:");
	
	for(int i=0;i<5;i++) {
	 
	 System.out.println(num[i]);
		
	}
		
	}
}	