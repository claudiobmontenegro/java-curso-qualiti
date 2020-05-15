package com.qualiti.banco.negocio;

import com.qualiti.banco.dados.ContaDAO;
import com.qualiti.banco.excecoes.BancoException;
import com.qualiti.banco.modelo.Cliente;
import com.qualiti.banco.modelo.Conta;

public class ContaBOImpl implements ContaBO {

	private ContaDAO bancoDados;
	

	public ContaBOImpl(ContaDAO bancoDados) {
		this.bancoDados = bancoDados;
	}

	private void validarNumero(String numero) throws BancoException {
		if (numero == null || numero.length() < 6) {
			throw new BancoException("N�mero da conta inv�lido");
			
		}
	}

	private void validarConta (Conta conta) throws BancoException{
		if (conta == null) {
			throw new BancoException("Objeto conta vazio");
		}
		if (conta.getNumero() == null) {
			throw new BancoException("N�mero da conta inv�lido");
		}
		if (conta.getClass() == null) {
			throw new BancoException("Conta n�o possui cliente.");
		}
	}


	@Override
	public void inserir(Conta conta) throws BancoException {

		this.validarConta(conta);
		Conta contaBusca = bancoDados.procurar(conta.getNumero());
		if (contaBusca == null) {
			bancoDados.inserir(conta);
		} else {
			throw new BancoException("N�mero de conta j� cadastrado.");
		}
	}

	@Override
	public Conta procurar(String numero) throws BancoException {
		this.validarNumero(numero);

		return bancoDados.procurar(numero);
	}

	@Override
	public void remover(String numero) throws BancoException {
		this.validarNumero(numero);
		Conta contaBusca = bancoDados.procurar(numero);

		if (contaBusca != null) {
			bancoDados.remover(numero);
		} else {
			throw new BancoException("Conta n�o existe.");
		}

	}

	@Override
	public void atualizar(Conta conta) throws BancoException {
		this.validarConta(conta);
		Conta contaBusca = bancoDados.procurar(conta.getNumero());
		if (contaBusca != null) {
			bancoDados.atualizar(conta);
		} else {
			throw new BancoException("Conta n�o existe.");
		}

	}

	@Override
	public double total() {
		return bancoDados.total();
	}

	@Override
	public Cliente maiorCliente() {
		return bancoDados.maiorCliente();
	}



}
