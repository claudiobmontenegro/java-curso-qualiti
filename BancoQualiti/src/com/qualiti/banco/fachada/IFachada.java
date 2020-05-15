package com.qualiti.banco.fachada;

import com.qualiti.banco.excecoes.BancoException;
import com.qualiti.banco.modelo.Cliente;
import com.qualiti.banco.modelo.Conta;
import com.qualiti.banco.modelo.Pessoa;

public interface IFachada {

	//ContaBO
	void inserirConta(Conta conta) throws BancoException;
	Conta procurarConta(String numero)throws BancoException;
	void removerConta(String numero)throws BancoException;
	void atualizarConta(Conta conta)throws BancoException;
	double total();
	Cliente maiorCliente();
	
	
	//PessoaBO
	void inserirPessoa(Pessoa pessoa) throws BancoException;
	Pessoa procurarPessoa(String cpf) throws BancoException;
	void removerPessoa(String cpf) throws BancoException;
	void atualizarPessoa(Pessoa pessoa) throws BancoException;
	
}
