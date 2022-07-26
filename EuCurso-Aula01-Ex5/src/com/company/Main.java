//5. Escreva um algoritmo que leia 10 valores e encontre o maior e o
//menor deles. Mostre o resultado.

package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double valor = 0, maior = 0, menor = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "° valor: ");
			valor = entrada.nextDouble();
			if(i == 0) {
				maior = valor;
				menor = valor;
			}else {
				if(valor > maior) {
					maior = valor;
				}
				if(valor < menor) {
					menor = valor;
				}
			}
		}
		System.out.println("O maior valor é " + maior + " e o menor valor é " + menor + ".");
	}
}
