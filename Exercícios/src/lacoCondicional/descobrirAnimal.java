package lacoCondicional;

import java.util.Scanner;

public class descobrirAnimal {

	public static void main(String[] args) {
		String carac1,carac2,carac3;

		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\nDigite se o animal é invertebrado ou vertebrado? ");
		carac1 = leitura.next();

		if(carac1 = vertebrado) {
			System.out.println("O número "+numero+" é par e positivo!");
		} else if (numero%2==0 && numero <0){
			System.out.println("O número "+numero+" é par e negativo!");
		}else if (numero%2==1 && numero >0){
			System.out.println("O número "+numero+" é impar e positivo!");
		}else{
			System.out.println("O número "+numero+" é impar e negativo!");
		}
	}

}
