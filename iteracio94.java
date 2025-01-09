package programacio;
import java.util.Scanner;
public class iteracio94{

	public static void main (String args[]) {

		int num=0;
		int column=0;
		int cont=0;
		
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digues un número del 1 al 15");
		num = in.nextInt();
		
		//parell
		if (num%2==0) {
			while(num>=0) {
				cont=0;
				while ((column)==(num+cont)) {
					cont++;
					System.out.println(column);
				}
				System.out.println(cont);
				num--;

			}
			
			
		}
		
		//imparell
		else {
			
			
			
		}
		
		
	}
}