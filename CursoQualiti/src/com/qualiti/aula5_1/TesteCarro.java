package com.qualiti.aula5_1;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Carro[] carrosArray = new Carro[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite o modelo do carro  " + (i + 1));
			String modelo = sc.next();
			System.out.println("Digite a montadora do carro  " + (i + 1));
			String montadora = sc.next();
			System.out.println("Digite o preco do carro  " + (i + 1));
			double preco = sc.nextDouble();

			Carro carro = new Carro();
			carro.setModelo(modelo);
			carro.setMontadora(montadora);
			carro.setPreco(preco);

			carrosArray[i] = carro;
		}
		
//	Lembrete-> 	Carro carro2 = carrosArray[0];

		for (int i = 0; i < 5; i++) {
			Carro carro = carrosArray[i];
			if (carro != null && carro.getPreco() >= 50000) {
				System.out.println(carro.getModelo());
				System.out.println(carro.getMontadora());
				System.out.println(carro.getPreco());
			}
		}

	}
}
