package exemplos;

public class TesteCampeonato {

	public static void main(String[] args) {
		//Construtor - é chamado sempre que tiver um instância do objeto
		Campeonato c1 = new Campeonato(192,"Santa Cruz",10);
		Campeonato c2 = new Campeonato(223,"Remo",12);
		Campeonato c3 = new Campeonato(321, "Sport",15);
		
		System.out.println(c1.getTime());
		System.out.println(c2.getTime());
		System.out.println("Total de times:" + Campeonato.getContadorTimes());
		
	}

}
