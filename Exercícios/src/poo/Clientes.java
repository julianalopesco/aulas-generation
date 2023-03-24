package poo;
public class Clientes {
	private String nome;
	private String email;
	private String genero;
	private String endereco;
	private long CPF;

	public Clientes(String nome, String email, String genero, String endereco, long CPF) {
		super();
		this.nome = nome;
		this.email = email;
		this.genero = genero;
		this.endereco = endereco;
		this.CPF = CPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCidade() {
		return genero;
	}

	public void setCidade(String cidade) {
		this.genero = cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getCPF() {
		return CPF;
	}

	public void setCPF(long CPF) {
		this.CPF = CPF;
	}

	public void imprimirInfo() {
		System.out.println("\nNome: "+nome+" | Gênero: "+genero+" | CPF: "+CPF+" | Email: "+email+" | Endereço: "+endereco);
	}
}