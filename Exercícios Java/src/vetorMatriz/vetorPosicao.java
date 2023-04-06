package vetorMatriz;

import java.util.Scanner;

public class vetorPosicao {

	public static void main(String[] args) {

		int vetorInt[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int i, numProcurado, posicao = -1;

		Scanner read = new Scanner(System.in);

		System.out.println("\nEscolha um número para pesquisar na lista: ");
		numProcurado = read.nextInt();

		for (i = 0; i < vetorInt.length; i++) {
			if (vetorInt[i] == numProcurado) {
				posicao = i;
			}
		}
		if (posicao != -1) {
			System.out.println("O número " + numProcurado + " está localizado na posição " + posicao + " da lista.");
		} else {
			System.out.println("O número " + numProcurado + " não foi encontrado!");
		}

	}

}
