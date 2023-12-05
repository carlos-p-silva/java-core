package br.com.carlos.introducao.modificadoresabstracts;

/*
 * abstract - Toda classe que for abstract, não é possível instânciar um objeto a partir da classe
 * Uma classe abstract tem a intenção de ser utilizada na HERANÇA, de ser extendida (extends)
 * Uma classe abstrata pode ter métodos abstratos e métodos não abstratos
 * TODA VEZ QUE UMA CLASSE POSSUIR UM MÉTODO ABSTRATO, A CLASSE PRECISA SER ABSTRATA
 */
public abstract class AbstractTest {
	
	public abstract void mostrarDadosAbstrato();
	
	public void imprimirDados() {
		
	}

}
