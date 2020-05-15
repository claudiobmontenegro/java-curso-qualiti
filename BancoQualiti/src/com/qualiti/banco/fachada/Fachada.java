package com.qualiti.banco.fachada;

import com.qualiti.banco.dados.ContaDAO;
import com.qualiti.banco.dados.ContaDAOArrayImpl;
import com.qualiti.banco.dados.PessoaDAO;
import com.qualiti.banco.dados.PessoaDAOArrayImpl;
import com.qualiti.banco.excecoes.BancoException;
import com.qualiti.banco.modelo.Cliente;
import com.qualiti.banco.modelo.Conta;
import com.qualiti.banco.modelo.Pessoa;
import com.qualiti.banco.negocio.ContaBO;
import com.qualiti.banco.negocio.ContaBOImpl;
import com.qualiti.banco.negocio.PessoaBO;
import com.qualiti.banco.negocio.PessoaBOImpl;

// Padrão singleton
public class Fachada implements IFachada {

	private ContaBO negocioConta;
	private PessoaBO negocioPessoa;
	private static IFachada fachada;

	public static IFachada getInstance() {
		if (fachada == null) {
			fachada = new Fachada();
		}
		return fachada;
	}

	private Fachada() {

		ContaDAO bdContas = new ContaDAOArrayImpl();
		PessoaDAO bdPessoas = new PessoaDAOArrayImpl();

		negocioConta = new ContaBOImpl(bdContas);
		negocioPessoa = new PessoaBOImpl(bdPessoas);

	}

	@Override
	public void inserirConta(Conta conta) throws BancoException {

		negocioConta.inserir(conta);
	}

	@Override
	public Conta procurarConta(String numero) throws BancoException {

		return negocioConta.procurar(numero);
	}

	@Override
	public void removerConta(String numero) throws BancoException {

		negocioConta.remover(numero);

	}

	@Override
	public void atualizarConta(Conta conta) throws BancoException {

		negocioConta.atualizar(conta);

	}

	@Override
	public double total() {

		return negocioConta.total();
	}

	@Override
	public Cliente maiorCliente() {

		return negocioConta.maiorCliente();
	}

	@Override
	public void inserirPessoa(Pessoa pessoa) throws BancoException {

		negocioPessoa.inserir(pessoa);
	}

	@Override
	public Pessoa procurarPessoa(String cpf) throws BancoException {

		return negocioPessoa.procurar(cpf);
	}

	@Override
	public void removerPessoa(String cpf) throws BancoException {

		negocioPessoa.remover(cpf);

	}

	@Override
	public void atualizarPessoa(Pessoa pessoa) throws BancoException {

		negocioPessoa.atualizar(pessoa);

	}

}
