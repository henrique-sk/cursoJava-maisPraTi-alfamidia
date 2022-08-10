package exercicios;

//>>> Exexcício 2 <<<
//Crie uma classe Animal, depois crie classes filhas a partir desta classe.
//Exemplo: humanos, macacos, tigres...
//A classe Animal deve ter um método e as classes filhas devem sebrepor esse
//método.
//
//(esse método pode ser qualquer coisa que eles têm em comum. Use sua
//criatividade)

public class Animal {
	protected String nome;
	protected final String ORDEM = "";
	protected int quantidade;
	protected double areaZoo;
	
	public Animal(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getORDEM() {
		return ORDEM;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getAreaZoo() {
		return areaZoo;
	}

	public void setAreaZoo(int quantidade) {
		if (this.ORDEM == "") {
			System.out.println("Favor informar a ordem!");
		} else {
			this.areaZoo = 0;
		}		
	}

	public String toString() {
		return "Animal [nome=" + nome +
				", Ordem=" + ORDEM +
				", Quantidade=" + quantidade +
				", Área usada no Zoo (m²)=" + areaZoo +"]";
	}
	
	
}
