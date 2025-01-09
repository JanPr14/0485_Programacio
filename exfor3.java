package programacio;
import java.util.Scanner;
public class exfor3{

	public static void main (String args[]) {

		int num=0;
				
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digues un número del 1 al 15");
		num = in.nextInt();
		
		//parell
		if (num%2==0) {
			for (int i=1;i<=num;i++) {
				for (int j=1;j<=i;j++) {
					System.out.print(j);
	
				}
				System.out.println();
				
				
			}
			
		}
		
		//imparell
		else {
			for (int i=num;i>=1;i--) {
				for (int j=1;j<=i;j++) {
					System.out.print(j);
	
				}
				System.out.println();
				
				
			}
		
		   }
		}
	}
