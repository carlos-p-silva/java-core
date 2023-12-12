package br.com.carlos.introducao.wrappers;

public class WrappersTest {
	
	public static void main(String[] args) {
		
		// tipos prrimitivos -> byte, short, int, long, float, double, char, booelan
		
		// Wrappers -> Byte, Short, Integer, Long, Float, Double, Character, Boolean
		
		// Wrappers s�o classes, ou seja, n�o trabalham com valores e sim REFER�NCIA
		// Quase todos as classes Wrappers possuem dois contrutores
		
		Integer numero1 = new Integer(50); // O risco siginfica que est� decpreciado
		Integer numero2 = new Integer("50");
		Integer resultadoInteger = numero1 + numero2;
		
		Double doubleNumero1 = new Double(54.89);
		Double doubleNumero2 = new Double("54.89");
		Double resultadoDouble = doubleNumero1 + doubleNumero2;
		
		Character character = new Character('C'); // Possui apenas um construtor
		
		System.out.println("Resultado Integer: " + resultadoInteger);
		System.out.println("Resultado Double: " + resultadoDouble);
		System.out.println("Resultado Character: " + character);
	    
	    
		
	}

}
