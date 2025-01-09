package programacio;

public class arrays5{
	
	public static void main (String []args) {
	
	int[] dau=new int[50];
	int suma=0;
	int cont=0;
	
	
	for(int i=0;i<50;i++) {
	dau[i]=(int)(Math.random()*6)+1;	
	suma=suma+dau[i];	
	}
	
	System.out.println("La suma de les 50 tirades és: " + suma);

	if(suma%2==0) {
		System.out.println("El numero és parell");
	
	}
	else {
		System.out.println("El numero és imparell");

	}
	
	for(int i=0;i<50;i++) {
		if(dau[i]== 5 || dau[i]==6) {
			cont++;
			
		}
		
	}
	
	System.out.println("Ha sortit un 5 o un 6: " + cont + " cops");

	
	
	
}
}