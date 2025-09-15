package exercicio2;

import java.time.LocalDate;

public class TesteVenda {
    public static void main(String[] args) {
        // Instanciar 3 produtos
        Produto tv = new Produto(1, "TV", 3000.0, Categoria.ELETRONICO);
        Produto pneu = new Produto(2, "Pneu", 800.0, Categoria.AUTOMOTIVO);
        Produto celular = new Produto(3, "Celular", 2500.0, Categoria.ELETRONICO);
        
        // Criar uma venda com o primeiro produto
        Venda venda = new Venda(tv, LocalDate.now(), 1);
        
        // Adicionar os outros produtos à venda
        venda.adicionarProduto(pneu, 1);
        venda.adicionarProduto(celular, 1);
        
        // Realizar a venda (calcular total)
        venda.calcularVenda();
        
        // Exibir os dados conforme a imagem
        System.out.println("Total por Item:");
        System.out.println("--------------------------------");
        System.out.println("TV - 3000.0");
        System.out.println("Pneu - 800.0");
        System.out.println("Celular - 2500.0");
        System.out.println("--------------------------------");
        System.out.println("Total Geral Venda: " + String.format("%.1f", venda.getTotalVenda()));
    }
}