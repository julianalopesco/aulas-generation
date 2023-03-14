package variaveisOperadores;

import java.util.Scanner;

public class salarioLiquido {

		public static void main(String[] args) {
			
			float salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido; 
			
			
			Scanner leia = new Scanner(System.in);
		
			System.out.println("\nDigite o valor do salário bruto: ");
			salarioBruto = leia.nextFloat();
			System.out.println("\nDigite o valor do adicional noturno: ");
			adicionalNoturno = leia.nextFloat();
			System.out.println("\nDigite o valor das horas extras: ");
			horasExtras = leia.nextFloat();
			System.out.println("\nDigite o valor dos descontos: ");
			descontos = leia.nextFloat();
			
			salarioLiquido = salarioBruto+adicionalNoturno+(horasExtras*5)-descontos;
			
			System.out.println("\nO valor do salário líquido é: R$"+salarioLiquido);
		}
	}

