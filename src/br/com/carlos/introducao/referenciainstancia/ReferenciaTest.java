package br.com.carlos.introducao.referenciainstancia;

public class ReferenciaTest {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		Pessoa pessoa2 = new Pessoa();
		
		System.out.println("Referência pessoa1: " + pessoa1);
		System.out.println("Referência pessoa2: " + pessoa2);
		
		
		pessoa1 = pessoa2;
		
		System.out.println("Atribuindo referência pessoa 2 em pessoa 1: " + pessoa1);

	}

}
