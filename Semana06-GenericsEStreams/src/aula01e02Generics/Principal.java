package aula01e02Generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

//		List<Integer> lista = new ArrayList<>();
//		
//		lista.add(1);
////		lista.add(1.2);
////		lista.add("nome");
////		lista.add(true);
//		
//		for (Integer conteudo : lista) {
//			System.out.println(conteudo);
//			System.out.println(1 + conteudo);
//		}
		
		// Impressora (como CLASSE GENÉRICA)
//		Impressora<Integer> impressora = new Impressora();
//		impressora.imprimir(10);
//		
//		Impressora<String> imprimeString = new Impressora();
//		imprimeString.imprimir("String");
		
		// Impressora (com MÉTODOS totalmente GENÉRICOS)
//		Impressora impressora = new Impressora();
//		
//		Impressora.imprimir(10);
		
		// Impressora (com MÉTODOS GENÉRICOS de determinado tipo)
//		Impressora impressora = new Impressora();
//		Gato gato = new Gato();
		
		// Impressora (com MÉTODOS GENÉRICOS de tipo Number)
		Impressora impressora = new Impressora();
		impressora.imprimir(10);
		impressora.imprimir(10.5);

	}

}
