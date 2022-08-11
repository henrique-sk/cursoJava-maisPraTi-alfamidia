package aula;

import java.util.InputMismatchException;
import java.util.Scanner;

import aula.exception.NumeroMenorQueOPermitidoException;

// pode extender uma classe, não mais de uma
// a meno que seja interface, daí pode implementar mais de uma
//public class Main extends Retangulo{

//public class Main implements Forma, List, Map{
// daí é só ir importanto e implementando os métodos pedidos

public class Main {

//	public Main(double altura, double largura) {
//		super(altura, largura);
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {

//		Retangulo retangulo = new Retangulo(20,20);		
//		Forma retangulo02 = new Retangulo(20,20);
//		Circulo circulo = new Circulo(4);
//		Forma circulo02 = new Circulo(5);
//		
//		System.out.println(retangulo.area());
//		System.out.println(retangulo02.area());
//		System.out.println(circulo.area());
//		System.out.println(circulo02.area());
//		
//		// todas classes extendem Object
//		Object retangulo03 = new Retangulo(20, 2);		

		Scanner sc = new Scanner(System.in);

		int x = 0;
		boolean continua = true;
		do {
			try {
				System.out.println("Digite um número maior que 0: ");
				x = sc.nextInt();
				continua = false;
				
				if(x <= 0) {
					throw new NumeroMenorQueOPermitidoException("Número menor ou igual a que 0...");
				}
			} catch (InputMismatchException erro) {
				System.out.println("Ops, tipo não permitido!");
				erro.printStackTrace();
				sc.nextLine();
			} catch(NumeroMenorQueOPermitidoException erro) {
				erro.printStackTrace();
			}
		} while (continua);

		

	}

	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
