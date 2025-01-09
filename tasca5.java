package programacio;
import java.util.Scanner;
public class tasca5{

	public static void main (String args[]) {

		//declarem la variable opció
				char opcio;
						
				//iniciem l'escanner
				Scanner in = new Scanner (System.in);
				
				
				//preguntem a l'usuari quina opció vol i la guardem en la variable opció
				 
				 
				System.out.println("Tria una opció (b,e,r,m,p)");
				opcio = in.nextLine().charAt(0);
				
				/**
				 * fem un switch amb 6 casos diferents, un amb cada opció
				 * també posarem un default per si l'opció triada és una altra lletra, mostrarem un altre missatge
				 */
				
				switch (opcio) {
				
				
				case 'm':
					System.out.println("Sr. o Sra.");
								
				case 'b':
					System.out.println("Benvingut-Benvinguda!");
				break;				
				
				case 'e':
					System.out.println("Sortida autoritzada”");
				break;
				
				case 'r':
					System.out.println("Retorn de claus");
				break;
				
				case 'p':
					System.out.println("Porta tancada");
				break;
				
						
				default: System.out.println("Gràcies per la seva visita");
				
				}
				
			}
		}