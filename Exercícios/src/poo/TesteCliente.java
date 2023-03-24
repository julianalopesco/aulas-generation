package poo;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Amanda", "amandinha.silva@gmail.com","feminino","Avenida Paulista, 1313 - São Paulo",12345678910l);
		Cliente c2 = new Cliente("Ricardo","ricardoalmeida@gmail.com","masculino","Avenida Brasil,58 - Rio de Janeiro",10987654321l);
		
		System.out.println("\nLista de clientes: ");
		c1.imprimirInfo();
		c2.imprimirInfo();
		
	}

}
