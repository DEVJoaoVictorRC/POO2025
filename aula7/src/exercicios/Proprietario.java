package exercicios;

public class Proprietario {
	private  String nome;

	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome: " + nome;
	}

	public String getNome() {
		return nome;
	}
	
	
}
