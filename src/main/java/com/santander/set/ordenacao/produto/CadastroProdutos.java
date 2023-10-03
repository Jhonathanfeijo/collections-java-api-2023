package com.santander.set.ordenacao.produto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	Set<Produto> produtos;

	public CadastroProdutos() {
		produtos = new HashSet<Produto>();
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}

	public void adicionarProduto(long cod, String descricao, double preco, int quantidade) {
		produtos.add(new Produto(cod, descricao, preco, quantidade));
	}

	public Set<Produto> ordenarProdutosPorNome() {
		Set<Produto> produtosOrdenadosPorNome = new TreeSet<Produto>(produtos);
		return produtosOrdenadosPorNome;
	}

	public Set<Produto> ordenarProdutosPorPreco() {
		Set<Produto> produtosOrdenadosPorPreco = new TreeSet<Produto>(new ComparatorPrecoProduto());
		produtosOrdenadosPorPreco.addAll(produtos);
		return produtosOrdenadosPorPreco;
	}

	public void exibirProdutos(Set<Produto> produtos) {
		if (produtos.isEmpty() || produtos == null)
			System.out.println("Não há produtos");
		else {
			for (Produto produto : produtos)
				System.out.println(produto);
		}
	}

	public static void main(String[] args) {
		CadastroProdutos produtos = new CadastroProdutos();
		produtos.exibirProdutos(produtos.getProdutos());

		System.out.println();

		produtos.adicionarProduto(1, "Coca", 8.0, 5);
		produtos.adicionarProduto(2, "Pepsi", 5.0, 2);
		produtos.adicionarProduto(2, "Pepsi 2", 5.0, 2);
		produtos.adicionarProduto(3, "Banana", 1.0, 9);
		produtos.exibirProdutos(produtos.getProdutos());

		System.out.println();

		produtos.exibirProdutos(produtos.ordenarProdutosPorNome());
		
		System.out.println();
		
		produtos.exibirProdutos(produtos.ordenarProdutosPorPreco());

	}

}
