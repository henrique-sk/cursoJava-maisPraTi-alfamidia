package aula01e02Generics;

// CLASSE GENÉRICA
//public class Impressora<T> {
//	
//	public T imprimir(T t) {
//		System.out.println(t);
//		return t;
//	}
//
//}

// MÉTODOS GENÉRICOS
public class Impressora {
	
	// totalmente Genérica
//	public static<T> T imprimir(T t) {
//		System.out.println(t);
//		return t;
//	}
	
	// Genérica que só trabalhe com um certo tipo
//	public static<T extends Animal> T imprimir(T t) {
//		System.out.println(t);
//		return t;
//	}
	
	// Genérica que só trabalhe com Number
	public static<T extends Number> T imprimir(T t) {
		System.out.println(t);
		return t;
	}

}
