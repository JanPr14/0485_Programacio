package programacio;
import java.util.Scanner;
public class penjat{
	
	public static void main (String [][] args) {
		
		penjat prog = new penjat();
		
		
		prog.demanarParaula();		
		
		 while (prog.intents() > 0 && !prog.guanyar()) {
	            prog.demanarLletra();
	            prog.comprovarLletra();
	            if (prog.guanyar()) {
	                prog.missatgeFinal();
	            }
	            
	            else if (prog.intents() <= 0) {
		            prog.intentsEsgotats();
		        }
	        }

		 
	    }
	
	
	

	/*Preguntar la paraula al usuari
	 * 
	 * 
	 *  @return String paraula entrada per el usuari
	 * 
	 */	
	
	public String demanarParaula() {
		
	}
	
	/**
	 * Converteix un String a un array de caràcters.
	 *
	 * @param paraula  La paraula a convertir.
	 * @return Un array de caràcters amb el contingut de la paraula.
	 */
	public char[] convertirParaulaAArray(String paraula) {
	    
	}

	
	
	/*Preguntar una lletra al usuari
	 * 
	 * @return char lletra entrada per el usuari
	 * 
	 */
	public char demanarLletra() {
		
	}
	
	/*comprovar si la lletra coincidex amb una de les lletres de la parauala
	 * 
	 * Cridar als metodes mostrarLletra i al mostrarLletraIncorrecta
	 * 
	 * @param String paraula que havia entrat el usuari
	 * @param char lletra que havia entrat el usuari
	 * @return int comprovar lletra, si la resposta es 0 la resposta es incorrecta i es resta un intent
	 *si la resposta es 1 vol dir que la lletra es correcta i no es resta cap intent
	 * 
	 * 
	 */
	public int comprovarLletra(char[] paraula, char lletra) {
	
	}
	
	
	/*si la lletra es correcta (ha sigut comprovada per l'anterior metode)
	 * es mostrarà la lletra en la posicio corresponent
	 * 
	 * 
	 */
	
	public void mostrarLletraCorrecta(char[] paraula) {
		
	}
	
	
	/*si la lletra es incorrecta (ha sigut comprovada per el metode comprovar lletra)
	 * es mostrarà la lletra 
	 * 
	 */
	public void mostrarLletraIncorrecta() {
		
	}
	
	 /*Comptador de intents
	 * 
	 * @return int intents numero de intents restants
	 */
	public int intents() {
		
	}
	
	/*
	 * boolean per a saber si l'usuari a guanyat
	 * (si les lletres que ha dit coincideixen amb la paraula)
	 * 
	 * cridar al metode missatgeFinal
	 * 
	 * @param char[] paraula
	 * @return true si l'usuari guanya
	 * 
	 */
	
	public boolean guanyar(char[] paraula) {
		
	}
	
	
	/*
	 * Si l'usuari endivina la paraula sortia un missatge dient felicitats
	 * 
	 * 
	 */
	public void missatgeFinal(char[] paraula) {
		
		
	}
	
	/*
	 * Si l'usuari esgota els intents sortia un missatge dient que ha perdut
	 * 
	 * 
	 */
	public void intentsEsgotats(char[] paraula) {
		
		
	}
		
}