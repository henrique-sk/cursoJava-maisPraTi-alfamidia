package interfaceLIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// A diferença entre o ArrayList e LinkedList está na performace

		// No ArrayList os métodos para buscar dados são mais rápidos
//		ArrayList<String> alunos = new ArrayList<>();
		
		// No LinkedList os métodos para adicionar e remover são mais rápidos
//		LinkedList<String> alunos = new LinkedList<>();
		
		// o mais correto é declarar como List e passar o tipo de implementação que está recebendo
		List<String> alunos = new LinkedList<>();
		
		System.out.println(alunos.isEmpty());
		
		String aluno1 = "José da Silva";
		String aluno2 = "Maria Clara";
		String aluno3 = "João Roberto";
		String aluno4 = "Ana Lima";
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		
		System.out.println(alunos);
		System.out.println(alunos.get(1)); // busca pelo index
		System.out.println(alunos.isEmpty());
		System.out.println(alunos.size());
		
		alunos.remove(1);
		System.out.println(alunos);
		System.out.println(alunos.get(1));
		
	}

}
