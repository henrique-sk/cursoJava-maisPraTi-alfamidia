package Generics;

import java.util.List;

// a letra no <> define que é genérico
public class Impressora {
	
//	public T imprimirERetornar(T teste) {
//		System.out.println(teste);
//		return teste;
//	}
//	
//	public void imprimir(T teste) {
//		System.out.println(teste);
//	}
//	
//	// sobrecarga
//	public void imprimir(int teste) {
//		System.out.println(teste);
//	}
	
//	public <T extends Veiculo> void teste(T t) {
//		System.out.println(t);
//	}
	
//	public <T extends Number> void teste(T t) {
//		System.out.println(t);
//	}
	
	
	
	// <?> para o tipo mais genérico possível. Aceita qualquer coisa (funciona SOMENTE para listas)
	// EXTENDS se refere a objetos de níveis abaixo ou no mesmo nível
	// SUPER se refere a objetos de níveis acima (objeto pai)
	
//	public <T extends Number> void teste(List<? extends Object> lista) {
//		for(Object y : lista) {
//			System.out.println(y);
//		}
//		
//	}	
	public <T extends Number> void teste(List<? super Integer> lista) {
		for(Object y : lista) {
			System.out.println(y);
		}
		
	}

}
