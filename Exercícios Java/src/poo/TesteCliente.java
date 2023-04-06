package poo;

public class TesteCliente {

	public static void main(String[] args) {
		ClientePF c1 =  new ClientePF("Amanda", "amandinha.silva@gmail.com","Avenida Paulista, 1313 - São Paulo","123.456.789-10", "Feminino");
		ClientePF c2 =  new ClientePF("Ricardo","ricardoalmeida@gmail.com","Avenida Brasil,58 - Rio de Janeiro","109.876.543-21","Masculino");
		
		ClientePJ c3 = new ClientePJ("Magazine Luiza","magazineluiza@gmail.com","Avenida do Estado,100 - São Paulo","12.345.678/0001-00", "Varejo");
		ClientePJ c4 = new ClientePJ("Google","google@gmail.com","5th Avenue, 06 - Nova York","98.754.321/0001-00","Informática");

		System.out.println("\nLista de clientes: ");
		c1.imprimirInfo();
		c2.imprimirInfo();
		c3.imprimirInfo();
		c4.imprimirInfo();
		
	}

}
