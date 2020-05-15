package com.qualiti.aula4;

public class String1 {

	public static void main(String[] args) {

		String nome = "Pernambuco";
		String nomeAlterado = "";

		char letra = nome.charAt(4);

		System.out.println(letra);

		if (nome.startsWith("a")) {
			System.out.println("Deu");
		} else {
			char letraInicial = nome.charAt(0);
			System.out.println("Nome começa com " + letraInicial);
		}

		System.out.println("Tamanho é : " + nome.length());

		if (nome.contains("a") || nome.contains("A")) {
			System.out.println("Contém");
			nomeAlterado = nome.replaceAll("a", "-");

		} else {
			System.out.println("Não contém");
		}
		System.out.println(nomeAlterado);
		System.out.println(nome);
		
		
		String meses = "janeiro, fevereiro, marco, abril";
		String [] mesesSep = meses.split(",");
		
		for (int i = 0; i < mesesSep.length; i++) {
			System.out.println(mesesSep[i]);
		}
		
		int index = meses.indexOf("f");
		System.out.println(index);
		
		String teste = "%Brasil%";
	
		
		System.out.println(teste.substring(1,7));
		
		
	}
}