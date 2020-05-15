package com.qualiti.banco.dados;

import com.qualiti.banco.modelo.Cliente;
import com.qualiti.banco.modelo.Conta;

public interface ContaDAO {

	void inserir(Conta conta);
	Conta procurar(String numero);
	void remover(String numero);
	void atualizar(Conta conta);
	double total();
	Cliente maiorCliente();
}
