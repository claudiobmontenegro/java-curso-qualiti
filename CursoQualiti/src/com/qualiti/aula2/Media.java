package com.qualiti.aula2;

import java.util.Scanner;

public class Media {

	public static void main(String args[]) {
//		
//		double nota1 = 8;
//		double nota2 = 5;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a nota 1: ");
		double nota1 = leitor.nextDouble();

		System.out.println("Digite a nota 2: ");
		double nota2 = leitor.nextDouble();

		System.out.println("As faltas do aluno: ");
		int falta = leitor.nextInt();

		double media = (nota1 + nota2) / 2;

		System.out.println("Média atual: " + media);
		System.out.println("Quantidade de faltas: " + falta);

		if (media >= 7 && falta <= 5) {
			System.out.println("Aluno aprovado");
		} else if (media < 7 && media >= 0 || falta > 5) {
			System.out.println("Aluno reprovado");
		} else {
			System.out.println("Nota inválida");
		}

//		int a = 0;
//		int b = 1000;
//
//		while (b > 0) {
//			b = b / 2;
//			a++;
//			System.out.println("A = " + a + " B = " + b + " \n");
//		

	}

}
