package heranca;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Diretor diretor = new Diretor(1, "Ana", "23", "ana@gmail.com", 8000., "ADM", 1000.);
		Gerente gerente = new Gerente(2, "Jose", "33", "Jose@gmail.com", 4000., 10);
		
		
		System.out.println("Dados do diretor: " + diretor.toString());
		System.out.println("Salário: " + diretor.calcularFolha());
		
		
		
		System.out.println("Dados ddo Gerente: " + gerente.toString());
		System.out.println("Sal;ario: " + gerente.calcularFolha());
	}	

}
