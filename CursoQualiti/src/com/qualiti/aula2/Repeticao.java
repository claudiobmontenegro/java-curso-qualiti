package com.qualiti.aula2;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
//
//		int a = 0;
//
//		while (2000 >= a) {
//			System.out.println(a);
//			a++;
//		}

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um número que lhe direi o fatorial: ");
		long n = leitor.nextLong();
		long aux = 1;

		if (n == 1 || n == 0) {
			System.out.println("1");
		} else {
			while (n > 1) {

				aux = aux * n;
				System.out.println("\n" + aux);

				n--;

			}
		}
// imprimir todos números divisiveis por 3 e menores que 1000
/*
		int i = 1000;

		while (i > 1) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			i--;
		}
*/
	}

}
