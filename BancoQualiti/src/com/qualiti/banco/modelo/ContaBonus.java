package com.qualiti.banco.modelo;

public class ContaBonus extends Conta {
	

	private double bonus;
	
	
	//overriding
	@Override
	public void creditar(double valor) {
		bonus += valor*0.1;
		super.creditar(valor);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
