//Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos.
//A leitura dos dados deve ser finalizada ao digitar uma idade negativa.

package lacoDoWhile;

import java.util.Scanner;

public class qtdePessoas {

	public static void main(String[] args) {
		
		int idade,cont21=0,cont50=0; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0 ) {
			
			if(idade < 21) {
				cont21++;
			}else if(idade>50){
				cont50++;
			}
			System.out.println("\nEntre com um número, caso digite um número negativo o programa encerra");
			idade = leia.nextInt();
		}
		
		System.out.println("\nTotal de pessoas maiores de 21 anos: "+cont21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+cont50);
	}

}