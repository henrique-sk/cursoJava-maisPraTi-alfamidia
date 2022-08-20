package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		

		boolean continuarPartida = true;
		
		String entrada;
		while(continuarPartida) {
			System.out.println("entre com as posições x e y (x,y): ");
			entrada = sc.nextLine();
			String[] numeros = entrada.split(",");
			int x = Integer.parseInt(numeros[0]);
			int y = Integer.parseInt(numeros[1]);
			System.out.println("x = " + x + "\ny = " + y);
			if (entrada.equals("FIM")) break;
		}
		
//		String resp = "";
//		int eixoX, eixoY;		
//		do {
//			System.out.println("entre com posições x,y ou FIM para sair: ");
//			resp = sc.nextLine();
//			
//			if (resp.equals("FIM")) {
//				System.out.println("Programa finalizado.");
//				break;
//			}
//			
//			eixoX = Integer.parseInt(resp.substring(0, 1));
//			eixoY = Integer.parseInt(resp.substring(2, 3));
//			System.out.println("Eixo X é: " + eixoX + "\nEixo Y é: "+ eixoY);
//						
//		} while (resp != "FIM");
		
	}

}
