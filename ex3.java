package programacio;

public class ex3 {

    public static void main(String args[]) {
        int num = 1;
//fem un do while que sumara 1 a la variable num fins a 50       
        do {
            num++;
/**
 * dintre del do while posem un if que si el numero té un 8 
 * iguali la variable cont a la de num per a mantenir el mateix valor
 * llavors fem un while que mentres sigui major a 0 que imprimeixi el comptre endarrera
 * 
 */
            if (num % 10 == 8) {
                int cont = num;  

                
                while (cont >= 0) {
                    System.out.println(cont--);
                    
                }
                
             }
        } while (num <= 50);
    }
}
