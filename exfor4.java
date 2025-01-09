package programacio;
import java.util.Scanner;
public class exfor4{

	public static void main (String args[]) {

		int num=0;
				
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digues un número");
		num = in.nextInt();
			
	
		
		//linies
		for (int i=1;i<=num;i++) {
		//espais	
			for (int j=1;j<=(num-1);j++) {
				
			if (j<=num-i) {
				System.out.print("*");
			}	
		    else System.out.print(" ");
					
			}
			System.out.println();
		}
	
	
	
	}
}