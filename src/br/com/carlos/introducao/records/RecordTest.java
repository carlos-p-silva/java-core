package br.com.carlos.introducao.records;

public class RecordTest {
	

	public static void main(String[] args) {
		
		Pessoa objetoPessoa = new Pessoa("Danilo Jones", "1458799974");
		System.out.println("Dados Classe Pessoa: " + objetoPessoa);
		objetoPessoa.setCpf("487457454");
		System.out.println("Dados Classe Pessoa: " + objetoPessoa);
		
		System.out.println("###########################");
		
		PessoaRecord objetoRecord = new PessoaRecord("Carlos Pereira", "7371455588");
		System.out.println("Nome usando record: " + objetoRecord.nome());
		System.out.println("Cpf usando record: " + objetoRecord.cpf());
		
		//Não é possivel alterar no record, pois um record é imutalvel
		// Seria necessário criar um novo objeto de record
		
		objetoRecord = new PessoaRecord("Alexia Jones", "73714565477");
		System.out.println("Novo record usando a mesma variável: " + objetoRecord.toString());
		
	}

}
