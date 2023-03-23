package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class filaBanco {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);

		while (true) {//cria loop infinito do menu 
		Integer op;

		System.out.println("***********************************************************");
		System.out.println("                     MENU PRINCIPAL                        ");
		System.out.println("***********************************************************");
		System.out.println(" 1 - Adicionar cliente na fila");
		System.out.println(" 2 - Listar todos os clientes");
		System.out.println(" 3 - Retirar clientes da fila");
		System.out.println(" 0 - Sair");
		System.out.println("***********************************************************");
		System.out.println("Entre com a opção desejada: ");
		op = leia.nextInt();
		leia.nextLine();

		switch (op) {

		case 1:
				System.out.println("\nDigite o nome do cliente a ser adicionado: ");
				String entrada = leia.nextLine();
				fila.offer(entrada);
				System.out.println("\nFila:");
				System.out.println("\t");
				for (String cliente : fila) {
				    System.out.println(cliente);
				}
				System.out.println("\nCliente adicionado!");
			break;
		case 2:
			if (fila.isEmpty())  {
				System.out.println("\nNão há nenhum cliente na fila!");
			} else { 
			System.out.println("\nLista de todos os clientes na fila: ");
			System.out.println("\t");
			for (String cliente : fila) {
			    System.out.println(cliente);
			}
			}
			break;
		case 3:
			if (fila.isEmpty()) {
			System.out.println("\nTodas as pessoas da lista foram retiradas!"); 
			} else {
				System.out.println("\nDigite o nome da pessoa a ser retirada: "); 
				String retirada = leia.nextLine();
				fila.remove(retirada);
				System.out.println("\nFila:");
				System.out.println("\t");
				for (String cliente : fila) {
				    System.out.println(cliente);
				}
				System.out.println("\nCliente foi chamado!");
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
