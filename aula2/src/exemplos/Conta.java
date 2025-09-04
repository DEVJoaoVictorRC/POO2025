package exemplos;

public class Conta {
	//Atributos
	int numero;
	String titular;
	double saldo;
	
	//Comportamentos da classe - Métodos
	
	//Método sem retorno
	public void deposito(double valor) {
		saldo = saldo + valor;
		System.out.println("Depósito efetuado com suceso!");
	}
	
	//Método  com Retorno
	public  boolean saque(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			//v
			return true;
		} else {
			//System.out.println("Saque Nao efetuado!");
			return false;
		}
	}	
}
