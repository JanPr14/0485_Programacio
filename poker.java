package programacio;
import java.util.Scanner;
public class poker{
	
		
		
	 public static void main(String[] args) {
	       
		 //variables
		 	int[][] baraja = new int[2][52];
	        int[] carta;
	        int valor = 1;
	        poker prog = new poker();
	        
	        for (int i = 0; i < 52; i++) {
	            baraja[0][i] = valor;  
	            valor++;    
	        }

	        //(0=Corazones, 1=Diamantes, 2=Tréboles, 3=Picas)
	        for (int i = 0; i < 52; i++) {
	            baraja[1][i] = i / 13; 
	        }

	        
	        for (int i = 0; i < 52; i++) {
	            System.out.println(baraja[0][i] + " de " + baraja[1][i]);
	        }
	        
	        //codi
	        carta = prog.donarcarta(baraja);
	        System.out.print(baraja[0][0]);
	        }

/*Metode per a repartir una carta
 * 
 * @
 * 
 * @return int[] una carta
 * 
 * 
 * */	        
	
	public int[] donarcarta(int baraja[][]) {
	    int[]carta = new int[2]; 
	    //codi	  
	    carta[0] = baraja[0][0]; 
	    carta[1] = baraja[0][1];
	    baraja[0][0] = 0;
	    
	    
	    while(baraja[0][0]==0) {
	    	
	    	baraja[0][0++];
		    //fer un while que quan sigui 0 no agafi aquesta carta

	    }

	    return carta;
	    
	        
	    
	}
	
	
	
	

}
	















	
	
	


