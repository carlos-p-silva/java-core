package br.com.carlos.introducao.operadoresaritmeticos;

public class OperadoresAritmeticosTest {
	
	public static void main(String[] args) {
		
		int salario = 15000;
		int salarioExtra = 1000;
		
		int salarioBruto = salario + salarioExtra;
		
		System.out.println("S�lario Bruto: " + salarioBruto);
		
		int desconto = 500;
		
		System.out.println("Sal�rio l�quido: " + (salarioBruto - desconto)); //Concatena��o
		
		int numeroA = 25;
		int numeroB = 50;
		
		int resultadoMultiplicacao = numeroA * numeroB;
		System.out.println("Resultado da multiplica��o: " + resultadoMultiplicacao);
		
		int numeroQualquer = 2500 / 2;
		System.out.println("Divis�o: " + numeroQualquer);
		
		int numero = 100;
		
		int restoDivisao = numero % 2;
		System.out.println("Resto da divis�o: " + restoDivisao);
		
		String nome = "Carlos";
		String sobrenome = " Pereira da Silva";
		String nomeCompleto = nome + sobrenome;
		
		System.out.println(nomeCompleto + " � o mais bonito do brasil");
		
	}

}
