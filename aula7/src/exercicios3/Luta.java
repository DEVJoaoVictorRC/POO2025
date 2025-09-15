package exercicios3;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean confirmado;

	public Luta(Lutador desafiante, Lutador desafiado, int rounds) {
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.rounds = rounds;
		this.confirmado = false;
	}

	// Getters
	public Lutador getDesafiante() {
		return desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public int getRounds() {
		return rounds;
	}

	public boolean isConfirmado() {
		return confirmado;
	}

	// Método para confirmar se a luta pode acontecer
	public boolean confirmarLuta() {
		// Verifica se os dois lutadores são de mesma categoria
		boolean mesmaCategoria = desafiante.getCategoria().equals(desafiado.getCategoria());

		// Verifica se os lutadores são diferentes
		boolean lutadoresDiferentes = !desafiante.getNome().equals(desafiado.getNome());

		// A luta só pode acontecer se ambas as condições forem verdadeiras
		if (mesmaCategoria && lutadoresDiferentes) {
			this.confirmado = true;
			return true;
		} else {
			this.confirmado = false;
			return false;
		}
	}

	@Override
	public String toString() {
		return "Luta{" + "desafiante=" + desafiante.getNome() + ", desafiado=" + desafiado.getNome() + ", rounds="
				+ rounds + ", confirmado=" + confirmado + '}';
	}
}
