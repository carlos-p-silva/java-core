package br.com.carlos.introducao.operadoresaritmeticos;

public class OperadoresPrePosTest {

	public static void main(String[] args) {
		
		// ++ (pre-incremento, pos-incremento), -- (pre-decremento, pos-decremento)
		
		int contador = 10;
		
//		System.out.println("Contador: " + contador++); //Utiliza o valor e depois incrementa
//		System.out.println("Contador: " + contador); // depois de incrementar
//		
		//Pré-incremento
//		System.out.println("Contador: " + ++contador); //Incrementa e depois utiliza o valor
//		System.out.println("Contador: " + contador); 


//		System.out.println("Contador: " + contador--); // utiliza o valor e depois decrementa
//		System.out.println("Contador: " + contador); 

		System.out.println("Contador: " + --contador); //decrementa e depois utiliza o valor
		System.out.println("Contador: " + contador); 
	}

}
