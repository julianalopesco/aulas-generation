package lacoCondicional;

import java.util.Scanner;

public class precoTotal {

	public static void main(String[] args) {

		double preco, valorTotal;
		int opcao,qtde;
		
		Scanner leitura = new Scanner(System.in);
		
		
		System.out.println("\n\t\tMenu de opções");
		System.out.println("\n1 - Cachorro quente");
		System.out.println("\n2 - X-Salada");
		System.out.println("\n3 - X-Bacon");
		System.out.println("\n4 - Bauru");
		System.out.println("\n5 - Refrigerante");
		System.out.println("\n6 - Suco de Laranja");

		System.out.println("\nDigite o produto desejado ");
		opcao = leitura.nextInt();
		System.out.println("\nDigite a quantidade desejada ");
		qtde = leitura.nextInt();
		
		switch(opcao) {
		
		case 1:
			preco = 10.00;
			valorTotal = qtde * preco;
			System.out.println("\nO valor total é "+valorTotal);
			break;
		}
		
		switch(opcao) {
		
		case 2:
			preco = 15.00;
			valorTotal = qtde * preco;
			System.out.println("\nO valor total é "+valorTotal);
			break;
			
		case 3:
			preco = 18.00;
			valorTotal = qtde * preco;
			System.out.println("\nO valor total é "+valorTotal);
			break;
			
		case 4:
			preco = 12.00;
			valorTotal = qtde * preco;
			System.out.println("\nO valor total é "+valorTotal);
			break;
			
		case 5:
			preco = 8.00;
			valorTotal = qtde * preco;
			System.out.println("\nO valor total é "+valorTotal);
			break;
			
		case 6:
			preco = 13.00;
			valorTotal = qtde * preco;
			System.out.println("\nO valor total é "+valorTotal);
			break;
			default:
			System.out.println("\nOpção inválida!");	
		}		
	
	}

}
