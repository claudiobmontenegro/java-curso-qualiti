package com.qualiti.aula7;

import java.util.Arrays;

public class Aviao implements IVoador, Comparable<Aviao>{
	
	private String nome;

	@Override
	public void voar() {
		System.out.println("Avião voando");
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public static void main(String[] args) {
		
		
		Aviao a1 = new Aviao();
		a1.setNome("Boeing A320");
		
		Aviao a2 = new Aviao();
		a2.setNome("Concorde");
		
		Aviao a3 = new Aviao();
		a3.setNome("MX-737");
		
		
		Aviao[] listaAvioes = new Aviao [3];
		listaAvioes[0] = a3;
		listaAvioes[1] = a2;
		listaAvioes[2] = a1;
		
		Arrays.sort(listaAvioes);
		
		for (Aviao a : listaAvioes) {
			System.out.println(a.getNome());
		}
		
	}

	@Override
	public int compareTo(Aviao arg0) {
		
		return nome.compareTo(arg0.getNome());
	}

}
