package exercicios;

import java.time.LocalDate;

public class Moto extends Veiculo{
	private int cilindradas;

	public Moto(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		// TODO Auto-generated method stub
		return valorCobrado = valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {
		// TODO Auto-generated method stub
		return valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public double revisao() {
		// TODO Auto-generated method stub
		return valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
	}
	
	
}
