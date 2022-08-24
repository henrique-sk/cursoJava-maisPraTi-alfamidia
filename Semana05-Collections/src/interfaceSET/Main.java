package interfaceSET;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	// Interface SET
	// não aceita valores duplicados
	// a pesquisa é mais rápida que o LIST
	// porém a inserção de dados é mais lenta
	
	public static void main(String[] args) {
		
		// HashSet NÃO tem ordenação
		Set<String> alunos = new HashSet<>();
		
		// TreeSet É ordenado
//		Set<String> alunos = new TreeSet<>();
		
		String aluno1 = "José da Silva";
		String aluno2 = "Maria Clara";
		String aluno3 = "João Oliveira";
		String aluno4 = "Ana da Silva";
		String aluno5 = "Ana da Silva"; // Não permite itens duplicados
		
		alunos.remove(aluno3);
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		alunos.add(aluno5); // Não entra no HashSet
		alunos.add(null); // HashSet aceita objetos nulos, o TreeSet Não
		
		System.out.println(alunos);
		System.out.println(alunos.size());
		
		alunos.remove(null);
		alunos.remove("Maria Clara");
		
		System.out.println(alunos);
		System.out.println(alunos.size());
		
		alunos.clear();

		System.out.println(alunos);
		System.out.println(alunos.size());
	}

}
