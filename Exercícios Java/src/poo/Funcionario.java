package poo;

public abstract class Funcionario {
	
	private String nome;
	private int id;
	private String setor; 
	private String cargo;
	private String cpf;
	public Funcionario(String nome, int id, String setor, String cargo, String cpf) {
		super();
		this.nome = nome;
		this.id = id;
		this.setor = setor;
		this.cargo = cargo;
		this.cpf = cpf;
			
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	} 
	
	
	public void imprimirInfo() {
		System.out.println("-----------------------------------------------");
		System.out.println("\nNome do funcionário: "+nome);
		System.out.println("\nCódigo identificador: "+id);
		System.out.println("\nSetor: "+setor);
		System.out.println("\nCargo: "+cargo);
		System.out.println("\nCPF: "+cpf);
		System.out.println("-----------------------------------------------");
	}		

}
