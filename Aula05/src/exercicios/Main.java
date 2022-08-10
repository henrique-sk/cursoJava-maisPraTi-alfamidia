package exercicios;

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
		
		Animal chimpanze = new Primatas("Chimpanzé", 6);
		chimpanze.setAreaZoo(chimpanze.getQuantidade());
		Felinos onca = new Felinos("Onça", 4);
		onca.setAreaZoo(onca.getQuantidade());
		Aves aguia = new Aves("Águia", 2);
		aguia.setAreaZoo(aguia.getQuantidade());
		Animal coruja = new Aves("Coruja", 3);
		coruja.setAreaZoo(coruja.getQuantidade());
		
		ArrayList<Animal> animais = new ArrayList<Animal>(Arrays
				.asList(new Animal[]
						{chimpanze, onca, aguia, coruja}));
		
		for(Animal animal : animais) {
			System.out.println(animal);
		}
//---------------------------------------------------------------------------
//		>>> Exexcício 3 <<<
		
	}

}
