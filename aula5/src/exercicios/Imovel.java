package exercicios;

public class Imovel {
	protected String local;
	private double valorImovel;

	public Imovel(String local, double valorImovel) {
		this.local = local;
		this.valorImovel = valorImovel;
	}

	public String toString() {
		return "Local: " + local + ", Valor: R$ " + valorImovel;
	}

	public double calcularImpostoVenda() {
		return valorImovel * 0.035;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public double getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(double valorImovel) {
		this.valorImovel = valorImovel;
	}
}
