package programacio;
public class provametodes{
	
	public static void man(String args []) {
		
		provametodes programa = new provametodes();
		
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