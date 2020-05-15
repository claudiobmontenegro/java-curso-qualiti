package com.qualiti.aula2;

import java.util.Scanner;

public class ParOuImpar {
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro que verfificarei se ele é par ou ímpar: ");
		int num = leitor.nextInt();
		
		num%=2;
		
		System.out.println(num);
		
		if (num == 0) {
			System.out.println("O numero é par.");
			System.out.println("Divisões sucessivas por 2 sobra: "+num);
		}else if (num != 0) {
			System.out.println("O numero é ímpar.");
			System.out.println("Divisões sucessivas por 2 sobra: "+num);		
	}
	
	
	}
}
