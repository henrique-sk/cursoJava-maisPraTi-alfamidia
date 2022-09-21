package model;

import util.Contador;

public abstract class Pessoa implements Banco {
	// classes abstratas não podem ser instanciadas
	private Integer id;
	private String nome;
	private String email;
	private String cidade;
	private String senha;
	
	public Pessoa(String nome, String email, String cidade, String senha) {
		this.id = Contador.proximoId();
		this.nome = nome;
		this.email = email;
		this.cidade = cidade;
		this.senha = senha;
	}
	
	public Pessoa(int id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cidade = cidade;
		this.senha = senha;
	}
		
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}	
	
}
