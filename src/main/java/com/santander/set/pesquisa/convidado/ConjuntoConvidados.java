package com.santander.set.pesquisa.convidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	Set<Convidado> convidados;

	public ConjuntoConvidados() {
		this.convidados = new HashSet<Convidado>();
	}

	public Set<Convidado> getConvidados() {
		return convidados;
	}

	public void setConvidados(Set<Convidado> convidados) {
		this.convidados = convidados;
	}

	public void adicionarConvidado(Convidado convidado) {
		this.convidados.add(convidado);
	}

	public void removerConvidado(int codigoConvidado) {
		Convidado convidadoRemovido = null;
		for (Convidado convidado : convidados) {
			if (convidado.getCodigoConvidado() == codigoConvidado) {
				convidadoRemovido = convidado;
				convidados.remove(convidadoRemovido);
			}
		}
	}

	public int contarConvidados() {
		return this.convidados.size();
	}

	public static void main(String[] args) {
		ConjuntoConvidados setConvidados = new ConjuntoConvidados();
		setConvidados.adicionarConvidado(new Convidado("Jhon", 1));
		setConvidados.adicionarConvidado(new Convidado("Ana", 2));
		setConvidados.adicionarConvidado(new Convidado("Celso", 2));

		System.out.println(setConvidados.contarConvidados());
		System.out.println(setConvidados.getConvidados());
	}

}
