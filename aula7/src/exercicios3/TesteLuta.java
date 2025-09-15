package exercicios3;

public class TesteLuta {
	public static void main(String[] args) {
		System.out.println("=== SISTEMA DE GERENCIAMENTO DE LUTAS ===\n");

		// Criar três lutadores em categorias distintas
		Lutador lutador1 = new Lutador("Anderson Silva", 30, 75.0); // Peso Meio-Médio
		Lutador lutador2 = new Lutador("Jon Jones", 28, 85.0); // Peso Médio
		Lutador lutador3 = new Lutador("Jose Aldo", 32, 68.0); // Peso Leve
		Lutador lutador4 = new Lutador("Spider Silva", 29, 75.5); // Peso Meio-Médio (mesma categoria do lutador1)

		// Exibir informações dos lutadores
		System.out.println("LUTADORES CADASTRADOS:");
		System.out.println("1. " + lutador1);
		System.out.println("2. " + lutador2);
		System.out.println("3. " + lutador3);
		System.out.println("4. " + lutador4);

		System.out.println("\n" + "=".repeat(50));

		// Teste 1: Luta entre lutadores de categorias diferentes (deve ser cancelada)
		System.out.println("\nTESTE 1 - Lutadores de categorias diferentes:");
		System.out.println("Desafiante: " + lutador1.getNome() + " (" + lutador1.getCategoria() + ")");
		System.out.println("Desafiado: " + lutador2.getNome() + " (" + lutador2.getCategoria() + ")");

		Luta luta1 = new Luta(lutador1, lutador2, 5);

		if (luta1.confirmarLuta()) {
			System.out.println("Luta Confirmada!");
		} else {
			System.out.println("Luta Cancelada!");
		}

		// Teste 2: Luta entre lutadores da mesma categoria (deve ser confirmada)
		System.out.println("\nTESTE 2 - Lutadores da mesma categoria:");
		System.out.println("Desafiante: " + lutador1.getNome() + " (" + lutador1.getCategoria() + ")");
		System.out.println("Desafiado: " + lutador4.getNome() + " (" + lutador4.getCategoria() + ")");

		Luta luta2 = new Luta(lutador1, lutador4, 3);

		if (luta2.confirmarLuta()) {
			System.out.println("Luta Confirmada!");
		} else {
			System.out.println("Luta Cancelada!");
		}

		// Teste 3: Lutador contra ele mesmo (deve ser cancelada)
		System.out.println("\nTESTE 3 - Mesmo lutador:");
		System.out.println("Desafiante: " + lutador1.getNome() + " (" + lutador1.getCategoria() + ")");
		System.out.println("Desafiado: " + lutador1.getNome() + " (" + lutador1.getCategoria() + ")");

		Luta luta3 = new Luta(lutador1, lutador1, 5);

		if (luta3.confirmarLuta()) {
			System.out.println("Luta Confirmada!");
		} else {
			System.out.println("Luta Cancelada!");
		}

		System.out.println("\n" + "=".repeat(50));
		System.out.println("CATEGORIAS DE PESO:");
		System.out.println("• Peso Leve: até 70,3 kg");
		System.out.println("• Peso Meio-Médio: até 77,1 kg");
		System.out.println("• Peso Médio: até 83,9 kg");
		System.out.println("• Peso Meio-Pesado: até 93,0 kg");
		System.out.println("• Peso Pesado: até 120,2 kg");
	}
}
