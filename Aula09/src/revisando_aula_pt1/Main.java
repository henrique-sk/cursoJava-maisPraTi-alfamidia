package revisando_aula_pt1;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(111, "João da Silva");
		Aluno aluno2 = new Aluno(222, "Maria da Silva");
		Aluno aluno3 = new Aluno(333, "Roberto da Silva");
		Aluno aluno4 = new Aluno(444, "Ana Clara");
		Aluno aluno5 = new Aluno(112, "Regis Lopes");
		
		// Testando Map com Integer e String
		// Levando em conta os atributos definidos na classe Aluno
		Map<Integer, String> alunos = new TreeMap<>();
		
		// não ordenado
//		HashMap<Integer, String> alunos = new HashMap<>();		
		
		alunos.put(aluno1.getMatricula(), aluno1.getNome());
		alunos.put(aluno2.getMatricula(), aluno2.getNome());
		alunos.put(aluno3.getMatricula(), aluno3.getNome());
		alunos.put(aluno4.getMatricula(), aluno4.getNome());
		alunos.put(aluno5.getMatricula(), aluno5.getNome());
		
		System.out.println("get 111: " + alunos.get(111));
		
		// se passar um novo com a mesma chave, vai substituir
		alunos.put(111, new String("Greg Mello"));
		// se passar objeto existente com uma chave diferente, adiciona o mesmo nome com chave informada
		alunos.put(4569, aluno5.getNome());
		
		
		alunos.remove(222);
		alunos.remove(333, aluno3);
		// se colocar chave e valor que não "batam", não remove nada
		
		System.out.println("get 111 alterado: " + alunos.get(111));
		System.out.println(alunos);
		System.out.println("==================");
		//List é uma especialização de Collection
//		List<Aluno> listaAlunos = alunos.values().stream().collect(Collectors.toList());
//		System.out.println(listaAlunos);
		
		// stream é uma classe que ajuda a trabalhar com listas
		// p stream() transforma a Collection (alunos.values()) em stream
		// e o collect transforma a Collection em lista
		// para não repetir o aluno5 (Regis Lopes)
		Set<String> setAlunos = alunos.values().stream().collect(Collectors.toSet());
//		
		List<String> listaAlunosX = setAlunos.stream().collect(Collectors.toList());
//		
//		// transforma um collection em um List
		List<String> listaAlunos = alunos.values().stream().collect(Collectors.toList());
//		
//		//Collection é o tipo mais genérico de lista
		Collection<String> listAlunosC = alunos.values(); // retorna o tipo mais genérico
//		
//					//COLLECTION
//		// LIST		SET		QUEUE		MAP
//		
		System.out.println(alunos.size());
		System.out.println(alunos.isEmpty());
		System.out.println(alunos.get(444));
		
		System.out.println(setAlunos);
		System.out.println(listaAlunosX);
		System.out.println(listaAlunos);
		System.out.println(listAlunosC);		
		System.out.println("============");
		System.out.println(alunos.values());
		
	}

}
