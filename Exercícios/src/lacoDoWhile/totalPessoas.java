//a finalizar 

//Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento e precisam de um sistema para analisar os dados. 
//Escreva um algoritmo em Java, que leia via teclado as seguintes informações de cada colaborador:


package lacoDoWhile;

import java.util.Scanner;

public class totalPessoas {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int idade, sexo, categoria, totalMulheres;
		char c = 's'; 
		
		while (c != ('n')) {
		System.out.println("\nEntre com a idade do funcionário: ");
		idade = read.nextInt(); 
		
		System.out.println("\nEntre com o sexo do funcionário, de acordo com as opções abaixo: ");
		System.out.println("\n1 - Feminino");
		System.out.println("\n2 - Masculino");
		System.out.println("\n3 - Outros");
		sexo = read.nextInt(); 
		
		if (sexo.contains(1)) {
			totalMulheres++;
		}
		
		System.out.println("\nEntre com a categoria do funcionário: ");
		System.out.println("\n1 - Backend");
		System.out.println("\n2 - Frontend");
		System.out.println("\n3 - Mobile");
		System.out.println("\n4 - Fullstack");
		categoria = read.nextInt();
		
		System.out.println("\nDeseja continuar a leitura dos dados de um novo colaboradore? (S/N)");
		c = read.next().charAt(0); 
		} 
		
			System.out.println("\nTotal de pessoas desenvolvedoras Backend: ");
			System.out.println("\nTotal de pessoas desenvolvedoras Frontend: ");
			System.out.println("\nTotal de pessoas desenvolvedoras Mobiles maiores de 40 anos: ");
			System.out.println("\nTotal de pessoas desenvolvedoras Fullstack menores de 30 anos: ");
			
		System.out.println("\nPrograma encerrado!");
	}

}
