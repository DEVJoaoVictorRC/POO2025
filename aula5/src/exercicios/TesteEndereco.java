package exercicios;

public class TesteEndereco {
	public static void main(String[] args) {
		Estado rj = new Estado("Rio de Janeiro", "RJ");

		Cidade petropolis = new Cidade("Petrópolis", rj);

		Endereco endereco = new Endereco("Rua Fonseca Ramos 181 Centro", "Centro", "25610-140", petropolis);

		Contato joaoRoberto = new Contato("João Roberto", endereco);

		Telefone telefone1 = new Telefone("2234-1040");
		Telefone telefone2 = new Telefone("2237-1350");

		joaoRoberto.adicionarTelefone(telefone1);
		joaoRoberto.adicionarTelefone(telefone2);

		System.out.println("=== DADOS DO CONTRATO ===");
		System.out.println("Nome: " + joaoRoberto.getNome());
		System.out.println("Endereço: " + joaoRoberto.getEndereco().getRua());
		System.out.println("Bairro: " + joaoRoberto.getEndereco().getBairro());
		System.out.println("CEP: " + joaoRoberto.getEndereco().getCep());
		System.out.println("Cidade: " + joaoRoberto.getEndereco().getCidade().getNomeCidade());
		System.out.println("Estado: " + joaoRoberto.getEndereco().getCidade().getEstado().getNomeEstado());
		System.out.println("Sigla: " + joaoRoberto.getEndereco().getCidade().getEstado().getSigla());

		joaoRoberto.mostrarTelefones();
	}
}
