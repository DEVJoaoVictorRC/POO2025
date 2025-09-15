package exercicio;

public class LojaDePets {
	private String nomeLoja;
	private Animal[] animais;
	private boolean[] adotados;
	private int contador;

	public LojaDePets(String nomeLoja, int capacidade) {
		this.nomeLoja = nomeLoja;
		this.animais = new Animal[capacidade];
		this.adotados = new boolean[capacidade];
		this.contador = 0;
	}

	public void adicionarAnimal(Animal animal) {
		if (contador < animais.length) {
			animais[contador] = animal;
			adotados[contador] = false;
			contador++;
			System.out.println("Animal adicionado com sucesso!");
		} else {
			System.out.println("Loja cheia! Não é possível adicionar mais animais.");
		}
	}

	public void listarAnimais() {
		System.out.println("\n=== " + nomeLoja + " ===");
		System.out.println("Animais disponíveis para adoção:");

		boolean temAnimaisDisponiveis = false;
		for (int i = 0; i < contador; i++) {
			if (!adotados[i]) {
				System.out.print("[" + i + "] ");
				animais[i].imprimir();
				temAnimaisDisponiveis = true;
			}
		}

		if (!temAnimaisDisponiveis) {
			System.out.println("Nenhum animal disponível para adoção.");
		}
	}

	public void adotarAnimal(int index) throws AnimalException {
		if (index < 0 || index >= contador) {
			throw new AnimalException("Animal não encontrado no índice " + index);
		}

		if (adotados[index]) {
			throw new AnimalException("Animal já foi adotado!");
		}

		adotados[index] = true;
		System.out.println("Parabéns! Você adotou:");
		animais[index].imprimir();
	}
}