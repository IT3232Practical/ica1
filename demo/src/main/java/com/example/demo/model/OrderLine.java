package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderLine {
@Id
private int id;
private int quantity;

public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@ManyToOne
private FoodOrder foodOrder;
@ManyToOne
private Food food;
}
