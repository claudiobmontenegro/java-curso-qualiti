package com.qualiti.aula7;


public class Circulo extends FiguraGeometrica {
	
	private double raio;
	private static final double pi = 3.14;
	
	
	
	public double calcularArea() {
		return pi*raio*raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
