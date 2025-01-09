package programacio;

import java.util.Scanner;

public class arrays2{
	
	public static void main (String []args) {
	
	int[] num = new int[12];
	int numero=0;
	Scanner in = new Scanner(System.in);
	
	System.out.println("Digues un numero");
	numero = in.nextInt();
	
	for(int i=0;i<12;i++) {
		
		numero=numero*2;
		num [i]=numero;
		
	}
	
	System.out.println("Els teus numeros són:");
	
		for(int x=0;x<12;x++) {
	 
			System.out.println(num[x]);
		
	}
	}
}