package com.qualiti.aula7;

public class Quadrado extends FiguraGeometrica{
	
	private double lado;
	
	
	public double calcularArea() {
		return lado*lado;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}

}
