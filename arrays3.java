package programacio;

public class arrays3{
	
	public static void main (String []args) {
	
	int[] num = new int[10];
	int gran=0;
	int numerog=0;
	int petit=100;
	int numerop=100;
	
	
	for(int i=0;i<10;i++) {
	num [i] = (int) (Math.random()*100)+1;
	}
	
	System.out.println("Els teus numeros són:");
	
	for(int x=0;x<10;x++) {
 
		System.out.println(num[x]);
		
	  }
	
	for(int i=0;i<10;i++) {
		gran=num[i];
		if(gran>i) {
		 if(gran>numerog)
			numerog=gran;	
		}
		
	}
	System.out.println("Els numero més gran és: " + numerog);

	for(int w=0;w<10;w++) {
		petit=num[w];
		if(petit<w) {
		 if(petit<numerop)
			numerop=petit;	
		}
		
	}
	System.out.println("Els numero més petit és: " + numerop);
	
	}
}
