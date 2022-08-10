package exercicios_correcao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import exercicios_correcao.ex01.Funcionario;
import exercicios_correcao.ex02.Animal;
import exercicios_correcao.ex02.Cachorro;
import exercicios_correcao.ex02.Humano;
import exercicios_correcao.ex03.Administrador;
import exercicios_correcao.ex03.Contador;
import exercicios_correcao.ex03.Programador;

public class Main {

	public static void main(String[] args) {
		
//		>>> Exexcício 1 <<<
// Cria uma classe do tipo Funcionario, com os campos: nome, função e cargo.
// Crie uma lista e adicione 10 objetos do tipo Funcionario dentro dela.
// Depois exiba no console todas informações de cada objeto
		
//		Scanner sc = new Scanner(System.in);
//		
//		List<Funcionario> funcionarios = new ArrayList<>();
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println("Digite o nome do funcionário: ");
//			String nome = sc.nextLine();
//			System.out.println("Digite a função do funcionário: ");
//			String funcao = sc.nextLine();
//			System.out.println("Digite o departamento do funcionário: ");
//			String dep = sc.nextLine();
//						
//			funcionarios.add(new Funcionario(nome, funcao, dep));
//		}
//		
////		funcionarios = Arrays.asList(new Funcionario("Maria", "Assistente", "RH")
////				, new Funcionario("José", "Chefe", "TI"));
//		
//		for(Funcionario funcionario : funcionarios) {
//			System.out.println(funcionario);
//		}
		
//---------------------------------------------------------------------------
//		>>> Exexcício 2 <<<
// Crie uma classe Animal, depois crie classes filhas a partir desta classe.
// Exemplo: humanos, macacos, tigres...
// A classe Animal deve ter um método e as classes filhas devem sebrepor esse
// método.
//
// (esse método pode ser qualquer coisa que eles têm em comum. Use sua
// criatividade)
		
//		Animal animal = new Animal();
//		Animal cachorro = new Cachorro();
//		Animal humano = new Humano();
//		
//		System.out.println(animal.comunicar());
//		System.out.println(cachorro.comunicar());
//		System.out.println(humano.comunicar());

//---------------------------------------------------------------------------
//		>>> Exexcício 3 <<<
// Crie uma classe abstrata Funcionário que tenha os campos: nome, valorHora, totalHoras.
// Esta classe também deve ter o método abstrato para retornar o valor total a receber.
// Depois crie algumas classes que estendem a classe Funcionario
// Todas classes filhas devem ter um campo constante com o valor de bonificação e a partir
// deste campo, fazer o cálculo do total a receber.
// 
// programador 5% (0.05), contador 3% (0.03), administrador 6% (0.06).
		
		Administrador administrador = new Administrador("Cristiano", 100, 140);
		Programador programador = new Programador("Cristiano", 100, 140);
		Contador contador = new Contador("Cristiano", 100, 140);
		
		System.out.println("Valor a receber ADM: R$" + administrador.valorAReceber());
		System.out.println("Valor a receber PROG: R$" + programador.valorAReceber());
		System.out.println("Valor a receber CONT: R$" + contador.valorAReceber());
		

	}

}
