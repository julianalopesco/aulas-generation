//Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.
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