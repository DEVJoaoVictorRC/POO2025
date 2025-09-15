package exercicios;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Month;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavarVeiculo() {
		// TODO Auto-generated method stub
		return valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {
		double preco = TipoServico.OLEO.getValorPorServico(); // 100.0

		// Verifica se é sábado (desconto de 50.00)
		LocalDate hoje = LocalDate.now();
		if (hoje.getDayOfWeek() == DayOfWeek.SATURDAY) {
			preco -= 50.0;
		}

		return valorCobrado += preco;
	}

	@Override
	public double revisao() {
		double preco = TipoServico.REVISAO.getValorPorServico(); // 200.0

		// Verifica se é agosto (desconto de 10%)
		LocalDate hoje = LocalDate.now();
		if (hoje.getMonth() == Month.AUGUST) {
			preco = preco - (preco * 0.10); // Aplica desconto de 10%
		}

		return valorCobrado += preco;
	}
}