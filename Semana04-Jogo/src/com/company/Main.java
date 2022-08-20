package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		

//		boolean continuarPartida = true;		
//		String entrada;
//		while(continuarPartida) {
//			System.out.println("entre com as posições x e y (x,y): ");
//			entrada = sc.nextLine();
//			if (entrada.equals("FIM")) break;
//			String[] numeros = entrada.split(",");
//			int x = Integer.parseInt(numeros[0]);
//			int y = Integer.parseInt(numeros[1]);
//			System.out.println("x = " + x + "\ny = " + y);			
//		}
				
		// Desafio Aula2:
		//() Em classe separada, criar array de 10 por 10 iniciado por zeros
		//() Exibir na tela cada uma das 10 linhas, 10 zeros por linha
		
		Cenario mapa = new Cenario();
		mapa.desenhaCenario();
		
	}

}
