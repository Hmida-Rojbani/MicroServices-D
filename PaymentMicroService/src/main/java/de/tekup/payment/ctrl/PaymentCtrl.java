package de.tekup.payment.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.payment.dto.TransactionReqOrder;
import de.tekup.payment.dto.TransactionResPayment;
import de.tekup.payment.services.PaymentService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/payment")
@AllArgsConstructor
public class PaymentCtrl {
	
	private PaymentService paymentService;
	
	@PostMapping("/doPayment")
	public TransactionResPayment payProcessing(@RequestBody TransactionReqOrder reqOrder) {
		return paymentService.doPayment(reqOrder);
	}
	
	@GetMapping("/works")
	public String works() {
		return "Payment Works!";
	}

}
