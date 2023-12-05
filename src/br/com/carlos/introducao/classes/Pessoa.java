package br.com.carlos.introducao.classes;

public class Pessoa {
	
	// Uma classe pode possuir atributos e métodos
	public String nome;
	public int idade;
	public String email;

	//Esse método pé original da classe Object, porém, aqui ele está sobescrito
	// A anotação @Override é justamente para indicar que estamos sobescrevendo
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", email=" + email + "]";
	}

}
