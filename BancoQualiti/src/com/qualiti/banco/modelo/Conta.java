package com.qualiti.banco.modelo;

import com.qualiti.banco.excecoes.BancoException;

public class Conta implements Comparable<Conta>{

	private String numero;
	private double saldo;
	private Cliente cliente;
	private TipoConta tipo;

	public void creditar(double valor) {
		this.saldo = saldo;
		saldo += valor;
	
	}

	
	public void debitar(double valor) throws BancoException{
	
		this.saldo = saldo;
		
		if(valor > saldo) {
			throw new BancoException("Saldo insuficiente.");
		}else {
			saldo -= valor;
		}
	}
	
	
	public void transferir(Conta contaDestino, double valor) throws BancoException {
		this.debitar(valor);
		contaDestino.creditar(valor);
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}


	public String toString() {
		return "Minha conta:\nNúmero: "
				+this.numero
					+"\nSaldo: "
						+this.saldo+"\n\n";
	}
	@Override
	public int compareTo(Conta arg0) {
		if(saldo == arg0.getSaldo()) {
			return 0;
		}
		if (saldo < arg0.getSaldo()) {
			return -1;
		}
		return 1;
	}

}
