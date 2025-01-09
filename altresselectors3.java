package programacio;

import java.util.Scanner;

public class altresselectors3 {
	public static void  main (String [] args) {
	
	String dia;
	
Scanner in = new Scanner(System.in);

	System.out.println("Digues un dia de la setmana");
	dia = in.nextLine().toLowerCase();
	
	switch (dia) {
	case "dilluns":
		System.out.println("La sèrie d'avui és: The walking dead");
	break;
	case "dimarts":
		System.out.println("La sèrie d'avui és: Snowfall");
	break;
	case "dimecres":
		System.out.println("La sèrie d'avui és: Peaky Blinders");
	break;
	case "dijous":
		System.out.println("La sèrie d'avui és: Lost");
	break;
	case "divendres":
		System.out.println("La sèrie d'avui és: Padre de familia");
	break;
	case "dissabte":
		System.out.println("La sèrie d'avui és: Los Simpson");
	break;
	case "diumenge":
		System.out.println("La sèrie d'avui és: La que se avecina");
	default:
		System.out.println("L'entrada no és correcta");
		
	 }
	
   }
}