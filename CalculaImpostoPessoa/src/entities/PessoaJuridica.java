package entities;

public class PessoaJuridica extends Pessoa{
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	
	
	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}


	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}


	@Override
	public double pagarImposto() {
		if(numeroFuncionarios<=10) {
			return getRendaAnual()*0.16;
		}
		else {
			return getRendaAnual()*0.14;
		}
	}
	
	@Override
	public String toString() {
		 return "Nome: "
				+getNome()
				+", Tipo de pessoa: Jur�dica"
				+", N�mero de funcion�rio: "
				+numeroFuncionarios
				+", Total de imposto pago: $"
				+String.format("%.2f", pagarImposto());
	}

}
