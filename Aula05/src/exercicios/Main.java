package exercicios;

import exercicios.ex01.*;
import exercicios.ex02.*;
import exercicios.ex03.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		>>> Exexcício 1 <<<
// Cria uma classe do tipo Funcionario, com os campos: nome, função e cargo.
// Crie uma lista e adicione 10 objetos do tipo Funcionario dentro dela.
// Depois exiba no console todas informações de cada objeto
		
//		Funcionario[] arrayFuncionarios = new Funcionario[10];
//		
//		arrayFuncionarios[0] = new Funcionario("Renan", "Executivo", "Administrador");
//		arrayFuncionarios[1] = new Funcionario("Carlos", "Supervisor", "Advogado");
//		arrayFuncionarios[2] = new Funcionario("Henrique", "Presidente", "Cientista de Dados");
//		arrayFuncionarios[3] = new Funcionario("Brenda", "Gerente", "Programadora");
//		arrayFuncionarios[4] = new Funcionario("Flávia", "Gerente", "Contadora");
//		arrayFuncionarios[5] = new Funcionario("Isabel", "Supervisora", "Administradora");
//		arrayFuncionarios[6] = new Funcionario("Paulo", "Empregado", "Programador");
//		arrayFuncionarios[7] = new Funcionario("Carla", "Empregado", "Analista de Dados");
//		arrayFuncionarios[8] = new Funcionario("Bruno", "Estagiário", "Analista Junior");
//		arrayFuncionarios[9] = new Funcionario("Ana", "Estagiária", "Programador Junior");
//				
//		for (Funcionario funcionario: arrayFuncionarios) {
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
		
//		Animal animal1 = new Primatas("Chimpanzé", 6);
//		animal1.setAreaZoo(animal1.getQuantidade());
//		Felinos animal2 = new Felinos("Onça", 4);
//		animal2.setAreaZoo(animal2.getQuantidade());
//		Aves animal3 = new Aves("Águia", 2);
//		animal3.setAreaZoo(animal3.getQuantidade());
//		Animal animal4 = new Aves("Coruja", 3);
//		animal4.setAreaZoo(animal4.getQuantidade());
//		
//		ArrayList<Animal> animais = new ArrayList<Animal>(Arrays
//				.asList(new Animal[]
//						{animal1, animal2, animal3, animal4}));
//		
//		for(Animal animal : animais) {
//			System.out.println(animal);
//		}
		
//---------------------------------------------------------------------------
//		>>> Exexcício 3 <<<
// Crie uma classe abstrata Funcionário que tenha os campos: nome, valorHora, totalHoras.
// Esta classe também deve ter o método abstrato para retornar o valor total a receber.
// Depois crie algumas classes que estendem a classe Funcionario
// Todas classes filhas devem ter um campo constante com o valor de bonificação e a partir
// deste campo, fazer o cálculo do total a receber.
// 
// programador 5% (0.05), contador 3% (0.03), administrador 6% (0.06).
		
		FuncionarioEx03 funcionario1 = new Programador("Henrique", 80, 8);
		FuncionarioEx03 funcionario2 = new Administrador("Ana", 70, 3);
		FuncionarioEx03 funcionario3 = new Contador("Flávia", 100, 4);
		
		ArrayList<FuncionarioEx03> funcionarios = new ArrayList<FuncionarioEx03>(Arrays
				.asList(new FuncionarioEx03[]
						{funcionario1, funcionario2, funcionario3}));
		
		for(FuncionarioEx03 funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	
	}

}
