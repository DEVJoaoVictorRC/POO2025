package exercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda implements FinalizarVenda {
	private Produto produto;
	private LocalDate dataCompra;
	private int quantidade;
	private double totalVenda;
	private List<Produto> produtos;

	public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
		this.totalVenda = 0.0;
		this.produtos = new ArrayList<>();
		this.produtos.add(produto);
	}

	// Getters
	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	// Método para adicionar produtos à venda
	public void adicionarProduto(Produto produto, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			this.produtos.add(produto);
		}
	}

	@Override
	public void calcularVenda() {
		totalVenda = 0.0;
		for (Produto p : produtos) {
			totalVenda += p.getValor();
		}
	}

	public void mostrarVenda() {
		System.out.println("=== DETALHES DA VENDA ===");
		System.out.println("Data da compra: " + dataCompra);

		// Agrupar produtos por tipo para exibição
		System.out.println("\nItens:");
		double totalPorItem = 0;

		for (Produto p : produtos) {
			System.out.println("- " + p.getDescricao() + " - R$ " + String.format("%.1f", p.getValor()));
		}

		System.out.println("\nTotal Geral da Venda: R$ " + String.format("%.1f", totalVenda));
		System.out.println("=========================");
	}
}