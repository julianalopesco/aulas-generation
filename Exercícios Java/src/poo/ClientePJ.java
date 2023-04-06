package poo;

public class ClientePJ extends Cliente {
	
	public String cnpj;
	public String setor;
	public ClientePJ(String nome, String email, String endereco, String cnpj, String setor) {
		super(nome, email, endereco);
		this.cnpj = cnpj;
		this.setor = setor;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome: "+getNome()+" | Email: "+getEmail()+" | Endereço: "+getEndereco()+
				" | CNPJ: "+cnpj+" | Setor: "+setor);
	}
}
