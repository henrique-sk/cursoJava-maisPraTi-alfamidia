package aula04ate06DesafioEHeranca;

public class ObjetosTriangulares extends Objetos {
	public int valor3;

	public ObjetosTriangulares(int valor1, int valor2, int valor3) {
		super(valor1, valor2);
		this.valor3 = valor3;
	}
	
	public String toString() {
		return "(" + this.valor1 + ", " +
				this.valor2 +  ", " +
				this.valor3 + ")";
	}	
	
}
