package poo;

import java.text.NumberFormat;

public class Vendedor  extends Funcionario implements salarioFuncionarios{
	
	private float salario;
	private float comissao;
	public Vendedor(String nome, int id, String setor, String cargo, String cpf, float salario, float comissao) {
		super(nome, id, setor, cargo, cpf);
		this.salario = salario;
		this.comissao = comissao;
		
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getComissao() {
		return comissao;
	}
	public void Comissao(float Comissao) {
		this.comissao = Comissao;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //nf = objeto 
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	 @Override
	    public float calcularSalario() {
	        return salario + (salario * (comissao/100));
	    }
	
	public void imprimirInfo() {
			System.out.println("-----------------------------------------------");
			System.out.println("\nNome do funcionário: "+getNome());
			System.out.println("\nCódigo identificador: "+getCpf());
			System.out.println("\nSetor: "+getSetor());
			System.out.println("\nCargo: "+getCargo());
			System.out.println("\nCPF: "+getCargo());
			System.out.println("\nSalário base: "+this.formatarMoeda());
			System.out.println("\nValor da comissão de vendas: "+comissao+"%");
			float salarioAtualizado = this.calcularSalario();
			System.out.println("O salário atualizado do gerente é: " + salarioAtualizado);
			System.out.println("-----------------------------------------------");
	}
}