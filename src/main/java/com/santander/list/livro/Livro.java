package com.santander.list.livro;

public class Livro {
	private String autor;
	private String titulo;
	private int anoPub;

	public Livro(String autor, String titulo, int anoPub) {
		this.autor = autor;
		this.titulo = titulo;
		this.anoPub = anoPub;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoPub() {
		return anoPub;
	}

	public void setAnoPub(int anoPub) {
		this.anoPub = anoPub;
	}
	
	@Override
	public String toString() {
		return "Livro: " + this.titulo + ", autor: " + this.autor + ", ano de publicação: " +  this.anoPub  ;
	}
}
