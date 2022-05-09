package de.tekup.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionReqOrder {
	
	private int orderId;
	private double amount;

}
