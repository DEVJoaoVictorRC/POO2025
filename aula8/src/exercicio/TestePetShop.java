package exercicio;

//TestePetShop.java
public class TestePetShop {
	public static void main(String[] args) {
		// Criar loja
		LojaDePets loja = new LojaDePets("Pet Shop Feliz", 10);

		// Adicionar animais
		loja.adicionarAnimal(new Cachorro("Rex", 3, "Golden Retriever"));
		loja.adicionarAnimal(new Gato("Mimi", 2, "Branco"));
		loja.adicionarAnimal(new Cachorro("Bob", 5, "Bulldog"));
		loja.adicionarAnimal(new Gato("Luna", 1, "Preto"));

		// Listar animais disponíveis
		loja.listarAnimais();

		try {
			// Adotar um animal
			System.out.println("\n--- Adotando animal ---");
			loja.adotarAnimal(0);

			// Listar novamente após adoção
			loja.listarAnimais();

			// Tentar adotar o mesmo animal novamente
			System.out.println("\n--- Tentando adotar animal já adotado ---");
			loja.adotarAnimal(0);

		} catch (AnimalException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		try {
			// Tentar adotar animal com índice inválido
			System.out.println("\n--- Tentando adotar animal inexistente ---");
			loja.adotarAnimal(10);

		} catch (AnimalException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}