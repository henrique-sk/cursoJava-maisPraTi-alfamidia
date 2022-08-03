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
	
	public double lerDouble(String texto) {
		boolean continuarLeitura = true;
		double valor = 0;
		while(continuarLeitura) {
			System.out.println(texto);
			try {
				valor = Double.parseDouble(entrada.nextLine());
				continuarLeitura = false;
			} catch (NumberFormatException e) {
				System.out.println("Entrada com valor inválido!");
			}
		}
		return valor;
	}
	
	public void lerPeso() {
		this.setPeso(this.lerDouble("Entre com o peso: "));
	}
	
	public void lerAltura() {
		this.setAltura(this.lerDouble("Entre com a altura: "));
	}
	
}
