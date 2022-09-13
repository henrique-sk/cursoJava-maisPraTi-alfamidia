package ProgramacaoFuncional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		// se for declarado sem o ArrayList, o PREDICATE não funciona
//		List<Integer> listaInteiros = Arrays.asList(7, 3, 7,  88, 48, 5, 6, 9);
		
		// para funcionar o PREDICATE, deve-se declarar como ArrayList
		List<Integer> listaInteiros = new ArrayList<>( Arrays.asList(7, 3, 7,  88, 48, 5, 6, 9) );
		
		// "->" é a forma usada para chamar uma função anônima
//		listaInteiros.forEach( (elemento) -> imprimir(elemento) );
//		// OU
//		System.out.println();
//		listaInteiros.forEach( (elemento) -> System.out.println(elemento) ); // CONSUMER
		// forEach espera um consumer
		// CONSUMER (forEach por exemplo) não modifica a lista
		
		// Predicate<> é uma interface funcional que retorna um -->>boolean<<--
		// ou seja, espera uma condição de TRUE or FALSE
		// PREDICATE (removeIf por exemplo) modifica a lista
//		lista.removeIf( (elemento) -> !elemento.startsWith("J") ); //PREDICATE
		
//		System.out.println();
//		lista.forEach( (elemento) -> System.out.println(elemento) ); // CONSUMER
		
//		Stream<Integer> stream = lista.stream();
//		
//		Stream<String> streamString = stream.map( (elemento) ->  elemento.toString() );
//		
//		System.out.println("\nLista de Strings");
//		List<String> listaString = streamString.collect(Collectors.toList()); // transforma em uma List de String
//		
//		listaString.forEach((elemento) -> System.out.println(elemento));
		
		// MÉTODOS FUNCIONAIS do STREAM
		List<String> listaString = listaInteiros.stream()
				.map((elemento) -> elemento * 9)
//				.filter((elemento) -> elemento % 2 == 0)
				// filter é um PREDICATE (ou seja, que espera um boolean) que filtra somente os números pares 
//				.sorted() // coloca em ordem
				.distinct() // remove os números repetidos (no caso o segundo 7)
				.map(elemento -> (elemento / 9) + " - " + elemento.toString())
				// MAP recebe um tipo (no caso Integer da List) e retorna outro que for especificado (no caso o String da List)
				// somente o stream tem o método map
				.collect(Collectors.toList()); // o collect toList é um método que finaliza, depois dele não se pode fazer mais nada
		
		System.out.println("---------------------------");
		
		// forEach é um CONSUMER, portanto não retorna nada
//		listaString.forEach( (elemento) -> return elemento ); // CONSUMER ERRADO
		
		listaString.forEach( (elemento) -> System.out.println(elemento));

	}
	
	public static<T> void imprimir(T t) {
		System.out.println(t);
	}

}
