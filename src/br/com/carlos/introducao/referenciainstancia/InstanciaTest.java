package br.com.carlos.introducao.referenciainstancia;

public class InstanciaTest {

	public static void main(String[] args) {
		
		// Vari�veis de inst�ncia s�o quando se cria um objeto da classe a qual os atributos pertencem. Ex
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome =  "Carlos";
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Dan";
		
		System.out.println(pessoa1);

	}

}
