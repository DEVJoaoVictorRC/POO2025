package Relacionamentos;

public class TesteTime {

	public static void main(String[] args) {
		Atleta atleta1 = new Atleta("Arrascaeta", "Meia");
		Atleta atleta2 = new Atleta("Philipe Coutinho", "Meia");
		Atleta atleta3 = new Atleta("Yuri Alberto", "Atacante");
		
		Time time1 = new Time("Brasil", "Anceloti", new Atleta[11]);
		
		
		time1.adicionarAtletas(atleta1);
		time1.adicionarAtletas(atleta2);
		time1.adicionarAtletas(atleta3);
		
		time1.imprimirTime();
		
		
		
	}

}
