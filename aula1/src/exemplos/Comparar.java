package exemplos;

import javax.swing.JOptionPane;

public class Comparar {

	public static void main(String[] args) {
		int num1 = 10, num2 = 5;
		String resultado;
/*
		if (num1 > num2) {
			System.out.println("Número 1 é maior");
		}else if(num2 > num1) {
			System.out.println("Número 2 é maior");
		}else {
			System.out.println("Iguais");
		}
*/
		
		//TERNÁRIO
	//	System.out.println(num1 > num2 ? "Número 1 é maior" : num2 > num1 ? "Número 1 é maior" : "Iguais");
		resultado = num1 > num2 ? "Número 1 é maior" : num2 > num1 ? "Número 1 é maior" : "Iguais";
		JOptionPane.showMessageDialog(null, resultado);
	}

}
