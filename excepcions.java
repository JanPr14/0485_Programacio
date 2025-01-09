package programacio;
import java.util.Scanner;
public class excepcions {
public static void main(String args[]) {

    int numero = 0;
    boolean error = true;
    
    Scanner in = new Scanner(System.in);
	  while (error) {
    	try{
	    System.out.println("Digues un numero");
	    numero = in.nextInt();
	    error=false;
	    }
	    catch (Exception e){
	        System.out.println("Excepció-->"+ e);
	        in.nextLine();
	    }
	  }
	 	    
	    if (numero>=1) {
	        System.out.println ("el teu numero és positiu");
	    }
	    else if (numero<0) {
	        System.out.println ("el teu numero és negatiu");
	    }
	    else  if (numero==0){
	        System.out.println ("0 no és ni positiu ni negatiu");
     }
   }
}

