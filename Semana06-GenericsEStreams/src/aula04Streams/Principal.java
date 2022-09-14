package aula04Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		// STREAMS
		// Para trabalhar com coleções de dados

		List<Integer> lista = Arrays.asList(5, 10, 10, 20, 30, 30);
		
		Stream<Integer> stream = lista.stream();		
		stream.forEach(x -> System.out.println(x));
		//OU usando o método de referência (::) se for usado somente UM parâmetro
//		stream.forEach(System.out::println);
		
		// distinct para não mostrar valores repetidos
		Stream<Integer> stream2 = lista.stream().distinct();
		System.out.println("-----");
		stream2.forEach(x -> System.out.println(x));
		
		// filter para mostrar somente os valores iguais ao indicado
		Stream<Integer> stream3 = lista.stream().filter(x -> x == 30);
		System.out.println("-----");
		stream3.forEach(x -> System.out.println(x));
		// OU diferentes
		Stream<Integer> stream4 = lista.stream().filter(x -> x != 30);
		System.out.println("-----");
		stream4.forEach(x -> System.out.println(x));
		
		// para mostrar somente os primeiros
		Stream<Integer> stream5 = lista.stream().limit(2);
		System.out.println("-----");
		stream5.forEach(x -> System.out.println(x));
		
		// map trabalha os valores conforme alguma função passada
		Stream<Integer> stream6 = lista.stream().map( x -> x + 10);
		System.out.println("-----");
		stream6.forEach(x -> System.out.println(x));
		
		// filtrar somente o primeiro valor indicado
		int y = lista.stream().filter(x -> x == 10).findFirst().get();
		System.out.println("-----");
		System.out.println(y);
		
		
		List<String> nomes = Arrays.asList("Ana", "Maria", "José");
		// filtrar somente o primeiro valor indicado, se não tiver retorna null
		String z = nomes.stream().filter(x -> x.equals("Mara")).findFirst().orElse(null);
		System.out.println("-----");
		System.out.println(z);
		
	}

}
