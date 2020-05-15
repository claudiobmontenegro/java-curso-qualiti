package com.qualiti.banco.dados;

import com.qualiti.banco.modelo.Cliente;
import com.qualiti.banco.modelo.Conta;

public class ContaDAOArrayImpl implements ContaDAO{
	
	private Conta[] repositorio;
	private int indice;
	
	public ContaDAOArrayImpl() {
		repositorio = new Conta[100];
		indice = 0;
	}

	@Override
	public void inserir(Conta conta) {
		repositorio[indice] = conta;
		indice++;
	}

	@Override
	public Conta procurar(String numero) {
		for(Conta c : repositorio) {
			if(c != null && c.getNumero().equals(numero)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void remover(String numero) {
		for(int i = 0; i < repositorio.length; i++) {
			Conta c = repositorio[i];
			if(c != null && c.getNumero().equals(numero)) {
				//c.setNumero(null);
				repositorio[i] = repositorio[indice-1];
				repositorio[indice-1] = null;
				indice--;
			}
		}
		
	}

	@Override
	public void atualizar(Conta conta) {
	
		for(int i = 0; i < repositorio.length; i++) {
			Conta c = repositorio[i];
			if(c != null && c.getNumero().equals(conta.getNumero())) {
				repositorio[i] = conta;
			}
		}
		

	}

	@Override
	public double total() {
		double somaTotal = 0;
		for (Conta c : repositorio) {
			somaTotal += c.getSaldo();
		}
		return somaTotal;
	}

	@Override
	public Cliente maiorCliente() {
		
		double maiorValor = 0;
		Conta maior = null;
		
		for(Conta c : repositorio) {
			if(maior == null) {
				maior = c;
			}else if(maior.getSaldo() < c.getSaldo()) {
				maior = c;
			}
		}
		return maior != null ?  maior.getCliente() : null;
	}


	
	

}
