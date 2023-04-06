//Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. 
//Em seguida, faça o que se pede:
//Mostre na tela todas as cores que foram adicionadas. 
//Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExibirLista {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		String cor;
		
		ArrayList<String> cores = new ArrayList();
		
		
		do {
			System.out.println("\nInsira uma cor: ");
			cor = read.next();
			read.nextLine();
			cores.add(cor);
		} while (cores.size() <5);
		
	System.out.println("\nListar todas as cores"+cores);

    Collections.sort(cores, String.CASE_INSENSITIVE_ORDER);
    System.out.println("\nCores ordenadas: "+cores);
	}
}
