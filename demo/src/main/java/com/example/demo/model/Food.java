package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Food {
@Id
private int id;
private String name;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

private double price;
private double weight;

@ManyToMany(mappedBy = "foods")
private List<DailyMenu> dailyMenus ;
}
