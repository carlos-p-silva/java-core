package br.com.carlos.introducao.wrappers;

public class WrappersMetodosTest {

	public static void main(String[] args) {
		
		// Depreciado
		Integer numero1 = new Integer(20);
		
		// valueOf()
		
		Integer numero2 = Integer.valueOf(10);
		
		System.out.println(numero1);
		System.out.println(numero2);
		
		Double numero3 = Double.valueOf("150.99");
		Long numero4 = Long.valueOf(10);
		
		System.out.println(numero3);
		System.out.println(numero4);
		
		//Base
		Integer numero5 = Integer.valueOf("0110101", 3);
		System.out.println(numero5);
		
		// xxxValue() -> Byte.valueOf(), Integer.ValueOf()...Wrappr para primitivo
		
		Float numero6 = Float.valueOf(4508.57f);
		int numero7 = numero6.intValue();
		System.out.println(numero6);
		System.out.println(numero7); //Obviamente irá perder precisão
		
		// convertendo uma String para um tipo primitivo
		double valorProduto = Double.parseDouble("550.50");
		System.out.println(valorProduto);
		
		// Autoboxing
		int numeroPrimitivo = 85;
		Integer numeroWrapper = numeroPrimitivo;
		
		// Unboxing
		Integer numeroUnboxing = 127;
		int numeroUnboxingPrimitivo = numeroUnboxing;
		
		System.out.println(numeroWrapper);
		System.out.println(numeroUnboxingPrimitivo);
		
	}

}
