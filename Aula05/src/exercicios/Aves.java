package exercicios;

public class Aves extends Animal {
	
	private final String ORDEM = "Passeriformes";
	
	public Aves(String nome, int quantidade) {
		super(nome, quantidade);
	}
	
	@Override
	public void setAreaZoo(int quantidade) {
			this.areaZoo = quantidade * 900;
	}

	@Override
	public String toString() {
		return "Ave [nome=" + super.nome +
				", Ordem=" + this.ORDEM +
				", Quantidade=" + super.quantidade +
				", Área usada no Zoo (m²)=" + this.areaZoo +"]";
	}	

}
