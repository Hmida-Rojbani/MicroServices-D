package de.tekup.order.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import de.tekup.order.dto.TransactionReqOrder;
import de.tekup.order.dto.TransactionResPayment;

@FeignClient(name = "PAYMENT-SERVICE")
public interface PaymentClient {
	
	@PostMapping("payment/doPayment")
	public TransactionResPayment processPay(@RequestBody TransactionReqOrder order);

}
