package de.tekup.order.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.tekup.order.config.PaymentClient;
import de.tekup.order.dto.TransactionReqOrder;
import de.tekup.order.dto.TransactionResPayment;
import de.tekup.order.entites.OrderEntity;
import de.tekup.order.repositories.OrderRepos;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderService {
	
	private OrderRepos orderRepos;
	//first approach (REST TEMPLATE)
	private RestTemplate template;

	public OrderEntity saveOrderWithTemplate(OrderEntity order) {
		//call the PaymentService
		TransactionResPayment payment 
		= template.postForObject("http://localhost:8989/payment/doPayment", new TransactionReqOrder(order.getId()
				,order.getQty()*order.getPrice()), 
				TransactionResPayment.class);
		order.setTransactionId(payment.getTransactionId());
		System.out.println(payment.getPaymentStatus());
		order = orderRepos.save(order);
		return order;
	}
	
	//with Feign
	private PaymentClient paymentClient;
	
	public OrderEntity saveOrder(OrderEntity order) {
		//call the PaymentService
		TransactionResPayment payment 
		= paymentClient.processPay(new TransactionReqOrder(order.getId()
				,order.getQty()*order.getPrice()));
		order.setTransactionId(payment.getTransactionId());
		System.out.println(payment.getPaymentStatus());
		order = orderRepos.save(order);
		return order;
	}

}
