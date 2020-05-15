package com.qualiti.aula5;

public class Calculadora {

	public double somar(double a, double b) {
		return a + b;
	}

	public double subtrair(double a, double b) {
		return a - b;
	}
	
	public void imprimirBoasVindas(String nome) {
		System.out.println("Bem vindo: "+nome);
	}
	
	

	public static void main(String[] args) {

		Calculadora calc = new Calculadora(); // Objeto

		double resultado = calc.somar(8, 9);
		System.out.println(resultado);
		resultado = calc.subtrair(8, 9);
		System.out.println(resultado);
		
		calc.imprimirBoasVindas("Cláudio");
		

	}

}
