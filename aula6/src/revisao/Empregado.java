package revisao;

// Classe abstrata só serve para instanciar os Filhos
public abstract class Empregado {
	protected String nome;
	protected double salario;

	public Empregado(String nome, double salario, Setor setor) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "nome: " + nome + ", salario: " + salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Método abstrato não contem implementação pois a Implementação será nos filhos
	public abstract  double calcularHoraExtra();
	
}
