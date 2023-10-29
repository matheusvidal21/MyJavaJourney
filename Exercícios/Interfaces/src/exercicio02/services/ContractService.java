package exercicio02.services;

import exercicio02.entities.Contract;
import exercicio02.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private static OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;
        for(int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallment().add(new Installment(dueDate, quota));
        }
    }

}
