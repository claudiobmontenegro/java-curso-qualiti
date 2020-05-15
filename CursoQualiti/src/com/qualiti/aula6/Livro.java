package com.qualiti.aula6;

public class Livro {

	private String titulo;
	private String isbn;
	private Autor[] Autores;
	private int indice;
	
	//Construtor default
	public Livro() {
		Autores = new Autor[5];
		indice = 0;
	}
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public Autor[] getAutores() {
		return Autores;
	}


	public void setAutores(Autor[] autores) {
		Autores = autores;
	}


	public int getIndice() {
		return indice;
	}


	public void setIndice(int indice) {
		this.indice = indice;
	}


	public void adicionarAutor(Autor autor) {
		Autores[indice] = autor;
		indice++;
	}
	
}
