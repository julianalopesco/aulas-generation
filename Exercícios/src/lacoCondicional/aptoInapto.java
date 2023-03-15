package lacoCondicional;

import java.util.Scanner;

public class aptoInapto {

	public static void main(String[] args) {

		float idade;
		String nome;
		boolean primeiraDoacao; 

		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome: ");
		nome = leitura.next();
		System.out.println("\nDigite sua idade: ");
		idade = leitura.nextFloat();
		System.out.println("\nJá doou sangue antes? Escreva S para Sim ou N para não: ");
        String opcao = leitura.next();
        primeiraDoacao = opcao.equalsIgnoreCase("S");

		
		if(idade>=18 && idade<=69 && primeiraDoacao) {
			System.out.println(nome+" está apto(a) para doar sangue");
		}
		else {
			System.out.println(nome+" não está apto(a) para doar sangue");
		}
   }
} 