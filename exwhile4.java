package programacio;
import java.util.Scanner;
public class exwhile4 {

	public static void main (String args[]) {

		int num1=0;

		int num2=0;

		char caracter;

		int resultat=0;
		
		char repetir;
		
		//s'haura de fer un boolean contiunuar

		Scanner in = new Scanner (System.in);

		System.out.println("Prem qualsevol tecla per a continuar o prem Q per a sortir");
		repetir = in.nextLine().charAt(0);
		
	while(repetir!='q') {
		System.out.println("Digam la operacio amb el simbol");
		caracter = in.nextLine().charAt(0);

		System.out.println("Digam un numero");
		num1 = in.nextInt();
		in.nextLine();

		System.out.println("Digam un altre numero");
		num2 = in.nextInt();
		in.nextLine();

		

		switch (caracter) {

		case '+':

			resultat=num1+num2;

			System.out.println("La suma de Num1 y Num2 és:" + resultat);

		break;

		case '-':

			resultat=num1-num2;

			System.out.println("La resta de Num1 y Num2 és:" + resultat);

		break;

		case '*':

			resultat=num1*num2;

			System.out.println("La multiplicacio de Num1 y Num2 és:" + resultat);

		break;

		case '/':

			resultat=num1/num2;

			System.out.println("La divisio de Num1 y Num2 és:" + resultat);

		break;

		default : System.out.println("No es correcte");
			 }
		System.out.println("Prem qualsevol tecla per a repetir o prem Q per a sortir");
		repetir = in.nextLine().charAt(0);
		}
			
	}

}