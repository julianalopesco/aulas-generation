package variaveisOperadores;

import java.util.Scanner;

public class abono {

		public static void main(String[] args) {
			
			float salario,abono,novoSalario; 
			
			
			Scanner leia = new Scanner(System.in);
		
			System.out.println("\nDigite o salário: ");
			salario = leia.nextFloat();
			System.out.println("\nDigite o abono: ");
			abono = leia.nextFloat();
			
			novoSalario = (salario+abono);
			
			System.out.println("\nO seu novo salário é: "+novoSalario);
		}
	}

