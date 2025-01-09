package programacio;
public class provametode{
	
	public static void man(String args []) {
		
		provametode programa = new provametode();
		
		programa.hola();

        System.out.println(programa.text());

	}
	
	
	public void hola() {
		
		System.out.println("Hola guapi");
	}
	
    public String text(){

        return "Hola de text";
    }
}