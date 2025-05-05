package com.example.demo.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class FoodOrder {
@Id
private int id;
private Date orderDate;

public Date getOrderDate() {
	return orderDate;
}

public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}

@ManyToOne
private Student student;

@OneToMany(mappedBy = "foodOrder")
private List<OrderLine> orderLines;
}
