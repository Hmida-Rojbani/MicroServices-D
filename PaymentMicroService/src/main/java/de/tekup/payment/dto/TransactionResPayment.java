package de.tekup.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionResPayment {
	
	private String transactionId;
	private String paymentStatus;

}
