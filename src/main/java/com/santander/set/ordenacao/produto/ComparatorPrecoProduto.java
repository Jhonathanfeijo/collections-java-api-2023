package com.santander.set.ordenacao.produto;

import java.util.Comparator;

public class ComparatorPrecoProduto implements Comparator<Produto> {

	@Override
	public int compare(Produto produto1, Produto produto2) {
		return Double.compare(produto1.getPreco(), produto2.getPreco());
	}
}
