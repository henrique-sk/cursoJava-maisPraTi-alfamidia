package exercicio.model;

public class Carro {
	public String placa;
	public String modelo;
	public String marca;
	public String cor;
	
	public Carro(String placa, String modelo, String marca, String cor) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
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

	public String toString() {
		return "Modelo=" + modelo +
				"\nMarca=" + marca +
				"\nCor=" + cor;
	}	

}
