package exercicios;

public class Felinos extends Animal {
	
	private final String ORDEM = "Carnivora";
	
	public Felinos(String nome, int quantidade) {
		super(nome, quantidade);
	}

	@Override
	public void setAreaZoo(int quantidade) {
			this.areaZoo = quantidade * 500;
	}
	
	@Override
	public String toString() {
		return "Felino [nome=" + super.nome +
				", Ordem=" + this.ORDEM +
				", Quantidade=" + super.quantidade +
				", Área usada no Zoo (m²)=" + this.areaZoo +"]";
	}	

}
