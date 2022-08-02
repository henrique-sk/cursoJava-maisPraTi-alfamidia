package imc;

public class ImcNovo extends Imc {
	public ImcNovo(double peso, double altura) {
		super(peso, altura); // acessa o método da classe pai
	}
	
	@Override // define que este método está sobrescrevendo um método da classe pai
	public String classificacao() {
		this.calculaImc();
		if (this.getImc() < 16) return "magreza grave";
		if (this.getImc() < 17) return "magreza";
		if (this.getImc() < 18.5) return "magreza leve";
		if (this.getImc() < 25) return "saudável";
		if (this.getImc() < 30) return "sobrepeso";
		if (this.getImc() < 35) return "obesidade grau I";
		if (this.getImc() < 40) return "obesidade grau II";
		return "obesidade grau III";
	}

}