package com.qualiti.aula7;

public class Triangulo extends FiguraGeometrica{
	
	private double lado;
	private double base;
	
	public double calcularArea() {
		return (lado*base)/2;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

}
