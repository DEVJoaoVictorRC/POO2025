package exercicios;

public class Exc2Multiplos2D2 {

	public static void main(String[] args) {
		
		int contador = 0;
		//Loop para percorrer números de 1 a 22
		for (int numero = 1; numero <= 22; numero++) {
			
			if (numero % 2 == 0) {
					System.out.println("Número " + numero + ": Java");
					contador++;
			} 
		}
		
		System.out.println("\nTotal de múltiplos de 2 encontrados: " + contador);
	}

}
