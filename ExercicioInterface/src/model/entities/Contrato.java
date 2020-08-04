package model.entities;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Contrato {
	
	private Integer numeroContrato;
	private Date dataContrato;
	private Double valorTotalContrato;
	private List<Parcela> list=new ArrayList<>();
	
	public Contrato() {
		
	}
	
	public Contrato(Integer numeroContrato, Date dataContrato, Double valorTotalContrato) {
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorTotalContrato = valorTotalContrato;
		
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorTotalContrato() {
		return valorTotalContrato;
	}

	public void setValorTotalContrato(Double valorTotalContrato) {
		this.valorTotalContrato = valorTotalContrato;
	}
	 
	
	public List<Parcela> getList() {
		return list;
	}


	public void adicionarParcela(Parcela parcela) {
		list.add(parcela);
	}
	public void removerParcela(Parcela parcela) {
		list.remove(parcela);
	}
	
}
