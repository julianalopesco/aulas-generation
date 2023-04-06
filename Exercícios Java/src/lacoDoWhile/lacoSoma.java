package lacoDoWhile;

import java.util.Scanner;

public class lacoSoma {

	public static void main(String[] args) {
	
		int numero, somaPositivos = 0; 
		
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número. Para encerrar digite 0 :");
			numero = read.nextInt();
			if (numero > 0){
			somaPositivos += numero;
			}
		}while(numero != 0); 
			System.out.println("\nA soma dos números positivos é :"+somaPositivos);
		}

	}

