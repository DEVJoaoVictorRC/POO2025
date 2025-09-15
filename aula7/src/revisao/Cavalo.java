package revisao;

import java.time.LocalDate;

public class Cavalo  extends Mamifero implements AnimalCompeticao{
	private String marcarFerradura;

	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcarFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcarFerradura = marcarFerradura;
	}

	@Override
	public void trocarFerradura() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String emitirSomn() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}	
