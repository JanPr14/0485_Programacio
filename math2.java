package programacio;

public class math2{
	
	public static void main (String []args) {
		
		int dau1=0;
		int i=0;	
		int cont=0;
		
		//do {
		//dau1=(int)(Math.random()*12)+1;
		//System.out.println("El numero és: " + dau1);
		//i++;
		//}while(i<=6);
		
		
		for(int x=0;x<=24;x++) {
			dau1=(int)(Math.random()*12)+1;	
			System.out.print(" " + dau1);

				if(dau1==1) {
					cont++;
			}	
			
		}
		
		
		if(cont==2) {
			System.out.println(" Compleix la norma de 1 cada 12 tirades");

		}
		
		else if(cont<2) {
			System.out.println(" Compleix la norma pitjor");

		}
		
		else {
			System.out.println(" Compleix la norma millor");

		}
			
	}
}