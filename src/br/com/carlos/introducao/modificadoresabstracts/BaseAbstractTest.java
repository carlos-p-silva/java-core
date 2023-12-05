package br.com.carlos.introducao.modificadoresabstracts;

public class BaseAbstractTest extends AbstractTest {

	//M�todo que a classe abstrata OBRIGA a implementar, pois esse m�todo � abstrato
	@Override
	public void mostrarDadosAbstrato() {
		
	}
	
	// M�todo N�O ABSTRATO da classe abstrata, que n�o � obrigat�rio implementar
	@Override
	public void imprimirDados() {
		super.imprimirDados();
	}

}
