package exercicios3;

public class Lutador {
	private String nome;
	private Categoria categoria;
	private int idade;
	private double peso;

	public Lutador(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.categoria = definirCategoria();
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}

	// Método para definir categoria baseado no peso
	public Categoria definirCategoria() {
		if (peso <= 70.3) {
			return new Categoria(1, "Peso Leve");
		} else if (peso <= 77.1) {
			return new Categoria(2, "Peso Meio-Médio");
		} else if (peso <= 83.9) {
			return new Categoria(3, "Peso Médio");
		} else if (peso <= 93.0) {
			return new Categoria(4, "Peso Meio-Pesado");
		} else if (peso <= 120.2) {
			return new Categoria(5, "Peso Pesado");
		} else {
			return new Categoria(6, "Peso Super Pesado");
		}
	}

	@Override
	public String toString() {
		return "Lutador{" + "nome='" + nome + '\'' + ", categoria=" + categoria + ", idade=" + idade + ", peso=" + peso
				+ "kg" + '}';
	}
}