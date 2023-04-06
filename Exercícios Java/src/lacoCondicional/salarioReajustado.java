//a finalizar
//Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String), o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float). 
//A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.

package lacoCondicional;

import java.util.Scanner;

public class salarioReajustado {

	public static void main(String[] args) {
		String colaborador; 
		int cargo;
		float salario,salarioReajustado; 
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\n\t\tDigite o nome do colaborador: ");
		colaborador = read.next();
		
		System.out.println("\nDigite o valor do salário do colaborador: ");
		salario = read.nextFloat();
		
		System.out.println("\n\t\tSelecione o cargo do colaborador: ");
		System.out.println("\n1 - Gerente");
		System.out.println("\n2 - Vendedor");
		System.out.println("\n3 - Supervisor");
		System.out.println("\n4 - Motorista");
		System.out.println("\n5 - Estoquista");
		System.out.println("\n6 - Técnico de TI");
		cargo = read.nextInt(); 
		
		switch(cargo) {
		
		case 1:
			salarioReajustado = (float) (salario + (0.10 * salario)); 
			System.out.println("\nO salário reajustado do(a) gerente "+colaborador+" é de: "+salarioReajustado);
			break;
			
		case 2:
			salarioReajustado = (float) (salario + (0.07 * salario)); 
			System.out.println("\nO salário reajustado do(a) vendedor(a) "+colaborador+" é de: "+salarioReajustado);
			break;
		
		case 3:
			salarioReajustado = (float) (salario + (0.09 * salario)); 
			System.out.println("\nO salário reajustado do(a) supervisor(a) "+colaborador+" é de: "+salarioReajustado);
			break;
			
		case 4:
			salarioReajustado = (float) (salario + (0.06 * salario)); 
			System.out.println("\nO salário reajustado do(a) motorista "+colaborador+" é de: "+salarioReajustado);
			break;
			
		case 5:
			salarioReajustado = (float) (salario + (0.05 * salario)); 
			System.out.println("\nO salário reajustado do(a) estoquista "+colaborador+" é de: "+salarioReajustado);
			break;
			
		case 6:
			salarioReajustado = (float) (salario + (0.08 * salario)); 
			System.out.println("\nO salário reajustado do(a) técnico de TI "+colaborador+" é de: "+salarioReajustado);
			break;
			
		default:
			System.out.println("\nOpção inválida!");
		}
				
	}

}
