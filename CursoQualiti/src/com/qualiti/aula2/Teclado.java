package com.qualiti.aula2;

import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		double num1 = leitor.nextDouble();

		System.out.println("Digite o segundo numero: ");
		double num2 = leitor.nextDouble();

		System.out.println("Digite o terceiro numero: ");
		double num3 = leitor.nextDouble();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1+" É o maior número.");
		}else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2+" É o maior número.");
		}else if (num3 >= num1 && num3 >= num2) {
			System.out.println(num3+" É o maior número.");
		}

		leitor.close();

	}

}
