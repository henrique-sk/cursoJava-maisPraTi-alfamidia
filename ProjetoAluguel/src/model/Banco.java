package model;

public interface Banco {
	
	// é um CONTRATO que garante que as classes terão esse método
	// , já que não há garantia da existência de um "getId" em uma classe "desconhecida"/genérica
	// Todos que implementarem o Banco DEVEM ter o método getId (é obrigatório)
	public Integer getId();

}
