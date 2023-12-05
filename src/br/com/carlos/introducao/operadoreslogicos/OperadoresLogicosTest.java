package br.com.carlos.introducao.operadoreslogicos;

public class OperadoresLogicosTest {
	
	public static void main(String[] args) {
		
		double rendaMensal = 3000;
		int idade = 28;
		boolean temEmprego = true;
		
		// 1 -> idade >= 18 E idade <= 35
		// 2 -> renda mensal >= 2000
		// 3 - > tem emprego = true
		
		boolean possuiRendaCompativel = rendaMensal >= 2000;
		boolean possuiIdadeCompativel = idade >= 18 && idade <= 35;
		
		if (possuiRendaCompativel && possuiIdadeCompativel && temEmprego) {
			System.out.println("Pode realizar empr�stimo!");
		} else {
			System.out.println("N�o pode realizar empr�stimo!");
		}
		
		String usuario = "Carlos";
		String senha = "123456789";
		
		if (usuario.equals("Carlos") && senha.equals("123456789")) {
			System.out.println("Usu�rio logado");
		} else {
			System.out.println("Usu�rio ou senha incorretos");
		}
		
	}

}
