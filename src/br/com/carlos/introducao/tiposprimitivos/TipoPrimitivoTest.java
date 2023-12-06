package br.com.carlos.introducao.tiposprimitivos;

public class TipoPrimitivoTest {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		//Sem atribuir valores aos tipos primitivos
		// Idéia é mostrar os valores padrão de cada tipo
		System.out.println("Idade valor byte: " + aluno.idade);
		System.out.println("Matricula valor short: " + aluno.matricula);
		System.out.println("Turma valor int: " + aluno.turma);
		System.out.println("Cpf valor long: " + aluno.cpfResponsavel);
		System.out.println("Genero valor char: " + aluno.genero);
		System.out.println("Media valor float: " + aluno.media);
		System.out.println("Altura valor byte: " + aluno.altura);
		System.out.println("Ativo valor byte: " + aluno.ativo);

	}

}
