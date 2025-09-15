package exercicios;

public class Apto extends Imovel {
	private int andar;

	public Apto(String local, double valor, int andar) {
		super(local, valor);
		this.andar = andar;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}
}