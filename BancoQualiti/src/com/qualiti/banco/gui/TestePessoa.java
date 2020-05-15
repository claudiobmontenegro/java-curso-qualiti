package com.qualiti.banco.gui;

import com.qualiti.banco.modelo.Cliente;
import com.qualiti.banco.modelo.Gerente;
import com.qualiti.banco.modelo.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		
		
		
		//Ctrl+shift+o importa
		Pessoa[] pessoas = new Pessoa[5];
		
		Cliente c = new Cliente();
		
		c.setCpf("123-234");
		c.setNome("Ana Maria");
		
		pessoas[0] = c;
		
		Gerente g1 = new Gerente();
		
		g1.setCpf("939-102");
		g1.setNome("Lucas");
		g1.setSalario(8000);
		
		
		pessoas[1] = g1;
		
		int qtdCliente = 0;
		int qtdGerente = 0;
		for(Pessoa p : pessoas) {
			
			if(p instanceof Cliente) {
				qtdCliente++;
			}else if (p instanceof Gerente) {
				qtdGerente++;
			}
			
		}
		
		System.out.println("Quantidade de gerentes: "+qtdGerente);
		System.out.println("Quantidade de clientes: "+qtdCliente);
		
	}
	
	
}
