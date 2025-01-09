package programacio;
import java.util.Scanner;
public class ex1{

	public static void main (String args[]) {
		//declarem la variable numero
		int num=0;
		
		//iniciem l'escanner
		Scanner in = new Scanner (System.in);
		
		//preguntem a l'usuari un numero i el guardem en la variable num
		System.out.println("Digues un numero");
		num = in.nextInt();
		
		
		//fem un while que segeuixi preguntant fins a que compleixi els 3 requisits
		while (num%2!=0 || num>=0 || num%7!=0) {
			System.out.println("Digues un numero");
			num = in.nextInt();
			
		}
		//imprimim en pantalla que el numero compleix tots els requisists
		System.out.println("El numero és parell, negatiu i multiple de 7");
		
	}
}