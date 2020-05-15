package com.qualiti.banco.gui;

import com.qualiti.banco.modelo.Conta;
import com.qualiti.banco.modelo.ContaBonus;
import com.qualiti.banco.modelo.Poupanca;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta c = new Poupanca();
		
		c.setSaldo(1385);
		
	    if(c instanceof Poupanca) {	
	    	Poupanca p = (Poupanca)c;
	    	p.renderJuros(0.1);
	    	//((Poupanca) c).renderJuros(1.2);
	    }
	    
	    Conta c2 = new ContaBonus();
	    c2.creditar(500);
	    
	    System.out.println(c2);
	    
	    System.out.println(c);
	}
}
