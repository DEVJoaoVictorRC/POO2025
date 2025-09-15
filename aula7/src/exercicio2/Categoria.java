package exercicio2;

public enum Categoria {
	ELETRONICO("Eletrônico"), ALIMENTO("Alimento"), AUTOMOTIVO("Automotivo"), ROUPAS("Roupas"),
	FARMACEUTICO("Farmacêutico");

	private String descricao;

	Categoria(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}
}