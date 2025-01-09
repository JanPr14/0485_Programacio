package programacio;

import java.util.Scanner;
public class exwhile3{
public static void main (String args[]) {

	int num=1;
	
	
Scanner in = new Scanner (System.in);


while (num<=50) {
System.out.println(num++);
	if (num%10==2) {
		System.out.print("patito_");
	}
	if (num/10==2) {
		System.out.print("patito_");
	}
	if (num%10==3) {
		System.out.print( "pepito_");
	}
	if (num/10==3) {
		System.out.print( "pepito_");
	}
   }
  }
 }