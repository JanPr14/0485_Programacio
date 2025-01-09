package programacio;

public class ex33 {
    
    public static void main (System []args){
        int[] numeros = {33, 3, 7, 4, 1};
        ex33 prog = new ex33();

        System.out.println(prog.suma(numeros));


    }

    public int suma(int[] numeros){
        int i=0;
        int num1=0;
        int num2=0;
        int suma=0;

        num1 = numeros[i];
        num2 = numeros[i+1];

        suma = num1+num2;

        return suma;



    }
  


}
