package de.tekup.order.ctrls;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.order.entites.OrderEntity;
import de.tekup.order.services.OrderService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrderCtrl {
	
	private OrderService  orderService;
	
	@PostMapping("/book/order")
	public OrderEntity bookOrder(OrderEntity order) {
		return orderService.saveOrder(order);
	}

}
