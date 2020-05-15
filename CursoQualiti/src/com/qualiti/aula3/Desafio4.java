package com.qualiti.aula3;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {

		int gabarito[] = new int[10];
		int resposta[] = new int[10];
		int acertos = 0;

		Scanner leitor = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite o GABARITO da questão " + (i + 1) + " sendo: \n1-A\t2-B\t3-C\t4-D\t5-E");
			gabarito[i] = leitor.nextInt();	
		}
		for (int i = 0; i < 10; i++) {

			System.out.println("Agora digite sua reposta na questão " + (i + 1) + "Sendo: \n1-A\t2-B\t3-C\t4-D\t5-E");
			resposta[i] = leitor.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (gabarito[i] == resposta[i]) {
				acertos++;
			}
		}

		System.out.println("Voce acertou " + acertos + " de 10. Parabéns");

		leitor.close();

	}

}
