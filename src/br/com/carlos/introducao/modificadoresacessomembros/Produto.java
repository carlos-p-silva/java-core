package br.com.carlos.introducao.modificadoresacessomembros;

import java.math.BigDecimal;

public class Produto {
	
	private String nome;
	protected BigDecimal valorUnitario;
	public String descricao;
	String categotria;
	
	// Método interno que pode ser acessado apenas dentro da classe que pertence
	private void mudarNome() {
		this.nome = "Teste";
	}
	
	// Apenas do mesmo pacote e herança
	protected void acessarDescricao() {
		
	}
	
	// Método que pode ser acessado através de qualquer pacote
	public BigDecimal obterValor() {
		return valorUnitario;
	}
	
	//Método que só poderá ser acessado por classes pertencentes ao mesmo pacote
	void atualizarNome() {
	}

}
