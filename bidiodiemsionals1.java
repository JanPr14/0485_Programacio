package programacio;

import java.util.Scanner;

public class bidiodiemsionals1{
	
	public static void main (String [] args) {
		
		char [] [] array=new char [3] [3];
		
		array[0][0]='X';
		array[0][1]='0';
		array[0][2]='X';
		array[1][1]='0';
		array[2][1]='X';
		
		
		for(int y=0;y<3;y++){
			for(int x=0;x<3;x++) {
				System.out.print(array[y][x]);
				
				
			}
			System.out.println();
		}
	}
	
}