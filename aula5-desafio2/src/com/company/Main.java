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
        String resp = "s";
        while (resp.equals("s")) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Calcular novo IMC? (s/n)");
            resp = entrada.nextLine();
            if (resp.equals("s")) {
                System.out.println("Entre com o peso em Kg: ");
                float peso = entrada.nextFloat();
                entrada.nextLine();
                System.out.println("Entre com a altura em metros: ");
                float altura = entrada.nextFloat();
                entrada.nextLine();
                calculoImc(peso, altura);
            }
        }
    }
}