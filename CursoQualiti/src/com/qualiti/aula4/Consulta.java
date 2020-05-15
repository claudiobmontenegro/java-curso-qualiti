package com.qualiti.aula4;

import java.util.Scanner;

public class Consulta {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String[] nome = new String[5];
		String[] codigo = new String[5];
		double[] preco = new double[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite o nome do produto: ");
			nome[i] = leitor.next();
			System.out.println("Digite o codigo do produto: ");
			codigo[i] = leitor.next();
			System.out.println("Digite o preco do produto: ");
			preco[i] = leitor.nextDouble();
		}

		boolean quit = false;
		int opcao = 0;
		do {
			System.out.println("Selecione a opção: ");
			System.out.println("1- Buscar produto");
			System.out.println("2- Sair");
			opcao = leitor.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o codigo do produto");
				String codigoBusca = leitor.next();
				for (int i = 0; i < 5; i++) {
					if(codigo[i].equals(codigoBusca)) {
						System.out.println(codigo[i]);
						System.out.println(nome[i]);
						System.out.println(preco[i]);
						break;
					}else {
						System.out.println("Codigo nao cadastrado. ");
					}
				}
				
				
				break;
			case 2:
				quit = true;
				break;

			default:
				System.out.println("Opcao invalida");

			}

		} while (!quit);

	}

}
