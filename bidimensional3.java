package programacio;

import java.util.Scanner;

public class bidimensional3{
	
	public static void main (String [] args) {
		
		int num=0;
		int num2=0;
		int [] array;
		int [] array2;
		int [] [] arrayfinal;
	
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Digues un numero");
		num =in.nextInt();
		
		System.out.println("Digues un altre numero");
		num2 =in.nextInt();
		
		array = new int [num];
		array2 = new int [num2];
		
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*50)+1;
			
			
		}
		
		for(int i=0;i<array2.length;i++) {
			array2[i]=(int)(Math.random()*50)+1;
			
			
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
			
		}
		
		System.out.println();
		
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i] + " ");
			
		}
		
		
		if(num>num2) {
		arrayfinal = new int [num] [2];
		}
		
		else{
		arrayfinal = new int [num2] [2];
	
		}
		
		
		for(int i=0;i<arrayfinal.length;i++) {
		
		if(i<num) {	
		arrayfinal[i][1]=array[i];
		}
		
		}
		for(int i=0;i<arrayfinal.length;i++) {
		if(i<num2) {	
		arrayfinal[i][2]=array2[i];
			    }
			
			}
		
		
		for(int x=0;x<arrayfinal.length;x++){
			for(int y=0;y<2;y++) {
				System.out.print(arrayfinal[x][y]);
				
				
			}
			System.out.println();
		
		}
		
	}
}
