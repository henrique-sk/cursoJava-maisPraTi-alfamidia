package com.company;

import java.util.Scanner;

import com.company.Main;

public class Main {
	
	public double media(double notas) {
		return notas / 3;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		Scanner entrada = new Scanner(System.in);
		
		int resp = 1;
        while (resp != 0) {
            System.out.println("Qual o código do aluno? (0 para encerrar)");
            resp = entrada.nextInt();
            if (resp != 0) {
            	double notas = 0;
            	for(int i = 0; i < 3; i++) {
            		System.out.println("Digite a " + (i+1) + "ª nota: ");
            		notas = notas + entrada.nextDouble();
            	}
            	System.out.printf("A média do aluno é %.2f. %n", (main.media(notas)));
            	
            }
        }
	}

}