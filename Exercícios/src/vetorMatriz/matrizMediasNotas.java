package vetorMatriz;

import java.util.Scanner;

public class matrizMediasNotas {

	public static void main(String[] args) {
		int[][] notas = new int[10][4];
		int participante = 0, nota = 0;
		double mediaParticipante;
		double[] medias = new double[10];

		Scanner read = new Scanner(System.in);

		for (participante = 0; participante < 10; participante++) {
			for (nota = 0; nota < 4; nota++) {
				System.out.println("\nEntre com a nota " + (nota + 1) + " do participante " + (participante + 1) + ": ");
				notas[participante][nota] = read.nextInt();
			}
		}
		
		for (participante = 0; participante < 10; participante++) {
			mediaParticipante = 0;
			for (nota = 0; nota < 4; nota++) {
				mediaParticipante += notas[participante][nota];
			}
			mediaParticipante /= 4;
			medias[participante] = mediaParticipante;
		}

		System.out.println("Médias dos participantes:");
		for (participante = 0; participante < 10; participante++) {
			System.out.print(" | "+medias[participante]);
		}
	}
}
