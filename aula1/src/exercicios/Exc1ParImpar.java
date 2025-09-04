package exercicios;

public class Exc1ParImpar {

	public static void main(String[] args) {
		
		//Declaração de variáveis  contadoras
		int contadorPares  = 0;
		int contadorImpares =0;
		
		//Loop para percorrer números de 0 a 30
		for (int numero = 0; numero <= 30; numero++) {
			
			//Verificar se o número é par ou  ímpar
			if (numero % 2 == 0) {
				contadorPares++; // Incrementa Contador Pares
				System.out.println(numero + " é Par");
			} else {
				contadorImpares++; // Incrementa Contador Ímpares
				System.out.println(numero + " é Impar");
			}
		}	
		
		// Exibe o resultado final
		System.out.println("\n === Resultado ===");
		System.out.println("\n Quantidade de números pares: " + contadorPares);
		System.out.println("\n Quantidade de números ímpares: " + contadorImpares);
		System.out.println("\n Total de números analisados:  " + (contadorPares + contadorImpares));
		
	}

}

