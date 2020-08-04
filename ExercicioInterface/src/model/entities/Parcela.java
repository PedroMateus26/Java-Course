package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	private Date dataParcela;
	private Double valorParela;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Parcela() {
		
	}

	public Parcela(Date dataParcela, Double valorParela) {
		this.dataParcela = dataParcela;
		this.valorParela = valorParela;
	}

	public Date getDataParcela() {
		return dataParcela;
	}

	public void setDataParcela(Date dataParcela) {
		this.dataParcela = dataParcela;
	}

	public Double getValorParela() {
		return valorParela;
	}

	public void setValorParela(Double valorParela) {
		this.valorParela = valorParela;
	}
	
	@Override
	public String toString() {
		return sdf.format(dataParcela) + " - " + String.format("%.2f", valorParela);
 	}
	
}
