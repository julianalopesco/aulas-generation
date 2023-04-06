package poo;

import java.text.NumberFormat;

public class Gerente  extends Funcionario implements salarioFuncionarios{
	
	private float salario;
	private float bonus;
	public Gerente(String nome, int id, String setor, String cargo, String cpf, float salario, float bonus) {
		super(nome, id, setor, cargo, cpf);
		this.salario = salario;
		this.bonus = bonus;
		
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //nf = objeto 
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	 
	 @Override
	    public float calcularSalario() {
	        return salario + (salario * (bonus/100));
	    }
	
	public void imprimirInfo() {
		
			System.out.println("-----------------------------------------------");
			System.out.println("\nNome do funcionário: "+getNome());
			System.out.println("\nCódigo identificador: "+getCpf());
			System.out.println("\nSetor: "+getSetor());
			System.out.println("\nCargo: "+getCargo());
			System.out.println("\nCPF: "+getCargo());
			System.out.println("\nSalário base: "+this.formatarMoeda());
			System.out.println("\nPorcentagem de bônus: "+bonus);
	        float salarioAtualizado = this.calcularSalario();
			System.out.println("O salário atualizado do gerente é: " + salarioAtualizado);
			System.out.println("-----------------------------------------------");
	}
}
