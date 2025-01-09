package programacio;

import java.util.Scanner;

public class bidimensional2{
	
	public static void main (String [] args) {
		
		int num=0;
		int [] [] array;
		
	
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Digues un numero del 0 a 10");
		num =in.nextInt();
		

		
		
		array = new int [num] [num];
		
		
		
		for(int x=0;x<num;x++){
			for(int y=0;y<num;y++) {
				if(y==0 || x==0 ){
					array[x][y]=1;
				
				}
				
				else if(y==num-1 || x==num-1) {
					array[x][y]=1;

					
				}
				
				else {
					
					array[x][y]=0;

					}
				
								
				System.out.print(array[x][y]);
				
				
			}
			System.out.println();
		}
	}
	
}