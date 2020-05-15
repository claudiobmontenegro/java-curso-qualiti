package com.qualiti.banco.gui;

import com.qualiti.banco.excecoes.BancoException;
import com.qualiti.banco.fachada.Fachada;
import com.qualiti.banco.fachada.IFachada;
import com.qualiti.banco.modelo.Cliente;
import com.qualiti.banco.modelo.Conta;
import com.qualiti.banco.modelo.Poupanca;
import com.qualiti.banco.modelo.TipoConta;

public class BancoMain {

	public static void main(String[] args) {

		// SINGLETON
		IFachada fachada = Fachada.getInstance();

		Cliente cli = new Cliente();

		cli.setNome("Maria");
		cli.setCpf("13254");

		Conta c1 = new Conta();
		c1.setNumero("123456");
		c1.setSaldo(100);
		c1.creditar(500);
		c1.setCliente(cli);
		
		TipoConta tipo = TipoConta.POUPANCA;
		c1.setTipo(tipo);
		
		try {
			c1.debitar(800);
			System.out.println("Débito realizado com sucesso;");
		} catch (BancoException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Até o proximo debito.");
		}

		try {
			fachada.inserirConta(c1);
		} catch (BancoException e) {
			System.out.println(e.getMessage());
		}

		Conta contaBusca;
		try {
			contaBusca = fachada.procurarConta("123456");
			if (contaBusca == null) {
				System.out.println("Conta não encontrada");
			} else {
				System.out.println("Conta cadastrada");
			}

		} catch (BancoException e) {
			System.out.println(e.getMessage());
		}

		Cliente cli2 = new Cliente();
		cli2.setNome("Cláudio");
		cli2.setCpf("123456");

		Poupanca p1 = new Poupanca();
		p1.setNumero("1111-1");
		p1.setSaldo(2000);
		p1.setCliente(cli2);

		try {
			fachada.inserirConta(p1);
			fachada.removerConta("1111-1");
		} catch (BancoException e) {
			System.out.println(e.getMessage());
		}

		try {
			contaBusca = fachada.procurarConta("1111-1");
			if (contaBusca == null) {
				System.out.println("Conta não encontrada");
			} else {
				System.out.println("Conta cadastrada");
			}
		} catch (BancoException e) {
			System.out.println(e.getMessage());
		}

	}

//		Conta c1 = new Conta();
//		
//		c1.setSaldo(1735);
//		c1.setNumero("2009-c");
//		
//		Conta c2 = new Conta();
//		
//		c2.setSaldo(1325);
//		c2.setNumero("1337-b");
//		
//		
//		System.out.println("Saldo atual conta 1 = "+c1.getSaldo());
//		System.out.println("Saldo atual conta 2 = "+c2.getSaldo());
//		
//		c1.debitar(999);
//		System.out.println("Novo saldo c1 = "+c1.getSaldo());
//		c2.creditar(999);
//		System.out.println("Novo saldo c2 = "+c2.getSaldo());
//		
//		c1.transferir(c2, 100);
//		c2.transferir(c1, 200);
//		
//		System.out.println(c1.getSaldo());
//		
//		System.out.println(c2.getSaldo());
//		
//		
//		Poupanca p= new Poupanca();
//		p.setNumero("999-9");
//		p.setSaldo(800);
//		p.creditar(200);
//		p.renderJuros(0.1);
//		
//		System.out.println(p.getSaldo());
//		
//		Conta c3 = new Conta();
//		c3.setSaldo(1333);
//		
//		Conta c4 = new Conta();
//		c4.setSaldo(2800);
//		
//		Conta[] arrayContas = new Conta[4];
//		arrayContas[0] = c1;
//		arrayContas[1] = c2;
//		arrayContas[2] = c3;
//		arrayContas[3] = c4;
//		
//		Arrays.sort(arrayContas);
//		
//		for(Conta a : arrayContas) {
//			System.out.println(a.getSaldo());
//		}
//		
//		
//	}
	
}
