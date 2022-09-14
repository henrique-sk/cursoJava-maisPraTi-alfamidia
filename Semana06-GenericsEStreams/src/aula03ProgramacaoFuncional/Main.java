package aula03ProgramacaoFuncional;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		
		nomes.add("Maria");
		nomes.add("Ana");
		nomes.add("José");
		nomes.add("João");
		nomes.add("Aldair");
		
		System.out.println(nomes);
		// exemplo para remover com if
		for(int i = 0; i < nomes.size(); i++) {
			if(nomes.get(i).equals("José")) {
				nomes.remove(i);
			}
		}
		
		System.out.println("------\n" + nomes);
		// exemplo para remover com removeIf
		// PREDICATE
		// removeIf percorre a lista e compara se Ana está entre os nomes para remover
		nomes.removeIf(nome -> compara(nome, "Ana"));
		System.out.println("------\n" + nomes);
		
		// exemplo para imprimir nome por nome
		System.out.println("------");
		nomes.forEach(nome -> System.out.println(nome));
		
		// exemplo para remover com expressão lambda
		nomes.removeIf(nome -> nome.equals("João"));
		System.out.println("------\n" + nomes);
		// OU se começa com uma letra
		nomes.removeIf(nome -> nome.startsWith("A"));
		System.out.println("------\n" + nomes);
		
	}
	
	public static boolean compara(String nome, String param) {
		return nome.equals(param);
	}

}
