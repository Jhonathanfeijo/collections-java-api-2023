package com.santander.set.pesquisa.convidado;

import java.util.Objects;

public class Convidado {
	private String nome;
	private int codigoConvidado;

	public Convidado(String nome, int codigoConvidado) {
		this.nome = nome;
		this.codigoConvidado = codigoConvidado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoConvidado() {
		return codigoConvidado;
	}

	public void setCodigoConvidado(int codigoConvidado) {
		this.codigoConvidado = codigoConvidado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoConvidado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvidado == other.codigoConvidado;
	}
	@Override
	public String toString() {
		return "Nome: " + this.nome + " / Codigo: " + this.codigoConvidado;
	}
}
