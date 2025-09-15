package interfaces;

public class Pessoa implements Tributos{
	private String nome;
	private double rendimentos;
	

	@Override
	public double calcularImpostoRenda() {
		// TODO Auto-generated method stub
		return rendimentos * irPessoaFisica;
	}

	@Override
	public double calcularIcms() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularIpi() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
