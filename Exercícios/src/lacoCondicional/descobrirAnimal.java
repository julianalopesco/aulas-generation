
package lacoCondicional;

import java.util.Scanner;

public class descobrirAnimal {

	public static void main(String[] args) {
		String carac1, carac2, carac3;

		Scanner leitura = new Scanner(System.in);

		System.out.println("\nDigite se o animal é invertebrado ou vertebrado: ");
		carac1 = leitura.nextLine();

		if (carac1.equalsIgnoreCase("vertebrado")) {
			System.out.println("\nDigite se o animal é uma ave ou mamífero: ");
			carac2 = leitura.next();
			if (carac2.equalsIgnoreCase("ave")) {
				System.out.println("\nDigite se o animal é carnívoro ou onívoro: ");
				carac3 = leitura.next();
				if (carac3.equalsIgnoreCase("carnívoro")) {
					System.out.println("\nO animal é uma águia!");
				} else {
					System.out.println("\nO animal é uma pomba!");
				}
			} else {
				System.out.println("\nO animal é onívoro ou herbívoro?");
				carac3 = leitura.next();
				if (carac3.equalsIgnoreCase("onívoro")) {
					System.out.println("\nO animal é um homem!");
				} else {
					System.out.println("\nO animal é uma vaca!");
				}
			}
		} else {
			System.out.println("\nDigite se o animal é um inseto ou anelídeo: ");
			carac2 = leitura.next();
		}
		if (carac2.equalsIgnoreCase("inseto")) {
			System.out.println("\nDigite se o animal é hematófago ou herbívoro: ");
			carac3 = leitura.next();
			if (carac3.equalsIgnoreCase("hematófago")) {
				System.out.println("\nO animal é uma pulga!");
			} else {
				System.out.println("\nO animal é uma lagarta!");
			}
		} else {
			System.out.println("\nO animal é hematófago ou onívoro?");
			carac3 = leitura.next();
			if (carac3.equalsIgnoreCase("hematófago")) {
				System.out.println("\nO animal é uma sanguessuga!");
			} else {
				System.out.println("\nO animal é uma minhoca!");
			}
		}
	}
}
