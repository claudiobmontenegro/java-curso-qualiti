package com.qualiti.aula5;

public class TestaAluno {

	public static void main(String[] args) {

		Endereco end1 = new Endereco();
		
		end1.setBairro("Mana�ra");
		end1.setCep("58038111");
		end1.setCidade("Jo�o Pessoa");
		end1.setComplemento("Apto 203");
		end1.setLogradouro("Euzely Fabr�cio");
		end1.setNumero("1071");
		end1.setUf("PB");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setMatricula("1810022607");
		aluno1.setNome("Claudio");
		aluno1.setEndereco(end1);
		
		System.out.println(aluno1.getNome());
		
		

	}

}
