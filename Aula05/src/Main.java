import java.util.ArrayList;
import java.util.TreeMap;

import model.Conta;
import model.ContaPJ;
import model.Funcionario;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {

// ================= ARRAYLIST ================= 
//		List é uma interface, logo não pode ser instanciadas
		
//		// Maiúscula: tipo objeto
//		// Minúscula: tipo primitivo
//		ArrayList<String> lista = new ArrayList<>();
//		
//		lista.add("José");
//		lista.add("Maria");
//		lista.add("Eduarda");
//		lista.add(0, "Raul"); // adiciona na posição 0
//		System.out.println(lista);
//		System.out.println(lista.toString());
//		
//		lista.set(1, "Maria Clara");
//		
//		System.out.println(lista.contains("Eduarda"));
//
//		lista.remove("Maria");
//		System.out.println(lista);
//		
//		lista.clear();
//		System.out.println(lista);
//		
//		// "nome" nesse caso é uma variável temporária
//		// somente dentro do escopo do for
//		for(String nome : lista) {
//			System.out.println(nome);
//		}
		
// ================= TRADEMAP ================= 
//
//		// TreeMap utiliza <key, value>
//		TreeMap<Integer, String> mapa = new TreeMap<>();
//		
//		mapa.put(4047718, "José Silva");
//		mapa.put(4532587, "Ana Clara");
//		
//		for(String nome : mapa.values()) {
//			System.out.println(nome);
//		}
//		
//		// verifica a key, se for igual, substitui
//		mapa.put(4047718, "Eduardo da Silva");
//		
//		for(String nome : mapa.values()) {
//			System.out.println(nome);
//		}
//		
//		mapa.remove(4047718);		
//		
//		
//		for(String nome : mapa.values()) {
//			System.out.println(nome);
//		}
//		
//		mapa.put(4047718, "Eduardo da Silva");
//		
//		System.out.println(mapa.containsKey(4532580));
//		System.out.println(mapa.containsKey(4532587));
//		System.out.println(mapa.containsValue("Ana Clara"));
//		System.out.println(mapa.toString());
//		

//		Conta conta = new Conta("João", 100);		
//		conta.depositar(500);		
//		System.out.println(conta);		
//		conta.sacar(600);
//		System.out.println(conta);		
//		conta.sacar(950);
//		System.out.println(conta);
		
//		ContaPJ contaPJ = new ContaPJ("Henrique", 100);
//		contaPJ.depositar(200);
//		contaPJ.sacar(300);
//		System.out.println(contaPJ);		
//		contaPJ.sacar(3500);
//		System.out.println(contaPJ);
		
		// polimorfismo
		// Pode instanciar usando a clase Conta ao invés da classe ContaPJ
		Conta contaPJ = new ContaPJ("João", 100);
		System.out.println(contaPJ);
		
		// Classes abstratas não podem ser instanciadas
		// Pessoa pessoa = new Pessoa(); // erro
		Pessoa pessoa = new Funcionario();
		
	}

}
