package com.qualiti.banco.dados;

import com.qualiti.banco.modelo.Pessoa;

public interface PessoaDAO {
	
	void inserir(Pessoa pessoa);
	void remover(String cpf);
	Pessoa procurar(String cpf);
	void atualizar(Pessoa pessoa);

}
