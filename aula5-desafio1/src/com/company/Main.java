package com.company;

import java.util.Scanner;

public class Main {
    public static void calculoImc(float peso, float altura) {
        double[] pesosImc = {18.5, 24.9, 29.9, 39.9, 900000};
        String[] classificacoesImc = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Grave"};

        float imc = peso / (altura * altura);
        System.out.println("O IMC é: " + imc);

        int i = 0;
        while (imc > pesosImc[i]) {i++;}
        System.out.println("A classificação é: " + classificacoesImc[i]);
    }

    public static void main(String[] args) {
        int resp = 1;
        while (true) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Calcular novo IMC? (1=Sim, 0=Não)");
            resp = entrada.nextInt();
            if (resp == 0) {
                break;
            }
            else if (resp == 1) {
                System.out.println("Entre com o peso em Kg: ");
                float peso = entrada.nextFloat();
                System.out.println("Entre com a altura em metros: ");
                float altura = entrada.nextFloat();
                calculoImc(peso, altura);
            }
        }
    }
}