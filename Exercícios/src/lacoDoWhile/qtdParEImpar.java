package lacoDoWhile;

import java.util.Scanner;

public class qtdParEImpar {

	public static void main(String[] args) {

		int i, qtdePar = 0, qtdeImpar = 0;
		Scanner leia = new Scanner(System.in);

		for (i = 1; i <= 10; i++) {
			System.out.println("\nEntre com o " + i + "º número: ");
			int num = leia.nextInt();

			if (num % 2 == 0) {
				qtdePar++;
			} else {
				qtdeImpar++;
			}
		}
		System.out.println("\nTotal de números pares: "+qtdePar);
		System.out.println("\nTotal de números ímpares: "+qtdeImpar);
	}
}
