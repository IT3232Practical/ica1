package com.example.demo.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class DailyMenu {
@Id
private int id;
private Date date;

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

@ManyToOne
private Canteen canteen;

@ManyToMany
private List<Food>foods;
}
