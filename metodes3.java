package programacio;

import java.util.Scanner;

public class metodes3{
	
	public static void main (String [] args) {
		metodes3 programa= new metodes3();
		String arraymain [][] = new String [4] [4];
		arraymain[0][0] = "ID";
		arraymain[0][1] = "Marca";
		arraymain[0][2] = "Model";
		arraymain[0][3] = "Voltatge Font";
		
		arraymain=programa.taula(arraymain);
		programa.printar(arraymain);
	
	}
	
	public String[][] taula(String[][] array) {
		Scanner in = new Scanner(System.in);

		for(int i=1;i<4;i++) {
			
			System.out.println("Introdueix la ID");
			array[i][0]=in.nextLine();
			
			System.out.println("Introdueix la Marca");
			array[i][1]=in.nextLine();
			
			System.out.println("Introdueix el model");
			array[i][2]=in.nextLine();
			
			System.out.println("Introdueix el voltatge font");
			array[i][3]=in.nextLine();
				
			
		}
		
		return array;
		
	}
	
	public void printar(String[][] arrayprint) {
		for(int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				
				
				System.out.print(arrayprint[i][j] + " ");
				
				if(j==3) {
					System.out.println();
					
				}
			}
		}
		
	
	}
	
}