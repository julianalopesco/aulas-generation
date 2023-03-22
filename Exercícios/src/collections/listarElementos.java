//Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. 
//O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e adicione-os individualmente na Collection Set. 
//Em seguida, faça o que se pede:
//Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator

package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class listarElementos {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		
		Scanner read =new Scanner(System.in);
		
		for(int i =0;i < 10; i++) {
			System.out.println("\nDigite o " + (i+1) + "º número: ");
			Integer x = read.nextInt();
			numeros.add(x);
			}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
	}

}
