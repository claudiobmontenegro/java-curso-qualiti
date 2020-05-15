package com.qualiti.aula4;

import java.util.Scanner;

public class ForcaDesafio2 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String[] palavra = new String[5];

		palavra[0] = "c";
		palavra[1] = "a";
		palavra[2] = "r";
		palavra[3] = "r";
		palavra[4] = "o";

		String[] palavraT = new String[5];

		palavraT[0] = "*";
		palavraT[1] = "*";
		palavraT[2] = "*";
		palavraT[3] = "*";
		palavraT[4] = "*";

		int tentativas = 15;

		System.out.println("Bem-vindo ao jogo da forca. Seu dever é descobrir a palavra secreta de 5 dígitos");

		while (tentativas != 0) {

			System.out.println("#######################");
			System.out.println("Tentativas Restantes: " + tentativas);
			System.out.println("#######################");
			System.out.println("Palavra atual: " + palavraT);
			System.out.println("Diga seu palpite: ");
			String tentativa = leitor.nextLine();

			for (int i = 0; i < palavra.length; i++) {

				if (palavra[i].equals(tentativa)) {
					System.out.println("ACERTOU!!!!!");
//					palavraT[i] = tentativa;
					continue;
				} else {
					System.out.println("Errou!!!");
					tentativas--;
				}
			}

		}

	}

}
