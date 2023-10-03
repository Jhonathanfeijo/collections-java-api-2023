package com.santander.set.ordenacao.produto;

import java.util.Objects;

public class Produto implements Comparable<Produto>{

	private String descricao;
	private double preco;
	private int quantidade;
	private long cod;
	
	public Produto(long cod, String descricao, double preco, int quantidade) {

		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
		this.cod = cod;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao= descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(cod, other.cod);
	}
	@Override
	public int compareTo(Produto produto) {
		return this.descricao.compareToIgnoreCase(produto.getDescricao());
	}
	@Override
	public String toString() {
		return this.cod + " - " + this.descricao + " - R$ " + this.preco + " -  Quantidade: " + this.quantidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public long getCod() {
		return cod;
	}
	public void setCod(long cod) {
		this.cod = cod;
	}
}
