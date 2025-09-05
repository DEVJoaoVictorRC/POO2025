
package exercicios;

import javax.swing.JOptionPane;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Adriano", 3000.0);
		
		String mensagem = "Nome: " + funcionario.getNome()
		+ "\nSalário: " + funcionario.getSalario()
		+ "\nINSS: " + funcionario.calcularInss()
		+ "\nVale Transporte: " + funcionario.calcularValeTransporte()
		+"\nSalário Líquido: " + funcionario.calcularSalarioLiquido();
		
	JOptionPane.showMessageDialog(null, mensagem); 
	
	}
}