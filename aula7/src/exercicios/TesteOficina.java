package exercicios;

import java.time.LocalDate;

public class TesteOficina {
    public static void main(String[] args) {
        // Criar um proprietário
        Proprietario proprietario = new Proprietario("João Silva");
        
        // Criar um objeto do tipo carro
        Carro carro = new Carro(
            "Honda Civic",      // modelo
            0.0,               // valorCobrado inicial
            LocalDate.now(),   // dataConserto
            proprietario,      // proprietario
            "Sedan"           // categoria
        );
        
        // Trocar o óleo e fazer a revisão
        carro.trocarOleo();
        carro.revisao();
        
        // Exibir o nome do proprietário, os dados carro e o valor cobrado pelo serviço
        System.out.println("Proprietário: " + carro.getProprietario().getNome());
        System.out.println("Modelo do carro: " + carro.getModelo());
        System.out.println("Categoria: " + carro.getCategoria());
        System.out.println("Valor total cobrado: R$ " + String.format("%.2f", carro.getValorCobrado()));
    }
}