package de.tekup.order.services;

import org.springframework.stereotype.Service;

import de.tekup.order.entites.OrderEntity;
import de.tekup.order.repositories.OrderRepos;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderService {
	
	private OrderRepos orderRepos;

	public OrderEntity saveOrder(OrderEntity order) {
		order = orderRepos.save(order);
		return order;
	}

}
