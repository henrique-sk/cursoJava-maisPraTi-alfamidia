package imc;

import java.util.Scanner;

public class ImcLeitura extends Imc{
	Scanner entrada;
	//Alt + Shift + S tb gera construtor
	public ImcLeitura(double peso, double altura) {
		super(peso, altura);
		entrada = new Scanner(System.in);
	}
	
	public ImcLeitura() {
		// construtor vaziu tem que ter parâmetros padronizados
		super(80, 1.8);
		entrada = new Scanner(System.in);
	}
	
	public void lerPeso() {
		System.out.println("Entre com o peso: ");
		this.setPeso(entrada.nextDouble());
	}
	
	public void lerAltura() {
		System.out.println("Entre com a altura: ");
		this.setAltura(entrada.nextDouble());
	}
	
}
