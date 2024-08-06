package model.services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlnePaymentService) {
		this.onlinePaymentService = onlnePaymentService;
	}
	
	public void processContract(Contrato contrato, int months) {
		double basicQuota = contrato.getTotalValue() / months;
	
	for(int i = 1; i < months; i++) {
		LocalDate dueDate = contrato.getDate().plusMonths(i);
		double interest = onlinePaymentService.interest(basicQuota, i);
		double fee = onlinePaymentService.paymentFee(basicQuota + interest);
		double quota = basicQuota + interest + fee;
		
		contrato.getInstallments().add(new Installment(dueDate, quota));
	}
	}

}
