package model;

import util.Contador;

public class Veiculo implements Banco {
	
	private Integer id;
	
	private String modelo;
	private String marca;
	private String cor;
	private String placa;
	private Tipo tipo;
	private double valorLocacao;
	private Status status;	
	
	public Veiculo(String modelo, String marca, String cor, String placa,
			String tipo, double valorLocacao) {
		this.id = Contador.proximoId();
		
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.placa = placa;
		// o tipo recebe uma String mas transforma em Tipo
		this.tipo = Tipo.valueOf(tipo.toUpperCase());
		this.valorLocacao = valorLocacao;
		this.status = status.LIVRE;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public String toString() {
		return this.id + " - " + this.modelo + " " + this.marca + " " + this.cor + " " + this.valorLocacao;
	}

	// os enums podem ficar dentro da classe
	// mas depende do projeto/empresa em que se está trabalhando
	public static enum Tipo{
		CARRO,
		CAMINHAO,
		MOTO;
	}
	
	public static enum Status{
		LIVRE,
		ALUGADO;
	}

}
