package br.com.carlos.introducao.object;

//Toda classe herda de Object, que é a superclasse do Java
public class Pessoa {
	
	private String nome;
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
