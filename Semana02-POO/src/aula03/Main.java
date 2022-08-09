package aula03;

public class Main {

	public static void main(String[] args) {
		int[] arrayInteiros = {10, 20, 30, 40, 50};

		for(int i = 0; i < arrayInteiros.length; i++) {
			int elemento = arrayInteiros[i];
			System.out.println(elemento);
		}
		
		System.out.println("---------------------");
		// for para percorrer array
		for(int elemento: arrayInteiros) {
			System.out.println(elemento);
		}
	}

}
