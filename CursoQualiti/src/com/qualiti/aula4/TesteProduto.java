package com.qualiti.aula4;

public class TesteProduto {

	public static void main(String[] args) {

		Produto p1 = new Produto();

		p1.codigo = "123x";
		p1.nome = "Coca";
		p1.preco = 5.5;

		Produto p2 = new Produto();
		p2.codigo = "167-j";
		p2.nome = "Nescau";
		p2.preco = 4;

		Produto[] produtosArray = new Produto[5];
		produtosArray[0] = p1;
		produtosArray[1] = p2;

		System.out.println(p2.nome);
	}

}
