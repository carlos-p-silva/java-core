package br.com.carlos.introducao.operadoresrelacionais;

import br.com.carlos.introducao.object.Pessoa;

public class OperadoresRelacionaisTest {

	public static void main(String[] args) {
		
		// boolean -> true (verdadeiro), false (falso)
		// == (igualdade), > (maior), < (menor), >= (maior ou igual), <= (menor ou igual)
		
		int saldoBancario = 50000;
		int valorSaque = 15000;
		
		boolean retirada = saldoBancario > valorSaque;
		System.out.println("Valor de saque permitido? " + retirada);
		
		valorSaque = 80000;
		retirada = saldoBancario > valorSaque;
		System.out.println("Valor de saque permitido? " + retirada);
		
		valorSaque = 50000;
		retirada = saldoBancario == valorSaque;
		System.out.println("Valor saque permitido? == " + retirada);
		

		valorSaque = 50000;
		retirada = saldoBancario <= valorSaque;
		System.out.println("Valor saque permitido? <= " + retirada);
		
		Pessoa obj = null;
		boolean objetoNulo = obj != null;
		
		System.out.println(objetoNulo);
		

	}

}
