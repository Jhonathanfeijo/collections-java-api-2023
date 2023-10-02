package com.santander.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
	List<Integer> numeros;

	public OrdenacaoNumero() {
		numeros = new ArrayList<Integer>();
	}

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void adicionarNumero(Integer numero) {
		numeros.add(numero);
	}

	public List<Integer> ordenarCrescente() {
		List<Integer> ordemCrescente = new ArrayList<Integer>(numeros);
		Collections.sort(ordemCrescente);
		return ordemCrescente;
	}

	public List<Integer> ordenarDecrescente() {
		List<Integer> ordemDecrescente = ordenarCrescente();
		ordemDecrescente.sort(Collections.reverseOrder());
		return ordemDecrescente;
	}

	public static void main(String[] args) {
		System.out.println("Iniciando testes...");
		OrdenacaoNumero ordem = new OrdenacaoNumero();
		ordem.adicionarNumero(7);
		ordem.adicionarNumero(5);
		ordem.adicionarNumero(12);
		ordem.adicionarNumero(16);
		ordem.adicionarNumero(12);

		System.out.println(ordem.getNumeros());
		System.out.println(ordem.ordenarCrescente());
		System.out.println(ordem.ordenarDecrescente());

	}
}
