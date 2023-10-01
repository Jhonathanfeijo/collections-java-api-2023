package com.santander.list;

import java.util.ArrayList;
import java.util.List;

import com.santander.Livro;

public class CatalogoLivro {
	List<Livro> livros;

	public CatalogoLivro() {
		livros = new ArrayList<>();
	}

	public void adicionarLivro(Livro livro) {
		System.out.println("\nAdicionado com sucesso no catalogo o " + livro);
		livros.add(livro);
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		System.out.println("\n\nPesquisando por autor: " + autor);
		List<Livro> livrosAutor = new ArrayList<>();
		for (Livro livro : livros) {
			if (livro.getAutor().equalsIgnoreCase(autor))
				livrosAutor.add(livro);
		}
		return livrosAutor;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicio, int anoFinal) {

		List<Livro> livrosIntervalo = new ArrayList<>();
		if (anoInicio > anoFinal) {
			System.out.println("\n\nO ano final nao pode ser maior que o ano inicial");
		} else {
			System.out.println("\n\nProcurando livros entre os anos " + anoInicio + " e " + anoFinal);
			for (Livro livro : livros) {
				if (anoInicio <= livro.getAnoPub() && anoFinal >= livro.getAnoPub())
					livrosIntervalo.add(livro);
			}
		}
		return livrosIntervalo;
	}

	public List<Livro> pesquisarPorTitulo(String titulo) {
		System.out.println("\n\nProcurando o livro: " + titulo);
		List<Livro> livroEncontrado = new ArrayList<Livro>();
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				livroEncontrado.add(livro);
				break;
			}
		}
		return livroEncontrado;
	}

	public boolean encontrouLivro(List<Livro> listaLivros) {
		if (listaLivros.isEmpty()) {
			System.out.println("Nenhum livro foi encontrado baseado nas informações que foram fornecidas");
			return false;
		}
		System.out.println("Livros encontrados:  " + listaLivros.size() + "\n" + listaLivros);
		return true;
	}

	public static void main(String[] args) {
		CatalogoLivro catalogo = new CatalogoLivro();

		System.out.println("TESTANDO PESQUISA COM LISTA VAZIA");
		List<Livro> livrosAnos = catalogo.pesquisarPorIntervaloAnos(2000, 2025);
		catalogo.encontrouLivro(livrosAnos);

		List<Livro> livrosAutor = catalogo.pesquisarPorAutor("CELSO");
		catalogo.encontrouLivro(livrosAutor);

		List<Livro> livrosTitulo = catalogo.pesquisarPorTitulo("Titanic");
		catalogo.encontrouLivro(livrosTitulo);
		System.out.println("\n\nTERMINANDO TESTE");

		catalogo.adicionarLivro(new Livro("Celso", "A dificuldades diante a desigualdade", 1950));
		catalogo.adicionarLivro(new Livro("Naldo", "Encarando a vida como uma verdade", 2023));
		catalogo.adicionarLivro(new Livro("João", "Legal", 2007));

		System.out.println("\n\nINICIANDO PESQUISA DE LIVROS POR ANO COM LISTAS NAO VAZIAS");

		livrosAnos = catalogo.pesquisarPorIntervaloAnos(2000, 2025);
		catalogo.encontrouLivro(livrosAnos);

		livrosAnos = catalogo.pesquisarPorIntervaloAnos(1949, 2008);
		catalogo.encontrouLivro(livrosAnos);

		livrosAnos = catalogo.pesquisarPorIntervaloAnos(1960, 2002);
		catalogo.encontrouLivro(livrosAnos);

		livrosAnos = catalogo.pesquisarPorIntervaloAnos(2050, 2002);
		catalogo.encontrouLivro(livrosAnos);

		System.out.println("\n\nTERMINANDO TESTE\n\nCOMECANDO PESQUISA POR LIVROS DE AUTOR");

		livrosAutor = catalogo.pesquisarPorAutor("Jhon");
		catalogo.encontrouLivro(livrosAutor);

		livrosAutor = catalogo.pesquisarPorAutor("CELSO");
		catalogo.encontrouLivro(livrosAutor);

		livrosAutor = catalogo.pesquisarPorAutor("Gerson");
		catalogo.encontrouLivro(livrosAutor);

		System.out.println("\n\nTERMINANDO TESTE\n\nCOMECANDO TESTE POR TITULO DE LIVRO");

		livrosTitulo = catalogo.pesquisarPorTitulo("Vasco");
		catalogo.encontrouLivro(livrosTitulo);

		livrosTitulo = catalogo.pesquisarPorTitulo("legal");
		catalogo.encontrouLivro(livrosTitulo);

		System.out.println("\n\nTERMINANDO TESTE\n\nFINALIZANDO PROGRAMA");

	}
}