package com.santander.set.pesquisa.contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	Set<Contato> contatos;

	public AgendaContatos() {
		contatos = new HashSet<Contato>();
	}

	public void adicionarContato(String nome, int numero) {
		contatos.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		if (this.contatos == null || this.contatos.isEmpty()) {
			System.out.println("A lista de contatos está vazia");
			return;
		}
		for (Contato contato : contatos)
			System.out.println(contato);
	}

	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosEncontrados = new HashSet<Contato>();
		if (!contatos.isEmpty() && contatos != null) {
			for (Contato contato : contatos) {
				if (contato.getNome().toUpperCase().startsWith(nome.toUpperCase()))
					contatosEncontrados.add(contato);
			}
		}
		return contatosEncontrados;
	}

	public void atualizarNumeroContato(String nome, int numero) {
		if (!this.contatos.isEmpty() && this.contatos != null) {
			for (Contato contato : this.contatos) {
				if (contato.getNome().equalsIgnoreCase(nome)) {
					contato.setNumero(numero);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		AgendaContatos contatos = new AgendaContatos();
		System.out.println("Iniciando teste com lista vazia...");
		contatos.exibirContatos();
		System.out.println("Teste finalizado\nIniciando teste com lista não vazia...");
		
		contatos.adicionarContato("Jhonathan", 1);
		contatos.adicionarContato("Ana", 1);
		contatos.adicionarContato("Ana", 2);
		contatos.adicionarContato("Naldo", 1);
		contatos.exibirContatos();
		
		System.out.println("Teste finalizado\nIniciando teste com numero atualizado...");
		contatos.atualizarNumeroContato("ana", 3);
		System.out.println(contatos.pesquisarPorNome("an"));
		System.out.println(contatos.pesquisarPorNome("a"));
		System.out.println(contatos.pesquisarPorNome("j"));
	}
}
