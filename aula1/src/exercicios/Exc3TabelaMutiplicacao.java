package exercicios;

public class Exc3TabelaMutiplicacao {

	public static void main(String[] args) {
		
		//Número base para a tabela de multiplicalção
		int numeroBase= 2;
		
		// Título da tabela
		System.out.println("=== TABELA DE MULTIPLICAÇÃO DO " + numeroBase + " === ");
		System.out.println();
		
		//Loop que vai de 1 a 10	
		for (int i = 1; i <= 10; i++) {
			
			// Calcula o resultado da multiplicação
			int resultado = numeroBase * i;
			
			// Imprimeo a linha da tabela no formato  " 2 x 1  = 2 "
			System.out.println(numeroBase  + " x " + i + " = " + resultado);
		}
	
		System.out.println();
		System.out.println("=== FIM DA TABELA ===");
	
	}

}
