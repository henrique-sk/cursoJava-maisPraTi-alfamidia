package interfaceMAP;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// Interface MAP
		// Veloz para ler e modificar dados
		// Utiliza tabela hash para as chaves
		// utiliza Chave, Valor (<K, V>)
		// Não trabalha com tipos primitivos, somente tipos de Objetos
		// Muito usado para simular Bancos de Dados
		
		// HashMap NÃO tem ordenação
//		Map<Integer, String> alunos = new HashMap<>();
		
		// TreeMap TEM ordenação
		Map<Integer, String> alunos = new TreeMap<>();
		
		String aluno1 = "José da Silva";
		String aluno2 = "Maria Rodrigues";
		String aluno3 = "João Mello";
		String aluno4 = "Rodrigo Lopes";
		
		alunos.put(01, aluno1);
		alunos.put(02, aluno2);
		alunos.put(03, aluno3);
		alunos.put(15, aluno4);
		
		System.out.println(alunos);
		System.out.println(alunos.get(2));
		System.out.println(alunos.size());
		
		alunos.remove(2);
		alunos.remove(15, "Rodrigo"); // não remove, pq o value não existe
		alunos.remove(15, "Rodrigo Lopes");
		
		System.out.println(alunos);
		System.out.println(alunos.get(2));
		System.out.println(alunos.size());
		
	}

}
