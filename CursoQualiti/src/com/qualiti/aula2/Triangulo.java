package com.qualiti.aula2;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite tr�s valores referentes aos lados de um tri�ngulo:  ");
		double lado1 = leitor.nextDouble();
		double lado2 = leitor.nextDouble();
		double lado3 = leitor.nextDouble();

		System.out.println("Um tri�ngulo � poss�vel quando a soma de dois dos lados �  maior que o terceiro.");

//		Tri�ngulo equil�tero: possui os tr�s lados com medidas iguais.
//		Tri�ngulo is�sceles: possui dois lados com medidas iguais.
//		Tri�ngulo escaleno: possui os tr�s lados com medidas diferentes.

		if ((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2) {
			System.out.println("Tri�ngulo V�lido.");

			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("� um tri�ngulo equil�tero.");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("� um tri�ngulo is�sceles. ");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("� um tri�ngulo escaleno. ");
			}

		} else {
			System.out.println("Tri�ngulo Inv�lido. ");
		}

	}
}
