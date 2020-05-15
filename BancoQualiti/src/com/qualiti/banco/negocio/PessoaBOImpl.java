package com.qualiti.banco.negocio;

import com.qualiti.banco.dados.PessoaDAO;
import com.qualiti.banco.excecoes.BancoException;
import com.qualiti.banco.modelo.Pessoa;

public class PessoaBOImpl implements PessoaBO {

	private PessoaDAO bancoDados;

	public PessoaBOImpl(PessoaDAO bancoDados) {
		this.bancoDados = bancoDados;
	}

	private void validarCpf(String cpf) throws BancoException {
		if (cpf == null || cpf.length() < 14 || cpf.isEmpty()) {
			throw new BancoException("Cpf inválido");
		}
	}

	private void validarPessoa(Pessoa pessoa) throws BancoException {
		if (pessoa == null) {
			throw new BancoException("Objeto pessoa vazio");
		}
		this.validarCpf(pessoa.getCpf());

		if (pessoa.getNome() == null || pessoa.getNome().isEmpty()) {
			throw new BancoException("Nome inválido");
		}
	}

	@Override
	public void inserir(Pessoa pessoa) throws BancoException {

		this.validarPessoa(pessoa);
		Pessoa pessoaBusca = bancoDados.procurar(pessoa.getCpf());
		if (pessoaBusca == null) {
			bancoDados.inserir(pessoa);
		} else {
			throw new BancoException("Cpf já cadastrado.");
		}
	}

	@Override
	public Pessoa procurar(String cpf) throws BancoException {
		this.validarCpf(cpf);
		return bancoDados.procurar(cpf);
	}

	@Override
	public void remover(String cpf) throws BancoException {
		this.validarCpf(cpf);
		Pessoa pessoaBusca = bancoDados.procurar(cpf);

		if (pessoaBusca != null) {
			bancoDados.remover(cpf);
		} else {
			throw new BancoException("Cpf não existe.");
		}

	}

	@Override
	public void atualizar(Pessoa pessoa) throws BancoException {
		this.validarPessoa(pessoa);
		Pessoa pessoaBusca = bancoDados.procurar(pessoa.getCpf());
		if (pessoaBusca != null) {
			bancoDados.atualizar(pessoa);
		} else {
			throw new BancoException("Pessoa não existe.");
		}

	}
}
