package programacio;
import java.util.Scanner;
public class iteracio92{

	public static void main (String args[]) {

		int num;
		int flag=-1;

		Scanner in = new Scanner (System.in);
		
		
		do {
			
			System.out.println("Digues un numero");
			num = in.nextInt();
			
			if (num%2==0) {
			flag++;
			}
		}while (num>0);
		
		System.out.println("Has dit " + flag + " numeros");

	}
}