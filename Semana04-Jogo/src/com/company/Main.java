package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		

		String resp = "";
		int eixoX, eixoY;
		
		do {
			System.out.println("entre com posições x,y ou FIM para sair: ");
			resp = sc.nextLine();
			
			if (resp.equals("fim")) {
				System.out.println("Programa finalizado.");
				break;
			}
			
			eixoX = Integer.parseInt(resp.substring(0, 1));
			eixoY = Integer.parseInt(resp.substring(2, 3));
			System.out.println("Eixo X é: " + eixoX + "\nEixo Y é: "+ eixoY);
						
		} while (resp != "fim");
		
	}

}
