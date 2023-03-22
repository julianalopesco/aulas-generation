//Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá ler o tipo de operação a ser realizada com base na tabela abaixo (número inteiro entre 1 e 3) e o valor a ser depositado ou sacado (somente nas opções 2 e 3).
//Considere que um saque só pode ser realizado caso haja saldo suficiente. 
//Ao final de cada operação, exiba o novo Saldo na tela. A variável saldo (float), será inicializada com o valor de R$ 1000.00. Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!


package lacoCondicional;

import java.util.Scanner;

public class contaBancaria {

	public static void main(String[] args) {

		int op; 
		float saldo=1000, deposito, saque, novoSaldo; 

		Scanner leitura = new Scanner(System.in);

		System.out.println("\nEscolha a operação desejada ");
		System.out.println("\n\t\tMenu de opções");
		System.out.println("\n1 - Exibir saldo");
		System.out.println("\n2 - Realizar saque");
		System.out.println("\n3 - Realizar depósito");
		op = leitura.nextInt();
		
		
		switch (op) { 
		
		case 1: 
			System.out.println("\nO seu saldo é de: R$ "+saldo);
			break;
			
		case 2: 
			System.out.println("\nDigite o valor a ser sacado: ");
			saque = leitura.nextFloat(); 
			
			if (saque<=saldo) {
			novoSaldo = saldo - saque; 
			System.out.println("\nO seu saldo é de: R$ "+novoSaldo);
			}else {
				System.out.println("\nSaldo insuficiente!");
			}
			break;
			
		case 3: 
			System.out.println("\nDigite o valor a ser depositado: ");
			deposito = leitura.nextFloat(); 
			
			novoSaldo = saldo + deposito;
			System.out.println("\nO seu saldo é de: R$ "+novoSaldo);
			
			break;
			default:
			System.out.println("\nOpção inválida!");	
		}
	}

}
