package programacio;

import java.util.Scanner;



public class altressectors2 {

	public static void main (String args[]) {

		

		int num1=0;

		int num2=0;

		char caracter;

		int resultat=0;



		Scanner in = new Scanner (System.in);

		System.out.println("Digam la operacio amb el simbol");

		caracter = in.nextLine().charAt(0);

		System.out.println("Digam un numero");

		num1 = in.nextInt();

		System.out.println("Digam un altre numero");

		num2 = in.nextInt();

		

		switch (caracter) {

		case '+':

			resultat=num1+num2;

			System.out.println(resultat);

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

	}

}