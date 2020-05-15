package com.qualiti.aula4;

public class String2 {

	
	public static void main(String[] args) {
		
		String email = "ana@gmail.com,maria@gmail.com,joao@gmail.com";
		
		email = email.replaceAll("@gmail.com","  ");
		email = email.replaceAll(",","");
		
		System.out.println(email);
;
		
	}
	
	
	
}
