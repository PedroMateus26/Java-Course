package model.services;

public interface TaxaPagamentoOnline {
	public double juroSimplesParcela(double valorParcela, int meses);
	public double taxaPagamentoOnline(double valorParcela);
}
