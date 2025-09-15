package enumeradores;

import enumeradores.Empregado.EstadoCivil;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado empregado = new Empregado("Joao", "J@gmail.com", EstadoCivil.SOLTEIRO, Setor.FINANCEIRO);
		
		System.out.println("Dados: " + empregado.toString());
		
		
		Setor[] setores = Setor.values();
		
		for (int i = 0; i < setores.length; i++) {
			System.out.println(setores[i].getSala() + "-" + setores[i]);
		}
		
		
		//Inferência
		var teste = 10;
		// For each
		System.out.println("******************");
		for (Setor s : setores) {
			System.out.println(s.getSala() + "-" + s);
		}
		
		String [] nomes = {"Joao", "Jose", "Roger"};
		
		for (String Pessoas : nomes) {
			System.out.println(Pessoas);
		}
	}

}
