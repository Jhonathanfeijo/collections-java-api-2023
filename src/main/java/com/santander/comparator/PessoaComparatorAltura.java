package com.santander.comparator;

import java.util.Comparator;

import com.santander.Pessoa;

public class PessoaComparatorAltura implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa pessoa1, Pessoa pessoa2) {
		return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
	}

}
