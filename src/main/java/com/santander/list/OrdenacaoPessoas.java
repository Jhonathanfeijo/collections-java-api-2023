package com.santander.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.santander.Pessoa;
import com.santander.comparator.PessoaComparatorAltura;

public class OrdenacaoPessoas {
	List<Pessoa> listaPessoas;

	public List<Pessoa> getListaPessoas() {
		return listaPessoas;
	}

	public OrdenacaoPessoas() {
		this.listaPessoas = new ArrayList<Pessoa>();
	}

	public void adicionaPessoa(String nome, int idade, double altura) {
		listaPessoas.add(new Pessoa(nome, idade, altura));
	}

	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}

	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<Pessoa>(listaPessoas);
		Collections.sort(pessoasPorAltura, new PessoaComparatorAltura());
		return pessoasPorAltura;
	}

	public static void main(String[] args) {
		OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();
		ordenacao.adicionaPessoa("Nome 1", 18, 1.60);
		ordenacao.adicionaPessoa("Nome 2", 10, 1.70);
		ordenacao.adicionaPessoa("Nome 3", 14, 1.50);
		System.out.println(ordenacao.getListaPessoas());
		System.out.println(ordenacao.ordenarPorAltura());
		System.out.println(ordenacao.ordenarPorIdade());
		
	}

}
