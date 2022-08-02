package aula;

public class Calculadora {
	
	// final para quando é IMUTÁVEL (constante)
	// deve ser em maiúsculas
	public static final double PI = 3.14;
	
	//static faz parte da classe e não do objeto
	public static double soma(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	public static double multiplica(double valor1, double valor2) {
		return valor1 * valor2;
	}
	
	public static double subtrai(double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	public static double divide(double valor1, double valor2) {
		return valor1 / valor2;
	}

}
