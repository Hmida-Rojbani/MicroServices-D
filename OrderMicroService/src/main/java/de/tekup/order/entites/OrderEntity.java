package de.tekup.order.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class OrderEntity {
	@Id
	private int id;
	private String name;
	private int qty;
	private double price;
	private String transactionId;

}
