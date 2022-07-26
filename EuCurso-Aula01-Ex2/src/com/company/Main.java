//2. As maçãs custam R$ 0,30 cada se forem compradas menos
//do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
//Escreva um programa que leia o número de maçãs compradas,
//calcule e escreva o valor total da compra.

package com.company;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas maçãs quer comprar? ");
		int qtd = entrada.nextInt();
		
		if(qtd < 12) {
			System.out.printf("O valor total da compra é R$ %.2f. %n", (qtd * 0.3));
		}else {
			System.out.printf("O valor total da compra é R$ %.2f. %n", (qtd * 0.25));
		}
	}
}
