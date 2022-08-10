package exercicios;

public class Primatas extends Animal {
	
	private final String ORDEM = "Primates";
	
	public Primatas(String nome, int quantidade) {
		super(nome, quantidade);
	}

	@Override
	public void setAreaZoo(int quantidade) {
			this.areaZoo = quantidade * 300;
	}
	
	@Override
	public String toString() {
		return "Primata [nome=" + super.nome +
				", Ordem=" + this.ORDEM +
				", Quantidade=" + super.quantidade +
				", Área usada no Zoo (m²)=" + this.areaZoo +"]";
	}	

}
