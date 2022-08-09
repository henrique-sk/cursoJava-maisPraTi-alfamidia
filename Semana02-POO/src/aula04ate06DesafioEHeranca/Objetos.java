package aula04ate06DesafioEHeranca;

public class Objetos {
	protected int valor1;
	protected int valor2;
	
	public Objetos(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	@Override
	public String toString() {
		return "(" + this.valor1 + ", " + this.valor2 + ")";
	}	
	
	// método para printar
	public void exibe() {
		System.out.println(this);
	}

}
