package programacio;

public class ex5{

	public static void main (String args[]) {
		
//primer fem un for que faigi una llista del 1 al 100		
		
		for (int i=0;i<=100;i++) {
			
//dintre del primer for fem un if per als numeros parells			
			if(i%2==0) {
			System.out.println("Numero parell: " + i + " - Múltiples de 5:");
//fem un altre for per a que calculi els multiples de 5 d'aquell numero
				for (int j=1;j<=i;j++) {
                    if (j%5==0) {
                        System.out.println(j);
                 }
			}
		}
			
			
			
//dintre del primer for fem un if per als numeros imparells			
			if(i%2!=0) {
			System.out.println("Numero imparell: " + i + " - Múltiples de 7:");
//fem un altre for per a que calculi els multiples de 7 d'aquell numero
				for (int j=1;j<=i;j++) {
                    if (j%7==0) {
                        System.out.println(j);
                        
                  }
			  }
		   }
		}
	}
}