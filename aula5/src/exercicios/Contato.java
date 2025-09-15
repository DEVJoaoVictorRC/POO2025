package exercicios;

import java.util.*;

public class Contato {
	private String nome;
	private List<Telefone> telefones;
	private Endereco endereco;

	public Contato(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void adicionarTelefone(Telefone telefone) {
		this.telefones.add(telefone);
	}

	public void mostrarTelefones() {
		System.out.println("Telefones de " + nome + ":");
		for (Telefone telefone : telefones) {
			System.out.println("- " + telefone.getNumero());
		}
	}
}
