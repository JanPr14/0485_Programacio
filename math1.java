package programacio;

public class math1{
	
	public static void main (String []args) {
		
		int dau1=0;
		int dau2=0;
		
		dau1=(int)(Math.random()*6)+1;
		
		dau2=(int)(Math.random()*6)+1;

		int resultat=dau1+dau2;

				
		System.out.println("La primera tirada ha sigut " + dau1 );

		System.out.println("La segona tirada ha sigut " + dau2 );

		System.out.println("La suma de les dos tirades es " + resultat );



 }
}