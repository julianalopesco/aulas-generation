package poo;

public class ClientePF extends Cliente {

	private String cpf;
	private String genero;
	public ClientePF(String nome, String email, String endereco, String cpf, String genero) {
		super(nome, email, endereco);
		this.cpf = cpf;
		this.genero = genero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void imprimirInfo() {
		System.out.println("\nNome: "+getNome()+" | Email: "+getEmail()+" | Endereço: "+getEndereco()+
				" | CPF: "+cpf+" | Gênero: "+genero);
}
}
