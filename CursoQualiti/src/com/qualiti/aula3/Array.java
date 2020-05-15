package com.qualiti.aula3;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Array
		int [] num = new int[5];
		
		for(int i = 0 ; i < num.length ; i++) {
			
			System.out.println("Digite um numero inteiro: ");
			num[i] = leitor.nextInt();
			}
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}
