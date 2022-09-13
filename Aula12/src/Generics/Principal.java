package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Impressora impressora = new Impressora();
		
		List<Number> listaObject = Arrays.asList(3, 10, 20);
		
		impressora.teste(listaObject);
		
//		Impressora<String> impressora = new Impressora();
//		Impressora<Double> impressora = new Impressora();
//		Impressora<Integer> impressora = new Impressora();
//		Impressora<Boolean> impressora = new Impressora();
		
//		impressora.imprimir("Teste");
//		impressora.imprimir(1);
//		impressora.teste(new Carro());
		
//		impressora.teste(10);
//		impressora.teste(10.5);
//		impressora.teste(1000000l);
//		impressora.teste(true);
		
	}

}
