package entities;

public class PessoaFisica extends Pessoa{
	private Double gastoSaude;
	private char confirmacao;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, char confirmacao) {
		super(nome, rendaAnual);
		this.confirmacao=confirmacao;
	}
	
	public PessoaFisica(String nome, Double rendaAnual, char confirmacao, Double gastoSaude) {
		super(nome, rendaAnual);
		this.confirmacao=confirmacao;
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}


	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	
	public char getConfirmacao() {
		return confirmacao;
	}

	public void setConfirmacao(char confirmacao) {
		this.confirmacao = confirmacao;
	}

	@Override
	public double pagarImposto() {
		if(confirmacao=='n') {
		if(super.getRendaAnual()<20000.0) 
			return (super.getRendaAnual()*0.15);	
		else 
			return (super.getRendaAnual()*0.25);
		}
		else {
			if(super.getRendaAnual()<20000.0) 
				return (super.getRendaAnual()*0.15-gastoSaude*0.5);	
			else 
				return (super.getRendaAnual()*0.25-gastoSaude*0.5);
		}
	}

	
	public String toString() {
		if(confirmacao=='n') {
			return "Nome: "
					+getNome()
					+", Tipo de pessoa: F�sica"
					+", Renda anual: "
					+getRendaAnual()
					+", Total de imposto pago: $"
					+String.format("%2f", pagarImposto());
		}
		else {
			return "Nome: "
					+getNome()
					+", Tipo de pessoa: F�sica"
					+", Renda anual: "
					+getRendaAnual()
					+", Total de imposto pago: $"
					+String.format("%.2f", pagarImposto());
		}
	}

	
	
}
