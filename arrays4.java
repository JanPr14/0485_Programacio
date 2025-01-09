package programacio;

public class arrays4{
	
	public static void main (String []args) {
	
	int[] dau=new int[5];
	int suma=0;
	
	for(int i=0;i<5;i++) {
	dau[i]=(int)(Math.random()*12)+1;	
		
	}
	
	System.out.println("Els teus numeros són:");
	
	for(int i=0;i<5;i++) {
	 
	 System.out.println(dau[i]);
		
	}
	
	suma = (dau[1]) + (dau [3]);
	System.out.println("La suma del 2n i el 4t lloc és: " + suma);
	
	
	}
}