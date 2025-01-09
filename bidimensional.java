package programacio;

import java.util.Scanner;

public class bidimensional{
	
	public static void main (String [] args) {
		
		int [] [] array=new int [5] [4];
		
		array[0][0]=1;
		
		for(int y=0;y<5;y++){
			for(int x=0;x<4;x++) {
				System.out.print(array[y][x]);
				
				
			}
			System.out.println();
		}
	}
	
}