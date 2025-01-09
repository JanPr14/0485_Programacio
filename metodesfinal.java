package programacio;

import java.util.Scanner;

public class metodesfinal{
	
	public static void main (String [] args) {
		
	
		String frase="Frase de mostra per a poder fer proves";
		
		boolean flag=false;
		int opcio=0;
		metodesfinal prog= new metodesfinal();
		
		while(true) {
			opcio=prog.menu();
			
			switch(opcio) {
			
			case 1:
				frase=prog.demanarFrase();	
				break;
			case 2:
				System.out.print("La frase és: ");
				System.out.println(frase);
				System.out.println();
				break;


			case 3:
				System.out.println("Hi ha " + prog.numParaules(frase) + " paraules a la frase");
				break;
			case 4:
				System.out.println("Hi ha " + prog.numVocals(frase) + " vocals a la frase");
				break;
			case 5:
				System.out.println(prog.restaLletra(frase));
				break;
			case 6:
				System.out.println(prog.restaParaula(frase));

				break;
			case 7:
				System.out.println(prog.capgiraFrase(frase));

				break;
			case 8:
				prog.mostraCapgirat(frase);
				break;
			default:
				System.out.println("T'has passat, aquesta opció no existeix");
			
			
			
			}
			
		}
		
		
		
	}
	
	public int menu () {
		int opc;
		Scanner in = new Scanner(System.in);

		
		System.out.println("Que vols fer?");
		System.out.println("Opció 1: Entrar una frase");
		System.out.println("Opció 2: Mostrar l’estat de la Frase");
		System.out.println("Opció 3: Mostrar el número de paraules que conté la frase");
		System.out.println("Opció 4: Mostrar el número de vocals que conté la frase");
		System.out.println("Opció 5: Eliminar l’última lletra de tota la frase");
		System.out.println("Opció 6: Eliminar l’última paraula de la frase");
		System.out.println("Opció 7: Capgirar tota la frase");
		System.out.println("Opció 8: Capgirar cada paraula per separat de la frase.");

		opc = in.nextInt();
		
		return opc;
		
	}
	
	public String demanarFrase() {
		Scanner teclat = new Scanner(System.in);
		String frase;
		
		
		System.out.println("Escriu la nova frase:");
		frase = teclat.nextLine();
		
		return frase;

	}
	
	public int numParaules(String frase) {
		
		int espais=0;
		
		for(int i=0; i<frase.length();i++) {
			if (frase.charAt(i)==' ') {
				espais++;
				
			}
			
		}
		
		return espais+1;
		
		
	}
	
	public int numVocals(String frase) {

		
		int vocals=0;
	
	frase=frase.toLowerCase();
	for(int i=0; i<frase.length();i++) {
			if (frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u') {
				vocals++;
				
			}
			
		}
		
		return vocals;
		
		
	}
	
	public String restaLletra(String frase) {
		
		frase=frase.substring(0, frase.length()-1);
		
		return frase;
		
	}
	
	public String restaParaula(String frase) {
		
		int pos=0;
		
		pos=frase.lastIndexOf(' ');
		frase=frase.substring(0, pos);
		
		return frase;
	}

	public String capgiraFrase (String frase) {
		
		String nova="";
		
		for (int i=frase.length()-1;i>=0;i--) {
			
			nova=nova+frase.charAt(i);
			
		}
		
		return nova;
	}
	
	public void mostraCapgirat (String frase) {
		
	String paraula="";
		
		for (int i=0;i<frase.length();i++) {
			
			if(frase.charAt(i)!=' ') {
				paraula=paraula+frase.charAt(i);
			}
			
			else {
				System.out.print(capgiraFrase(paraula)+ " ");
				paraula="";
			}
		
		}
		System.out.println(capgiraFrase(paraula));
		
		
	}
}