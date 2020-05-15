package com.qualiti.aula2;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

//		System.out.println("Digite algum número inteiro de quatro algarismos:  ");
//		int numero = leitor.nextInt();
//		System.out.println("Seu número é : "+numero);
//		System.out.println("Algarismo da milhar: "+(numero/1000));
//		System.out.println("Algarismo da centena: "+(numero%1000)/100);
//		System.out.println("Algarismo decimal: "+(numero%100)/10);
//		System.out.println("Algarismo unitario: "+(numero%10));

		int x = 4;
		System.out.println(x);
		int y = x++;
		System.out.println(y);
		System.out.println(x);
		

//       brincando

//		String str = String.valueOf(numero);
//		
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));

		leitor.close();

	}

}
