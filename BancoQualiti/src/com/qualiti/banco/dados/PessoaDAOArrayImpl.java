package com.qualiti.banco.dados;

import com.qualiti.banco.modelo.Pessoa;

public class PessoaDAOArrayImpl implements PessoaDAO{
	
	private Pessoa[] repositorio;
	private int indice;
	
	public PessoaDAOArrayImpl() {
		repositorio = new Pessoa[100];
		indice = 0;
	}


	@Override
	public void inserir(Pessoa pessoa) {
		
		repositorio[indice] = pessoa;
		indice++;
		
	}

	@Override
	public void remover(String cpf) {
		for(int i = 0; i < repositorio.length; i++) {
			Pessoa p = repositorio[i];
			if(p != null && p.getCpf().equals(cpf)) {
				//c.setNumero(null);
				repositorio[i] = repositorio[indice-1];
				repositorio[indice-1] = null;
				indice--;
			}
		}
	}

	@Override
	public Pessoa procurar(String cpf) {
		for(Pessoa p : repositorio) {
			if(p != null && p.getCpf().equals(cpf)) {
				return p;
			}
		}
		return null;
	}

	@Override
	public void atualizar(Pessoa pessoa) {
		for(int i = 0; i < repositorio.length; i++) {
			Pessoa p = repositorio[i];
			if(p != null && p.getCpf().equals(pessoa.getCpf())) {
				repositorio[i] = pessoa;
			}
		}
		
		
	}

}
