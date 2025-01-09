package programacio;


public class metodes4{
	
	public static void main (String []args) {

		
		String modul = "Mòdul 0440: Programació";

//Substituint les A per I
		for(int i=0;i<modul.length();i++) {
		switch(modul.charAt(i)) {
			
		case 'a':
			System.out.print("i");	
		break;
		default:
			System.out.print(modul.charAt(i));
		break;	
		
			}
		}
		System.out.println();	

//sense espais		
		for(int i=0;i<modul.length();i++) {
			switch(modul.charAt(i)) {
				
			case ' ':
				System.out.print("");	
				break;
			
			default:
				System.out.print(modul.charAt(i));
				break;					
				}
			}
		
		System.out.println();	

//borrar programació		
		System.out.println(modul.substring(0,11));	

		
				
		
    }
}
		
		
		
		
		

