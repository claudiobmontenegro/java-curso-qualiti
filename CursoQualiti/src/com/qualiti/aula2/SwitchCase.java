package com.qualiti.aula2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		double n1 = leitor.nextDouble();
		System.out.println("Digite um n�mero: ");
		double n2 = leitor.nextDouble();

		System.out.println("Digite op��o de opera��o, sendo \n1-Somar\n2-Subrair\n3-Multiplicar\n4-Dividir\n5-Resto");
		int i = leitor.nextInt();

		double n3;

		switch (i) {
		case 1:
			n3 = n1 + n2;
			System.out.println("Resultado: " + n3);
			break;
		case 2:
			n3 = n1 - n2;
			System.out.println("Resultado: " + n3);
			break;
		case 3:
			n3 = n1 * n2;
			System.out.println("Resultado: " + n3);
			break;
		case 4:
			n3 = n1 / n2;
			System.out.println("Resultado: " + n3);
			break;
		case 5:
			n3 = n1 % n2;
			System.out.println("Resultado: " + n3);
			break;
		default:
			System.out.println("Op��o inv�lida.");
		}

	}

}
