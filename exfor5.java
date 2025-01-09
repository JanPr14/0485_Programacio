package programacio;
import java.util.Scanner;
public class exfor5{

	public static void main (String args[]) {

		int num=0;
				
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digues l'alçada del quadrat");
		num = in.nextInt();
			
	
		
		//alçada
		for (int i=1;i<=num;i++) {
			//amplada
			for (int j=1;j<=num;j++) {
				
			
				if((i==1) || (i==num)) {
				System.out.print("1");	
				}
				else if ((j==1) || (j==num)) {
					System.out.print("1");	
					}
				else {
					System.out.print(" ");
				 }
				}
				
		System.out.println();	
		}
	}
}