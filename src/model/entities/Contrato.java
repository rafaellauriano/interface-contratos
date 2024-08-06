package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	
	private Integer numero;
	private LocalDate data;
	private Double valorTotal;
	
	private List<Installment> installments = new ArrayList<>();

	public Contrato(Integer numero, LocalDate data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumber() {
		return numero;
	}

	public void setNumber(Integer number) {
		this.numero = number;
	}

	public LocalDate getDate() {
		return data;
	}

	public void setDate(LocalDate date) {
		this.data = date;
	}

	public Double getTotalValue() {
		return valorTotal;
	}

	public void setTotalValue(Double totalValue) {
		this.valorTotal = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
}
