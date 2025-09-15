package listas;

import java.util.List;

public class ExemploIndexOf {

	public static void main(String[] args) {
		//Não Permite elementos também não permite modifcações
		List <String> setores = List.of("RH", "DP", "Contabilidade", "CPD");
		
		setores.set(0, "Financeiro");
		System.out.println(setores);
	}

}
