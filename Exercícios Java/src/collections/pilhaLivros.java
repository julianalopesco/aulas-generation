package collections;

import java.util.Scanner;
import java.util.Stack;

public class pilhaLivros {

	public static void main(String[] args) {

		Stack<String> pilhaLivros =  new Stack<String>();
		Scanner leia = new Scanner(System.in);

		while (true) {//cria loop infinito do menu 
			Integer op;

			System.out.println("***********************************************************");
			System.out.println("                     MENU PRINCIPAL                        ");
			System.out.println("***********************************************************");
			System.out.println(" 1 - Adicionar livro na pilha");
			System.out.println(" 2 - Retirar livro da pilha");
			System.out.println(" 3 - Listar todos os livros");
			System.out.println(" 0 - Sair");
			System.out.println("***********************************************************");
			System.out.println("Entre com a opção desejada: ");
			op = leia.nextInt();
			leia.nextLine();

			switch (op) {

			case 1:
					System.out.println("\nDigite o nome do livro a ser adicionado: ");
					String entrada = leia.nextLine();
					pilhaLivros.add(entrada);
					System.out.println("\nPilha:");
					System.out.println("\t");
					for (String livro : pilhaLivros) {
					    System.out.println(livro);
					}
					System.out.println("\nLivro adicionado!");
				break;
			
			case 2:
				
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!"); 
				} else {
					pilhaLivros.pop();
					System.out.println("\nPilha:");
					System.out.println("\t");
					for (String livro : pilhaLivros) {
					    System.out.println(livro);
					}
					System.out.println("\nUm livro foi retirado da pilha!");
				}
				break;
				
			case 3:
				if (pilhaLivros.isEmpty()) { 
					System.out.println("\nNão há nenhum livro na pilha!");
					}else {
						System.out.println("\nLista de todos os livros na pilha: ");
						System.out.println("\t");
						for (String livro : pilhaLivros) {
						    System.out.println(livro);
						}
					}
				break;
			case 0:
				System.out.println("\nPrograma finalizado!");
				break;
			default:
				System.out.println("\nOpção inválida!");
			}
			}
	}

}
