package exercicios;

import java.util.Scanner;

public class TesteVendedor {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Fixo joao = new Fixo("Joao", "123.456.789-10", 2150.0, 0, 10.0);
        Fixo maria = new Fixo("Maria", "987.654.321-00", 2800.0, 0, 15.0);
        
        double totalVendas = 0;
        
        while (true) {
            System.out.println("Sistema de Vendas");
            System.out.println("Vendedores:");
            System.out.println("1-Joao");
            System.out.println("2-Maria");
            System.out.print("Escolha o vendedor? ");
            
            int opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.print("Digite o valor da venda\n");
                double valorVenda = scanner.nextDouble();
                maria.setValorVenda(valorVenda);
                totalVendas += valorVenda;
                
                System.out.print("Deseja encerrar o programa? (S/N)\n");
                String resposta = scanner.next();
                
                if (resposta.equalsIgnoreCase("S")) {
                    break;
                }
                
            } else if (opcao == 2) {
                System.out.print("Digite o valor da venda\n");
                double valorVenda = scanner.nextDouble();
                joao.setValorVenda(valorVenda);
                totalVendas += valorVenda;
                
                System.out.print("Deseja encerrar o programa? (S/N)\n");
                String resposta = scanner.next();
                
                if (resposta.equalsIgnoreCase("S")) {
                    break;
                }
            }
        }
        
        System.out.println("Salário dos vendedores:");
        System.out.print("nome:Joao\n");
        joao.calcularSalario();
        System.out.print("nome:Maria\n");
        maria.calcularSalario();
        System.out.println("Total:" + (joao.getSalarioBase() + maria.getSalarioBase()));
        
        scanner.close();
    }
}