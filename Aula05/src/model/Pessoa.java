package model;

// Classe ABSTRATA
public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected String endereco;
	
	// método abstrato não tem implementação
	// as classes que herdam esse método são
	// obrigadas a implementar esse método
	public abstract String verDados();

}
