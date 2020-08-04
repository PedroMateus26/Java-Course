package model.services;

public class SevicoPagamanetoPaypal implements TaxaPagamentoOnline{
	
	public static final double TAXA_MENSAL=0.02;
	public static final double JUROS_MENSAL=0.01;
	
	public SevicoPagamanetoPaypal() {
		
	}

	@Override
	public double taxaPagamentoOnline(double valorParcela) {		
		return valorParcela*TAXA_MENSAL;
	}

	@Override
	public double juroSimplesParcela(double valorParcela, int meses) {
		return valorParcela*JUROS_MENSAL*meses;
	}

	
}
