package enumeradores;

public enum PeriodoCurso {

	INTEGRAL("TER e QUI", 40, 2000.), NOTURNO("QUA e SEX ", 80, 3000.), MANHA("SEX ", 80, 3000.);

	private String diasSemanas;
	private int cargaHoraria;
	private double valor;

	private PeriodoCurso(String diasSemanas, int cargaHoraria, double valor) {
		this.diasSemanas = diasSemanas;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}

	public String getDiasSemanas() {
		return diasSemanas;
	}

	public void setDiasSemanas(String diasSemanas) {
		this.diasSemanas = diasSemanas;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
