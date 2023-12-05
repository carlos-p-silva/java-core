package br.com.carlos.introducao.objetos;

import br.com.carlos.introducao.classes.Pessoa;

public class IntroducaoObjeto {
	
	public static void main(String[] args) {
		
		//Criando um objeto do tipo pessoa e passando seu valor para a instancia Pessoa
		Pessoa objetoPessoa = new Pessoa(); //o new é o que cria um objeto do tipo Pessoa
		
		Pessoa objetoPessoa2 =  new Pessoa();
		
		Pessoa objetoPessoa3 = new Pessoa();
		
		// A partir do momento em que se cria um objeto, é possível acessar tudo o que estiver
		// disponível para uso dentro dessa classe
		
		//exemplo de atributos public por exemplo:
		objetoPessoa.nome =  "Carlos";
		objetoPessoa2.email = "carlos@gmail.com";
		objetoPessoa3.idade = 34;
		
		System.out.println(objetoPessoa);
		System.out.println(objetoPessoa2);
		System.out.println(objetoPessoa3);
		
	}

}
