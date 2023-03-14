package JavaIntro;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Juliana Lopes";
		int idade = 26;
		double altura = 1.76, nota1,nota2,nota3,media; 
		
		
		Scanner leia = new Scanner(System.in);

		System.out.println("\nO seu nome é: "+nome);
		System.out.println("\nA sua idade é: "+idade+" anos");
		System.out.println("\nA sua altura é: "+altura+" metro de altura");
	
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("\nMédia aritimética foi de: "+media);
		System.out.printf("\nMédia aritimética foi de: %.2f",media);
	}

}