package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Cenario mapa = new Cenario();

		boolean continuarPartida = true;		
		String entrada;
		while(continuarPartida) {
			System.out.println("entre com as posições x e y (x,y): ");
			entrada = sc.nextLine();
			if (entrada.equals("FIM")) break;
			String[] numeros = entrada.split(",");
			int x = Integer.parseInt(numeros[0]);
			int y = Integer.parseInt(numeros[1]);
			System.out.println("x = " + x + "\ny = " + y);	
			mapa.disparo(x,y);
			mapa.desenhaCenario();
		}		
	}
}
