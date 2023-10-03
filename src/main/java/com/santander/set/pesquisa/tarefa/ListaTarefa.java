package com.santander.set.pesquisa.tarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
	Set<Tarefa> tarefas;

	public ListaTarefa() {
		this.tarefas = new HashSet<Tarefa>();
	}

	public void adicionarTarefa(String descricao) {
		if (descricao == null || descricao.isBlank())
			throw new RuntimeException("Descricao deve ser informada");
		tarefas.add(new Tarefa(descricao, false));
	}

	public void removeTarefa(String descricao) {
		Tarefa tarefaRemovida = null;
		if (descricao == null || descricao.isBlank())
			throw new RuntimeException("Descricao deve ser informada");
		for (Tarefa tarefa : this.tarefas) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaRemovida = tarefa;
				this.tarefas.remove(tarefaRemovida);
				break;
			}
		}
		if (tarefaRemovida == null)
			System.out.println("Tarefa não encontrada");
	}

	public void exibirTarefas() {
		if (tarefas.isEmpty() || tarefas == null) {
			System.out.println("Não há tarefa cadastrada");
			return;
		}
		for (Tarefa tarefa : this.tarefas)
			System.out.println(tarefa);
	}

	public int contarTarefas() {
		return tarefas.size();
	}

	public void finalizarTarefa(String descricao) {
		if (descricao == null || descricao.isBlank())
			throw new RuntimeException("Descricao deve ser informada");
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefa.setConcluida(true);
				System.out.println("Parabens! Tarefa " + tarefa.getDescricao() + " foi marcada como finalizada!");
				return;
			}
		}
	}

	public void marcarTarefaComoPendente(String descricao) {
		if (descricao == null || descricao.isBlank())
			throw new RuntimeException("Descricao deve ser informada");
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefa.setConcluida(false);
				System.out.println("Tarefa " + tarefa.getDescricao() + " foi marcada como pendente!");
				return;
			}
		}
		System.out.println("Tarefa nao encontrada");
	}

	public static void main(String[] args) {
		ListaTarefa lista = new ListaTarefa();

		lista.exibirTarefas();
		lista.removeTarefa("Teste");

		lista.adicionarTarefa("Limpar o quarto");
		lista.adicionarTarefa("Dedicar ao bootcamp Dio Santander");
		lista.adicionarTarefa("Dedicar ao bootcamp Dio Santander");
		lista.exibirTarefas();

		lista.finalizarTarefa("dedicar ao bootcamp dio santander");
		lista.exibirTarefas();

		lista.marcarTarefaComoPendente("dedicar ao bootcamp dio santander");
		lista.exibirTarefas();

		lista.removeTarefa("limpar o quarto");
		lista.exibirTarefas();
	}
}
