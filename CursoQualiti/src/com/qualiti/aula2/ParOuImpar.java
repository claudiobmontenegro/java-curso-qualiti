package com.qualiti.aula2;

import java.util.Scanner;

public class ParOuImpar {
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro que verfificarei se ele � par ou �mpar: ");
		int num = leitor.nextInt();
		
		num%=2;
		
		System.out.println(num);
		
		if (num == 0) {
			System.out.println("O numero � par.");
			System.out.println("Divis�es sucessivas por 2 sobra: "+num);
		}else if (num != 0) {
			System.out.println("O numero � �mpar.");
			System.out.println("Divis�es sucessivas por 2 sobra: "+num);		
	}
	
	
	}
}
