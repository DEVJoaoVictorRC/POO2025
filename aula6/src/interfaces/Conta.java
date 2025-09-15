package interfaces;

// Interface não permite new.
// Interface todos os métodos são abstratos.
// Interface não tem implementação de código.
public interface Conta {
	
	
	// Assinatura de métodos abstratos
	public double saque(double valor);
	public double depositar(double valor);
	public double transferir(double valor);
	
	
}
