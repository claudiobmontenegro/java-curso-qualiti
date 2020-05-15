package com.qualiti.banco.negocio;

import com.qualiti.banco.excecoes.BancoException;
import com.qualiti.banco.modelo.Cliente;
import com.qualiti.banco.modelo.Conta;

public interface ContaBO {


	void inserir(Conta conta) throws BancoException;
	Conta procurar(String numero) throws BancoException;
	void remover(String numero) throws BancoException;
	void atualizar(Conta conta) throws BancoException;
	double total();
	Cliente maiorCliente();
	
}
