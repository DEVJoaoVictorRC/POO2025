package exercicio;

public class AnimalException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AnimalException(String mensagem) {
		super(mensagem);
	}
}