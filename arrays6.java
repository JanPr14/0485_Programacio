package programacio;

import java.util.Scanner;

public class arrays6{
	
	public static void main (String []args) {
	
	char[] ciutat;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Digues una ciutat");
	ciutat = in.nextLine().toCharArray();
	
	System.out.println("La ciutat té: " + ciutat.length + " caracters");

	
	for(int i=ciutat.length;i>0;i--) {
		System.out.print(ciutat[i-1]);
		
	}
	
	
	}
}