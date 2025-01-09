package programacio;

import java.util.Scanner;
public class exwhile2{
public static void main (String args[]) {

	int num=0;
	int flag=1;
	
Scanner in = new Scanner (System.in);
	
System.out.println("Digues un numero");
num = in.nextInt();

while (flag<4) {
	num=num*num;
	System.out.println("El teu num és:" + num);
	flag++;
  }
 }
}