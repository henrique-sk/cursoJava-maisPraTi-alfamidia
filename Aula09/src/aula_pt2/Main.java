package aula_pt2;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import aula_pt2.model.Aluno;
import aula_pt2.repository.AlunoRepository;

public class Main {

	public static void main(String[] args) {
		
		// CRIAR UMA ESTRUTURA COM MAP PARA SIMULAR UM BANCO DE DADOS
		// CRIE UMA CLASSE CARRO E UMA CLASSE CARROREPOSITORY
		
		// O CARRO DEVE CONTER PLACA, MARCA, COR, MARCA E MODELO
		
		// AO TENTAR INSERIR

		Scanner sc = new Scanner(System.in);
		boolean continua = true;
		AlunoRepository repository = new AlunoRepository();
		do {
			System.out.println("Digite a matrícula do aluno: ");
			int matricula = sc.nextInt();
			if(matricula == 0) {
				break;
			}
			
			sc.nextLine(); // corretor do bug
			System.out.println("Digite o nome do aluno: ");
			String nome = sc.nextLine();
			
			Aluno aluno = new Aluno(matricula, nome);
			
			repository.salvar(aluno);
		
		}while(continua);

		System.out.println("Todos alunos cadastrados:");
		System.out.println(repository.buscarTodos());
		
		System.out.println("=========================");
		
		System.out.println("Aluno com matricula 1010");
		System.out.println(repository.buscarPorMatricula(1010));
		
		System.out.println("=========================");
		System.out.println("Removendo aluno com matrícula 1010");
		repository.remover(1010);
		
		System.out.println("=========================");
		
		System.out.println("Todos alunos cadastrados:");
		System.out.println(repository.buscarTodos());
		
		sc.close();
	}

}
