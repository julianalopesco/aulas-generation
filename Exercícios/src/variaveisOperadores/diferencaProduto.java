package variaveisOperadores;

import java.util.Scanner;

public class diferencaProduto {

		public static void main(String[] args) {
			
			float n1,n2,n3,n4,diferencaProduto; 
			
			
			Scanner leia = new Scanner(System.in);
		
			System.out.println("\nDigite o numero 1: ");
			n1 = leia.nextFloat();
			System.out.println("\nDigite o numero 2: ");
			n2 = leia.nextFloat();
			System.out.println("\nDigite o numero 3: ");
			n3 = leia.nextFloat();
			System.out.println("\nDigite o numero 4: ");
			n4 = leia.nextFloat();
			
			
			diferencaProduto = (n1*n2)-(n3*n4);
			
			System.out.println("\nA diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é: "+diferencaProduto);
		}
	}
