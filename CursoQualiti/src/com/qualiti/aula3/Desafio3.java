package com.qualiti.aula3;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

//		System.out.println("Digite o numero desejado:");
//		int j = leitor.nextInt();
//
//		for (int i = 1; i <= j; j--) {
//			System.out.println(j);
//		}

//		for (int i = 1; i <= 10; i++) {
//			for (int m = 1; m <= 10; m++) {
//				System.out.println(i + " * " + m + " = " + i * m);
//			}
//
//		}
		//Varíavel de acumular valor 
		int j = 0;
		
		for (int i = 1; i <= 500; i++) {
			j += i;
			System.out.println(j);
		}
		
		
		leitor.close();

	}

}
