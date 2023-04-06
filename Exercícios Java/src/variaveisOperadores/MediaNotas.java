package variaveisOperadores;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		double nota1,nota2,nota3,nota4,media; 
		
		
		Scanner leia = new Scanner(System.in);
	
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextDouble();
		System.out.println("\nEntre com a quarta nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("\nMédia aritimética foi de: "+media);
		System.out.printf("\nMédia aritimética arrendondada foi de: %.2f",media);
	}

}