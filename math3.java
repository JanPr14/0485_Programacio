package programacio;

import java.util.Scanner;

public class math3{
	
	public static void main (String []args) {
		
	int num=0;
	int entrada=0;
	
	Scanner in = new Scanner(System.in);
	
	num=(int)(Math.random()*50)+1;
	System.out.println(num);

	
	
			
	for(int i=0;i<=5;i++) {
	  System.out.println("Adivina un numero del 1 al 50");
	  entrada= in.nextInt();
		if(num==entrada) {
		System.out.println("Enhorabona, has adivinat");
		i=0;
		}
		
		else if (num>entrada) {
		System.out.println("El numero és major");
		num=(int)(Math.random()*50)+1;

		}
		
		else{
		System.out.println("El numero és menor");
		num=(int)(Math.random()*50)+1;

		}
	  }
	}
}