package imc;

public class Imc {
	private double peso; // Alt + Shift + S p/ gerar get/set
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0) return;
		this.peso = peso;
	}

	private double altura; // private - para não dar acesso externo
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// protected double imc; // protected - pode ser usado pela classe herdada (ImcNovo)
	// ou usar pprivate com getter
	private double imc;	
	public double getImc() {
		return imc;
	}

	public Imc(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public void calculaImc() {
		this.imc = ( (this.peso) / (this.altura * this.altura));
	}
	
	public String classificacao() {
		this.calculaImc();
		if (this.imc < 18.5) return "magreza";
		if (this.imc < 24.9) return "normal";
		if (this.imc < 29.9) return "sobrepeso";
		if (this.imc < 39.9) return "obesidade";
		return "obesidade grave";
	}
}
