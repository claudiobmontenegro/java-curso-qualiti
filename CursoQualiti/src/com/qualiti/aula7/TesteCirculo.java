package com.qualiti.aula7;

public class TesteCirculo {
	
	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		
		c1.setRaio(4.1);
		
		Circulo c2 = new Circulo();
		
		c2.setRaio(5.6);
		
		double a1 = c1.calcularArea();
		double a2 = c2.calcularArea();
		
		System.out.println("Area 1 = "+a1);
		System.out.println("Area 2 = "+a2);
		
		Quadrado q1 = new Quadrado();
		q1.setLado(10);
		System.out.println("Area quadrado = "+q1.calcularArea());
	
	
	}

}
