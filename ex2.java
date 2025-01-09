package programacio;

public class ex2{

	public static void main(String[] args) {
		// Inicialitzem la variable 'sequencia' amb el valor 1
		        int sequencia = 1;
		// Inicialitzem la variable 'numero' amb el valor 0
		        int numero = 0;       
		        
		// Fem un bucle que continua mentre 'sequencia' sigui menor o igual a 100
		        while (sequencia <= 100) {
		// Incremetem el valor de 'sequencia' en 1
		            sequencia++;
		            
		// Comprovem si 'sequencia' és múltiple de 15
		            if (sequencia % 15 == 0) {
		// Si és múltiple de 15, inicialitzem 'numero' a 3
		                numero = 3;
		                
		// Bucle intern per mostrar els múltiples de 3 fins a arribar a 'sequencia'
		                while (numero <= sequencia) {
		// Mostrem el valor de 'numero' i el separem amb un espai
		                    System.out.print(" " + numero);
		// Incremetem 'numero' en 3
		                    numero += 3;
		                }
		// Quan acaba el bucle intern, fem un salt de línia
		                System.out.println();
		            }
		        }    
		    }
		}