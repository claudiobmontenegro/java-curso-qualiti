package com.qualiti.aula2;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite três valores referentes aos lados de um triângulo:  ");
		double lado1 = leitor.nextDouble();
		double lado2 = leitor.nextDouble();
		double lado3 = leitor.nextDouble();

		System.out.println("Um triângulo é possível quando a soma de dois dos lados é  maior que o terceiro.");

//		Triângulo equilátero: possui os três lados com medidas iguais.
//		Triângulo isósceles: possui dois lados com medidas iguais.
//		Triângulo escaleno: possui os três lados com medidas diferentes.

		if ((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2) {
			System.out.println("Triângulo Válido.");

			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("É um triângulo equilátero.");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("É um triângulo isósceles. ");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("É um triângulo escaleno. ");
			}

		} else {
			System.out.println("Triângulo Inválido. ");
		}

	}
}
