package exercicios3;

public class Categoria {
	private int codigo;
	private String tipo;

	public Categoria(int codigo, String tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return tipo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Categoria categoria = (Categoria) obj;
		return codigo == categoria.codigo && tipo.equals(categoria.tipo);
	}
}