package de.tekup.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekup.order.entites.OrderEntity;

public interface OrderRepos extends JpaRepository<OrderEntity, Integer>{

}
