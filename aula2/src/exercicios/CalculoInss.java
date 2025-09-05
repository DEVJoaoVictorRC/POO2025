package exercicios;

public class CalculoInss {

    public static void main(String[] args) {
        
        // Passo 1: Declaracao da variavel salario com valor inicial
        double salario = 3500.00; // Salario bruto do funcionario
        
        // Passo 2: Declaracao das variaveis para calculos
        double percentualDesconto = 0; // Percentual que sera aplicado
        double valorDesconto = 0;      // Valor em reais do desconto
        double salarioLiquido = 0;     // Salario apos desconto
        String faixaSalarial = "";     // Faixa onde o salario se encaixa
        
        // Passo 3: Definir o percentual de desconto baseado na tabela INSS
        if (salario <= 1518.00) {
            // Faixa 1: ate R$ 1.518,00 - desconto 0%
            percentualDesconto = 0;
            faixaSalarial = "Faixa 1: ate R$ 1.518,00";
            
        } else if (salario >= 1518.01 && salario <= 2793.88) {
            // Faixa 2: de R$ 1.518,01 ate R$ 2.793,88 - desconto 9%
            percentualDesconto = 9;
            faixaSalarial = "Faixa 2: de R$ 1.518,01 ate R$ 2.793,88";
            
        } else if (salario >= 2793.89 && salario <= 4190.83) {
            // Faixa 3: de R$ 2.793,89 ate R$ 4.190,83 - desconto 12%
            percentualDesconto = 12;
            faixaSalarial = "Faixa 3: de R$ 2.793,89 ate R$ 4.190,83";
            
        } else if (salario >= 4190.84 && salario <= 8157.41) {
            // Faixa 4: de R$ 4.190,84 ate R$ 8.157,41 - desconto 14%
            percentualDesconto = 14;
            faixaSalarial = "Faixa 4: de R$ 4.190,84 ate R$ 8.157,41";
            
        } else {
            // Acima do teto do INSS - desconto maximo de 14%
            percentualDesconto = 14;
            faixaSalarial = "Acima do teto do INSS";
        }
        
        // Passo 4: Calcular o valor do desconto e salario liquido
        valorDesconto = salario * (percentualDesconto / 100);
        salarioLiquido = salario - valorDesconto;
        
        // Passo 5: Exibir os resultados no console
        System.out.println("========== CALCULO DO INSS ==========");
        System.out.println("Salario Bruto: R$ " + String.format("%.2f", salario));
        System.out.println(faixaSalarial);
        System.out.println("Percentual de Desconto: " + percentualDesconto + "%");
        System.out.println("Valor do Desconto: R$ " + String.format("%.2f", valorDesconto));
        System.out.println("Salario Liquido: R$ " + String.format("%.2f", salarioLiquido));
        System.out.println("====================================");
        
        // Informacao adicional
        if (percentualDesconto == 0) {
            System.out.println("Informacao: Salario isento de desconto INSS!");
        } else {
            System.out.println("Desconto aplicado com sucesso!");
        }
    }
}