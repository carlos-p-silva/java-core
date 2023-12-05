package br.com.carlos.introducao.modificadoresacessomembros;

import java.math.BigDecimal;

public class Produto {
	
	private String nome;
	protected BigDecimal valorUnitario;
	public String descricao;
	String categotria;
	
	// M�todo interno que pode ser acessado apenas dentro da classe que pertence
	private void mudarNome() {
		this.nome = "Teste";
	}
	
	// Apenas do mesmo pacote e heran�a
	protected void acessarDescricao() {
		
	}
	
	// M�todo que pode ser acessado atrav�s de qualquer pacote
	public BigDecimal obterValor() {
		return valorUnitario;
	}
	
	//M�todo que s� poder� ser acessado por classes pertencentes ao mesmo pacote
	void atualizarNome() {
	}

}
