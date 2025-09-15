package exercicios;

public class TesteImovel {
	public static void main(String[] args) {
		Casa casa1 = new Casa("Rua das Flores, 123", 500000.0, true);
		Apto apto1 = new Apto("Av. Central, 456", 300000.0, 8);

		Proprietario prop1 = new Proprietario("João Silva", casa1);
		Proprietario prop2 = new Proprietario("Maria Santos", apto1);

		System.out.println("=== DADOS DOS IMÓVEIS E PROPRIETÁRIOS ===");

		System.out.println("\nProprietário: " + prop1.getNome());
		System.out.println("Tipo: Casa");
		System.out.println(prop1.getImovel().toString());
		System.out.println("Garagem: " + (((Casa) prop1.getImovel()).isGaragem() ? "Sim" : "Não"));
		System.out.println("ITBI (3,5%): R$ " + String.format("%.2f", prop1.getImovel().calcularImpostoVenda()));

		System.out.println("\nProprietário: " + prop2.getNome());
		System.out.println("Tipo: Apartamento");
		System.out.println(prop2.getImovel().toString());
		System.out.println("Andar: " + ((Apto) prop2.getImovel()).getAndar());
		System.out.println("ITBI (3,5%): R$ " + String.format("%.2f", prop2.getImovel().calcularImpostoVenda()));
	}
}