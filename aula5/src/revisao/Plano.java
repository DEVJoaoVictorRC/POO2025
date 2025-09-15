package revisao;

public class Plano {

	protected String emprea;
	protected double valorPago = 80;
	protected double valorIss = 5;

	public Plano(String emprea, double valorPago, double valorIss) {
		super();
		this.emprea = emprea;
		this.valorPago = valorPago;
		this.valorIss = valorIss;
	}
	
	

	@Override
	public String toString() {
		return "Plano emprea: " + emprea + ", valorPago:" + String.format ("%.2f", valorPago) + ", valorIss:" + valorIss;
	}

	

	public String getEmprea() {
		return emprea;
	}

	public void setEmprea(String emprea) {
		this.emprea = emprea;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getValorIss() {
		return valorIss;
	}

	public void setValorIss(double valorIss) {
		this.valorIss = valorIss;
	}
	
	public double calcularPagamento() {
		return valorPago *= 0.95;
	}

}
