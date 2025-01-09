package programacio;

import javax.swing.JOptionPane;
public class Aleatoris {
	public static void main(String[] args) {
		int elements = Integer.parseInt(JOptionPane.showInputDialog("Introdueix els números"));
		
		int num_aleatoris[] = new int[elements];
		for(int i=0;i<num_aleatoris.length;i++) {
			num_aleatoris[i]=(int)Math.random()*100;
		}
		for (int elem:num_aleatoris) {
			System.out.println(elem);
		}
	}
}


