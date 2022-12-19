package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String vazio = " Alura ";
		String outroVazio = vazio.trim(); //o trim tira os espaços
		
		
		
		System.out.println(outroVazio);
		
		int a = 3;
		String nome = "Alura"; 
		//String outro= new String("Alura"); //mostrando que String é um objeto

		System.out.println(nome.length()); // tamanho da string
		
		for(int i = 0; i < nome.length(); i++) {
			
			System.out.println(nome.charAt(i)); //imprimindo letra por letra
			
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
//		
//		int posicao = nome.indexOf("ur");
//		System.out.println(posicao);// mostra a ´psicao das letras ur
//		
//		char c = nome.charAt(2);
//		System.out.println(c);
//		
//		
		
//		
//		char c = 'a'; // char usa aspas simples
//		char d = 'A'; 
////		
////		String outra = nome.replace(c, d);
//		
//		///nome.toLowerCase() não funciona pois a String não pode ser alterada, sendo o conceito de imutabilidade
//		System.out.println(nome);
//		System.out.println(outra);
		
		
		
	}

}
