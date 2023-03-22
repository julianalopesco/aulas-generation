//Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo

package lacoCondicional;

import java.util.Scanner;

public class parOuImpar {

	public static void main(String[] args) {
		 int numero;
				 
			Scanner leitura = new Scanner(System.in);
			
			System.out.println("\nDigite um número: ");
			numero = leitura.nextInt();

			if(numero%2 == 0 && numero >0) {
				System.out.println("O número "+numero+" é par e positivo!");
			} else if (numero%2==0 && numero <0){
				System.out.println("O número "+numero+" é par e negativo!");
			}else if (numero%2==1 && numero >0){
				System.out.println("O número "+numero+" é impar e positivo!");
			}else{
				System.out.println("O número "+numero+" é impar e negativo!");
			}
					
	}

}
