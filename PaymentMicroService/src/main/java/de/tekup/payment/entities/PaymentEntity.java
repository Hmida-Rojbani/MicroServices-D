package de.tekup.payment.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "payment-table")
public class PaymentEntity {
	
	private long paymentId;
	private String paymentStatus;
	private String transactionId;
	
	private int orderId;
	private double amount;

}
