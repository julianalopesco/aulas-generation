package poo;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente  g1 = new Gerente("Juliana Lopes",503,"Desenvolvimento","Desenvolvedor Senior","123.456.789-10",9000,7);
		Gerente  g2 = new Gerente("Mateus Solano",025,"Marketing","Gestor de marketing","109.876.543-21",8000,5);
		
		Vendedor v1 = new Vendedor("Amanda Silva",037,"Vendas","Vendedora","123.456.789-10",3500,17);
		Vendedor v2 = new Vendedor("Bruno Lopes",125,"Vendas","Operador de caixa","109.876.543-21",3500,10);
		
		g1.imprimirInfo();
		g2.imprimirInfo();
		v1.imprimirInfo();
		v2.imprimirInfo();
	}

}
