package revisao;

public class Pediatra extends Medico {

	private boolean aplicaVacina;

	public Pediatra(String emprea, double valorPago, double valorIss, String nome, int crm, boolean aplicaVacina) {
		super(emprea, valorPago, valorIss, nome, crm);
		this.aplicaVacina = aplicaVacina;
	}

	@Override
	public String toString() {
		return super.toString() + " Aplica Vacina: " + (aplicaVacina?"Aplica a Vacina ":"Nao aplica") ;
	}
	
	

	public boolean isAplicaVacina() {
		return aplicaVacina;
	}

	public void setAplicaVacina(boolean aplicaVacina) {
		this.aplicaVacina = aplicaVacina;
	}

}
