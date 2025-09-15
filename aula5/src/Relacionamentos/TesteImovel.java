package Relacionamentos;

public class TesteImovel {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Joao", "123");
		Pessoa pessoa2 = new Pessoa("Joana", "321");
		
		Imovel imovel1 = new Imovel("Rua Bingen", "Apartamento", 189000., pessoa1);
		Imovel imovel2 = new Imovel("Mosela", "Casda", 250000., pessoa2);
		
		System.out.println(imovel1.toString());
		System.out.println(imovel2.toString());
	}

}
