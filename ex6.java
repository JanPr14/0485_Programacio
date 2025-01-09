package programacio;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 //declarem la variable numero 
        int num;
//preguntem un numero al usuari que sigui senar i major que 1
        do {
            System.out.println("Introdueix un número senar major de 1:");
            num = scanner.nextInt();
        } while (num <= 1 || num % 2 == 0);

 //posem un for amb la variable "i" i dintre d'aquest un amb la variable "j", s'encarregaran de controlar l'amplada i els sals de linea      
        for (int i=0;i<num;i++) {
            for (int j=0;j<num;j++) {
 //posem un if dintre del segon for que si j es igual que i impieixi * (per la digaonal d'esquerra a dreta i per l'altra diagonal farem servir la formula de i+j==num-1               
                if (i==j || i+j==num-1) {
                    System.out.print("*");
//aquest else s'encarrega de posar els espais per a que es faigin les diagonals                
                } else {
                    System.out.print(" ");
                }
            }
//aquest println fa els salts de linea a cada iteracio
            System.out.println(); 
        }
    }
}

