package revisao;

import java.time.LocalDate;

public class Cachorro  extends Mamifero implements AnimalDomestico{
	private boolean castadro;

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, boolean castadro) {
		super(nome, dataVacinacao, raca);
		this.castadro = castadro;
	}

	@Override
	public boolean levarVeterinario() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alimentar() {
		// TODO Auto-generated method stub
		return false;
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
