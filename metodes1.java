package programacio;
import java.util.Scanner;
public class metodes1{
	
	public static void main(String args []) {
	
		
		
		metodes1 programa = new metodes1();
		int mes=0;
		Scanner teclat = new Scanner(System.in);

		System.out.println("Digues un mes de l'any (1-12)");
		mes = teclat.nextInt();
		
		System.out.println("El mes que has dit es el: " + programa.numero(mes));

	   
 	}
 
	public String numero (int mes) {
		String[] array=new String[12];
		
		array[0]= "Gener";
		array[1]= "Febrer";
		array[2]= "Març";
		array[3]= "Abril";
		array[4]= "Maig";
		array[5]= "Juny";
		array[6]= "Juliol";
		array[7]= "Agost";
		array[8]= "Septembre";
		array[9]= "Octubre";
		array[10]= "Novembre";
		array[11]= "Desmebre";
		

		
		String mes1 = array[mes-1];
		
		return mes1;
		
		

		
	}
	
}