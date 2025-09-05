package exercicios;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

		int escolha;

		do {
			System.out.println("\n-----CALCULADORA-----");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtação");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Sair");
			System.out.println("Escolha uma opção: ");
			escolha = sc.nextInt();

			if (escolha >= 1 && escolha <= 4) {
				System.out.print("Digite o primeiro número: ");
				double num1 = sc.nextDouble();
				System.out.print("Digite o Segundo número: ");
				double num2 = sc.nextDouble();

				double resultado = 0;

				switch (escolha) {
				case 1:
					resultado = calculadora.soma(num1, num2);
					break;
				case 2:
					resultado = calculadora.subtracao(num1, num2);
					break;
				case 3:
					resultado = calculadora.multiplicacao(num1, num2);
					break;
				case 4:
					resultado = calculadora.divisao(num1, num2);
					break;
				}

				System.out.println("Resultado: " + resultado);

			}

		} while (escolha != 5);

		System.out.println("Programa encerrado!");
		sc.close();

	}

}
