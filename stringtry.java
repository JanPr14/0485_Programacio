package programacio;

public class stringtry{

	public static void main (String args[]) {
		
		//iniciem una variable que despres la podem posar al metode per a indicar un valor
		int x=5;
		
		//creem l'objecte "nom", també és pot posar com al scanner
		String nom=("Hola nens i nenes");
		
		
		
		//llargada de caracters, començant per el 0
		System.out.println(nom.length());
		
		//diu la posició del primer caracter entre parentesis
		System.out.println(nom.indexOf('e'));
		
		//diu la posició del ultim caracter entre parentesis
		System.out.println(nom.lastIndexOf('e'));
		
		//diu la posició del caracter entre parentesis
		System.out.println(nom.charAt(x));
	
		//diu els caracters que hi han des d'on li diu (2 i 8)
		System.out.println(nom.substring(2,8));
	
		//posa tot en majuscules
		System.out.println(nom.toUpperCase());
	
		//posa tot en minuscules
		System.out.println(nom.toLowerCase());
	
	
	}
}
