package Relacionamentos;

public class Pessoa {
	private String nome;
	private String cfp;

	public Pessoa(String nome, String cfp) {
		super();
		this.nome = nome;
		this.cfp = cfp;
	}

	
	
	@Override
	public String toString() {
		return "nome: " + nome + ", cfp: " + cfp;
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCfp() {
		return cfp;
	}

	public void setCfp(String cfp) {
		this.cfp = cfp;
	}

}
