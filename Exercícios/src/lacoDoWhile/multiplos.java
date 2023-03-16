package lacoDoWhile;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		
		int num1, num2, i;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		num2 = leia.nextInt();
		
		if (num1 < num2 ) {
			for(i = num1; i <=num2;i++) {
				if (i % 5 == 0 && i %3 ==0) {
					System.out.println(i+" é múltiplo de 3 e 5");	
				};
			}	
		}else {
			System.out.println("\nIntervalo inválido!");
		}
	}
}
