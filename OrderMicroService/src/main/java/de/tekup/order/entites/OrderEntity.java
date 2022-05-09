package de.tekup.order.entites;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "order")
@Data
public class OrderEntity {
	
	private int id;
	private String name;
	private int qty;
	private double price;
	private String transactionId;

}
