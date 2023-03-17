//a finalizar 
package vetorMatriz;

import java.util.Scanner;

public class matrizMediasNotas {

	public static void main(String[] args) {
		int[][] notas = new int[4][10];
		int participante=0, nota=0, mediaParticipante,i=-1;

		Scanner read = new Scanner(System.in);
		
		for(nota=0;participante<9;participante++) {
			System.out.println("\nEntre com a " + i + "nota: ");
			notas[participante][nota] = read.nextInt();
		}

	}
}
