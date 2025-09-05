package exercicios;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String resposta;
		
		do {
			
			//System.out.println("Produto: ");
			//String produto = sc.next();			
			
			System.out.println("Descrição: ");
			String descricao = sc.nextLine();
			
			System.out.println("Valor: ");
			double valor = sc.nextDouble();
			
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			sc.nextLine();
			
			Produto Produto = new Produto(descricao, valor, quantidade);
			
			System.out.println("\nProduto: " + Produto.getProduto());
			System.out.println("\nDescrição: " + Produto.getDescricao());
			System.out.println("Valor: " + Produto.getValor());
			System.out.println("Quantidade " + Produto.getClass());
			System.out.println("Total: " + Produto.calcularTotal());
			System.out.println("ICMS: " + Produto.calcularIcms());
			
			System.out.println("\nDeseja encerrar o programa? (S/N)");
			resposta = sc.nextLine();
			
			
		} while (!resposta.equalsIgnoreCase("S"));
			sc.close();
			System.out.println("\nPrograma encerrado");
	}

}
