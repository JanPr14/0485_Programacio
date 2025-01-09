package programacio;
public class metodes{
	
	public static void main(String args []) {
	
		metodes programa = new metodes();
		
		programa.print(programa.suma(8f, 4f),programa.divisio(8f, 4f));
		
		

    }
	
	public float suma (float num1, float num2) {
		
		float total=num1+num2;
		
		return total;
 	}
	
	public float divisio (float num1, float num2) {
		
		float resultat=num1/num2;
		
		return resultat;
 	}
	
	public void print (float sum, float div) {
		
		System.out.println(sum +" " + div);
		
		
 	}
 
}