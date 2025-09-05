package heranca;

public class TesteImposto {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica("Joao", "j@gmail.com", 120000., "23", "2323");
		PessoaJuridica pj = new PessoaJuridica("Xpto Ltda", "x@gmail.com", 350000.0, "Qualquer coisa", "234");
		
		System.out.println(pf.calcularIR());
		System.err.println(pj.calcularIR());
	}

}
