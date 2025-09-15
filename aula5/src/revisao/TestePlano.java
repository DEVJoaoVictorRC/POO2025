package revisao;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Amil", 80, 5, "Ckeckup", "123");
		Anestesista anestesista = new Anestesista("Amil", 80, 5, "Joao", 123, "Geral");
		Pediatra pediatra = new Pediatra("Amil", 80, 5, "Joaquim", 231, false);
		ControlePgto pgto = new ControlePgto();
		
		System.out.println("Valor Pago Clínica: " + clinica.calcularPagamento());
		pgto.calcularTotalPago(clinica);
		System.out.println("Valor Pago clínica " + clinica.getValorPago());
		
		System.out.println("Valor Pago Anestesista: " + anestesista.calcularPagamento());
		pgto.calcularTotalPago(anestesista);
		System.out.println("Valor Pago clínica " + anestesista.getValorPago());
		
		System.out.println("Valor Pago Pediatra: " + pediatra.calcularPagamento());
		pgto.calcularTotalPago(pediatra);
		System.out.println("Valor Pago clínica " + pediatra.getValorPago());
		
		
		System.out.println(clinica.toString());
		System.out.println(anestesista.toString());
		System.out.println(pediatra.toString());
		System.out.println("Total Pago pela Amil: " +  String.format("%.2f", pgto.getTotalPago()));
		
	}

}
