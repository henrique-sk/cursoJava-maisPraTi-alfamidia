package aula04ate06DesafioEHeranca;

public class Main {

	public static void main(String[] args) {
		// DESAFIO: Criar um array de objetos de uma classe:
		// (x) criar uma classe
		// (x) criar um array de objetos dessa classe
		// (x) instanciar 4 objetos
		// (x) setar valor1 e valor2 de cada objeto
		// (x) criar array para percorrer os elementos e printar cada um
		//    Ex.: para cada elemento, imprimir:
		//    (primeiroNum, segundoNum)

		Objetos[] arrayObjetos = new Objetos[4];
		
		arrayObjetos[0] = new Objetos(10, 20);
		arrayObjetos[1] = new Objetos(20, 40);
		arrayObjetos[2] = new Objetos(40, 80);
		arrayObjetos[3] = new Objetos(80, 160);
		
		for (Objetos elemento: arrayObjetos) {
			System.out.println(elemento);
		}
		
		System.out.println("--------------");
		
		for (Objetos elemento: arrayObjetos) {
			elemento.exibe();
		}
		
		System.out.println("--------------");
		
		ObjetosTriangulares[] arrayObjetosT = new ObjetosTriangulares[4];
		
		arrayObjetosT[0] = new ObjetosTriangulares(10, 20, 15);
		arrayObjetosT[1] = new ObjetosTriangulares(20, 40, 30);
		arrayObjetosT[2] = new ObjetosTriangulares(40, 80, 60);
		arrayObjetosT[3] = new ObjetosTriangulares(80, 160, 120);
		
		for (ObjetosTriangulares elemento: arrayObjetosT) {
			elemento.exibe();
		}
		
		System.out.println("--------------");

		Objetos[] arrayObjetosV = new Objetos[4];
		
		arrayObjetosV[0] = new ObjetosTriangulares(10, 20, 15);
		arrayObjetosV[1] = new Objetos(20, 40);
		arrayObjetosV[2] = new Objetos(40, 80);
		arrayObjetosV[3] = new ObjetosTriangulares(80, 160, 120);
		
		for (Objetos elemento: arrayObjetosV) {
			elemento.exibe();
		}
	}

}
