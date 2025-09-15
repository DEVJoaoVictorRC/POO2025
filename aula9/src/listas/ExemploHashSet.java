package listas;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploHashSet {

	public static void main(String[] args) {
		//set não permite elementos duplicados.
		
		//Não mantem a ordem de inserção.
		//Set<String>	times = new HashSet<>();
		
		//Mantém a ordem dos elementos.
		//Set<String>	times = new LinkedHashSet<>();
		
		//Ordena os elementos
		Set<String>	times = new TreeSet<>();
		
		times.add("Flamengo");
		times.add("Flamengo");
		times.add("Flamengo");
		times.add("Vasco");
		times.add("Bangu");
		times.add("Botafogo");
		times.add("América");
		times.add("Vasco");
		
		System.out.println(times);
	}

}
