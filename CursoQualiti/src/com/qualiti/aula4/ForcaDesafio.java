/*package com.qualiti.aula4;

import java.util.Scanner;

public class ForcaDesafio {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int acertos = 0;

		System.out.println("Quantas letras tem a palavra que deseja ser testada? ");
		int tamanho = leitor.nextInt();

		String[] palavra = new String[tamanho];
		String [] palavraT = new String[tamanho];
		for(int i = 0; i < palavraT.length; i++) {
			palavraT[i] = i;
		}

		for (int i = 0; i < tamanho; i++) {
			System.out.println("\nDigite, letra por letra, a palavra a ser testada: ");
			palavra[i] = leitor.next();
		}

		System.out.println("\nTamanho da palavra: " + tamanho);

		System.out.println("\nVamos lá!");


		for (int j = 0; j < tamanho; j++) {
			int tentativas = 10;
			System.out.println("Tentativas restantes: "+tentativas);
			System.out.println("Digite a letra a ser testada: ");
			String tentativa = leitor.next();
			System.out.println(palavraT);

			if (palavra[j].equals(tentativa)) {
				acertos++;
				System.out.println("ACERTOUU!!!\n");
				palavraT.charAt(j) = tentativa;
				
			} else {
				--tentativas;
				System.out.println("ERROU!\n");
			}
			
			if(tentativas == 0) {
				System.out.println("Voce perdeu!");
				break;
			}

		}

	}

}
*/