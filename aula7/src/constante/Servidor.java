package constante;

// O final serve para torna a classe  imutável ( sem filhos )
public  class Servidor {
	protected String nome;
	protected String locacao;
	// Não posso modificar ( constante )
	protected final String LOTACAO  = "BRASILIA";
	
	
	public Servidor(String nome, String locacao) {
		super();
		this.nome = nome;
		this.locacao = locacao;
	}
	
	// O final no método serve para não permitir a sobrescrita ( filho n pode mudar )
	public final void imprimirRelatorio() {
		System.out.println("Relatório impresso");
	}
}
