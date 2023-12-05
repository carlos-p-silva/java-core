package br.com.carlos.introducao.classes;

public class Pessoa {
	
	// Uma classe pode possuir atributos e m�todos
	public String nome;
	public int idade;
	public String email;

	//Esse m�todo p� original da classe Object, por�m, aqui ele est� sobescrito
	// A anota��o @Override � justamente para indicar que estamos sobescrevendo
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", email=" + email + "]";
	}

}
