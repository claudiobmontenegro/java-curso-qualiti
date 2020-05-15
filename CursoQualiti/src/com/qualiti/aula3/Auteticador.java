package com.qualiti.aula3;

import java.util.Scanner;

public class Auteticador {

	public static void main(String[] args) {

		boolean b = false;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Defina o usuario:  ");
		String user = leitor.nextLine();

		System.out.println("\nDefina a senha:  ");
		String password = leitor.nextLine();

		do {
			System.out.println("\nDigite o usuário: ");
			String usert = leitor.nextLine();

			System.out.println("\nDigite a senha: ");
			String passt = leitor.nextLine();

			if (!usert.equals(user) || !passt.equals(password)) {
				System.out.println("\nUsuário ou senha incorretos.");

			} else if (usert.equals(user) && passt.equals(password)){
				System.out.println("\nAutenticado com sucesso.");
				b = true;
			}
			
			//PROBLEMA DE COMPARAÇÃO DE STRINGS -----> NAO SE USA != ==

		} while (b == false);
		
	
		
		leitor.close();

	}

}
