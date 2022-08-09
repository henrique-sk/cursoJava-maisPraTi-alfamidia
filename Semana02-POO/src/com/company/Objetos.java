package com.company;

public class Objetos {
	int valor1;
	// quando a propriedade ou o método é static
	// as infos não ficam na instância da classe
	// mas sim globais, pertentencentes a classe
	// quando o Objeto tiver um valor2 setado,
	// vai mudar o seu valor daí para adiante
	static int valor2;
	
	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public static int getValor2() {
		return valor2;
	}

	public static void setValor2(int valor2) {
		Objetos.valor2 = valor2;
	}

	public Objetos(int valor1) {
		this.valor1 = valor1;
	}
	
	public int calcula() {
		return valor1 * Objetos.valor2;
	}
	
	
}
