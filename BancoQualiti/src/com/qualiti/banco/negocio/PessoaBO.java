package com.qualiti.banco.negocio;

import com.qualiti.banco.excecoes.BancoException;
import com.qualiti.banco.modelo.Pessoa;

public interface PessoaBO {
	
	void inserir(Pessoa pessoa) throws BancoException;
	Pessoa procurar(String cpf) throws BancoException;
	void remover(String cpf) throws BancoException;
	void atualizar(Pessoa pessoa) throws BancoException;

}
