package lacoCondicional;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		float n1,n2,resultado;
		int operacao;
		
		Scanner leitura = new Scanner(System.in);

		System.out.println("\nDigite o primeiro número:");
		n1 = leitura.nextFloat();
		
		System.out.println("\nDigite o segundo número:");
		n2 = leitura.nextFloat();
		
		System.out.println("\nEscolha a operação desejada ");
		System.out.println("\n\t\tMenu de opções");
		System.out.println("\n1 - Soma");
		System.out.println("\n2 - Subtração");
		System.out.println("\n3 - Multiplicação");
		System.out.println("\n4 - Divisão");
		operacao = leitura.nextInt();
		
		switch(operacao) {
		
		case 1:
			resultado = n1 + n2;
			System.out.println("\nO resultado é "+resultado);
			break;
		case 2:
			resultado = n1 - n2;
			System.out.println("\nO resultado é "+resultado);
			break;
		case 3:
			resultado = n1 * n2;
			System.out.println("\nO resultado é "+resultado);
			break;
		case 4:
			resultado = n1 / n2;
			System.out.println("\nO resultado é "+resultado);
			break;
			default:
			System.out.println("\nOpção inválida!");	
		}		
	
	}

}
