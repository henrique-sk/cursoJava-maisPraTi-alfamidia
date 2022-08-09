package aula04Desafio;

public class Objetos {
	private int valor1;
	private int valor2;
	
	public Objetos(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	@Override
	public String toString() {
		return "(" + this.valor1 + ", " + this.valor2 + ")";
	}	

}
