package poo;

public class TestaClientes {

	public static void main(String[] args) {
		Clientes c1 = new Clientes("Amanda", "amandinha.silva@gmail.com","feminino","Avenida Paulista, 1313 - São Paulo",12345678910l);
		Clientes c2 = new Clientes("Ricardo","ricardoalmeida@gmail.com","masculino","Avenida Brasil,58 - Rio de Janeiro",10987654321l);
		
		System.out.println("\nLista de clientes: ");
		c1.imprimirInfo();
		c2.imprimirInfo();
		
	}

}
