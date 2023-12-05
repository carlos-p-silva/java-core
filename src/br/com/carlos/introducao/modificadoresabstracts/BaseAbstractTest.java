package br.com.carlos.introducao.modificadoresabstracts;

public class BaseAbstractTest extends AbstractTest {

	//Método que a classe abstrata OBRIGA a implementar, pois esse método é abstrato
	@Override
	public void mostrarDadosAbstrato() {
		
	}
	
	// Método NÃO ABSTRATO da classe abstrata, que não é obrigatório implementar
	@Override
	public void imprimirDados() {
		super.imprimirDados();
	}

}
