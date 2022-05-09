package de.tekup.payment.services;

import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Service;

import de.tekup.payment.dto.TransactionReqOrder;
import de.tekup.payment.dto.TransactionResPayment;
import de.tekup.payment.entities.PaymentEntity;
import de.tekup.payment.repos.PaymentRepos;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PaymentService {
	
	private PaymentRepos paymentRepos;
	
	public TransactionResPayment doPayment(TransactionReqOrder txOrder) {
		PaymentEntity payment = new PaymentEntity();
		payment.setOrderId(txOrder.getOrderId());
		payment.setAmount(txOrder.getAmount());
		payment.setPaymentStatus(paymentProcessing());
		if(payment.getPaymentStatus().equals("success"))
		payment.setTransactionId(UUID.randomUUID().toString());
		paymentRepos.save(payment);
		return new TransactionResPayment( payment.getTransactionId(), payment.getPaymentStatus());
	}
	
	//3rd party payment Application (like paypal)
	public String paymentProcessing() {
		return new Random().nextBoolean()?"success":"failed";
	}

}
