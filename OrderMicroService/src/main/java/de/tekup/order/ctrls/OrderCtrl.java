package de.tekup.order.ctrls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/book")
	public OrderEntity bookOrder(@RequestBody OrderEntity order) {
		return orderService.saveOrder(order);
	}
	
	@GetMapping("/works")
	public String works() {
		return "Order Works";
	}

}
