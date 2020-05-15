package com.qualiti.aula6;

public class TestaLivro {
	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.setTitulo("Use a cabeça - Java");
		l1.setIsbn("123456789");
		
		Autor a1 = new Autor();
		a1.setNome("James");
		a1.setSobrenome("Gosling");
		a1.setCpf("097.548.763-24");
		
		Autor a2 = new Autor();
		a2.setNome("Rafael");
		a2.setSobrenome("Oliveira");
		a2.setCpf("054.486.125-54");
		
		Autor a3 = new Autor();
		a3.setNome("Pedro");
		a3.setSobrenome("ASDF");
		a3.setCpf("044.547.414-55");
		
		Autor a4 = new Autor ("João");
		
		l1.adicionarAutor(a1);
		l1.adicionarAutor(a2);
		l1.adicionarAutor(a2);
		l1.adicionarAutor(a4);
		

	}

}
