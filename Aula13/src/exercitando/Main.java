package exercitando;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		// ==================================
		// 1 Criar lista com nomes que comecem com Jo
		List<String> listaString = new ArrayList<>(Arrays.asList("Joao", "Jonas", "José", "Jaqueline", "Maria", "Ana"));
		
		// Resp.
		List<String> nomesComJo = listaString.stream().filter(nome -> nome.startsWith("Jo")).collect(Collectors.toList());
		System.out.println(nomesComJo);
		
		// ==================================		
		// 2 Transformar lista de double para lista de stringd
		List<Double> listaNumeros = new ArrayList<>(Arrays.asList(2.5, 20.5, 15.5, 2.0, 100.0));		
		
		// Resp.
		List<String> listaInteiroString = listaNumeros.stream().map(num -> num.toString()).collect(Collectors.toList());
		System.out.println(listaInteiroString);
		
		// ==================================		
		// 3 Criar um Map usando o cpf como chave e a pessoa como valor
		
		List<Pessoa> listaPessoas = new ArrayList<>(Arrays.asList(new Pessoa("João", 35, 555555),
																new Pessoa("Maria", 20, 22222)));
		// Resp.
		Map<Integer, Pessoa> mapPessoa = listaPessoas.stream()
				.collect(Collectors.toMap(pessoa -> pessoa.cpf, pessoa -> pessoa));
		System.out.println(mapPessoa);
		// OU
		Map<Integer, Pessoa> mapPessoa2 = listaPessoas.stream()
				.collect(Collectors.toMap(Pessoa::getCpf, pessoa -> pessoa));
		System.out.println(mapPessoa2);
		// OU
		Map<Integer, Pessoa> mapPessoa3 = listaPessoas.stream()
				.collect(Collectors.toMap(Pessoa::getCpf, Pessoa::getPessoa));
				// esse exemplo funciona pq foi criado o método getPessoa dentro da classe
		System.out.println(mapPessoa3);
		
		// ==================================
	}
	
	public static class Pessoa {
		public String nome;
		public int idade;
		public int cpf;
		
		public Pessoa(String nome, int idade, int cpf) {
			this.nome = nome;
			this.idade = idade;
			this.cpf = cpf;
		}
		
		public Pessoa getPessoa() {			
			return this;
		}
		
		public int getCpf() {
			return this.cpf;
		}
		
		public String getNome() {
			return this.nome;
		}

		@Override
		public String toString() {
			return this.nome + " - " + this.idade;
		}		
		
	}
	
}
