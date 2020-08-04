package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Parcela;

public class ServicoPagamento{
	private TaxaPagamentoOnline taxaPagamento;
	public ServicoPagamento() {
		
	}
	
	
	public ServicoPagamento( TaxaPagamentoOnline taxaPagamento) {
		this.taxaPagamento=taxaPagamento;
	}

	public void pagamentoParcelamento(Contrato contrato, Integer meses) {
		double parcelaBasica=contrato.getValorTotalContrato()/meses;
		for(int i=1;i<=meses;i++) {
			Date dataVencimento=adicionarMeses(contrato.getDataContrato(), i);
			double taxaAtualizada=parcelaBasica+taxaPagamento.juroSimplesParcela(parcelaBasica, i);
			double valorParcelaTotal=taxaAtualizada+taxaPagamento.taxaPagamentoOnline(taxaAtualizada);
			contrato.adicionarParcela(new Parcela(dataVencimento, valorParcelaTotal));
		}
	}
	private Date adicionarMeses(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
