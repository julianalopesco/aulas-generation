//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.

package lacoCondicional;

import java.util.Scanner;

public class numMaior {

	public static void main(String[] args) {

		float nA,nB,nC,result;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\nEntre com o número A: ");
		nA = leitura.nextFloat();
		System.out.println("\nEntre com o número B: ");
		nB = leitura.nextFloat();
		System.out.println("\nEntre com o número C: ");
		nC = leitura.nextFloat();
		
		result = (nA+nB);
		
		if(result>nC) {
			System.out.println("\nA Soma de A + B é MAIOR do que C");
		}
		else if(result<nC) {
			System.out.println("\nA Soma de A + B é MENOR do que C");
		}
		else {
			System.out.println("\nA Soma de A + B é IGUAL que C");
		}
}
} 