package revisao;

public class Setor {
	private int codigo;
	private String descricao;
	protected Setor setor;
	
	
	
	public Setor(int codigo, String descricao, Setor setor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.setor = setor;
	}
	@Override
	public String toString() {
		return  "Código: " + codigo + ", descricao: " + descricao + "Setor: " + setor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
