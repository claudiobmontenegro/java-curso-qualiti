package com.qualiti.banco.modelo;

public class Poupanca extends Conta {
	
	public void renderJuros(double taxa) {
		double saldoComJuros = this.getSaldo()+ this.getSaldo()*taxa;
		this.setSaldo(saldoComJuros);
	}

}
