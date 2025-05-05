package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Canteen {
@Id
private int id;
 private String name;
 public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

private String location;

@ManyToMany(mappedBy = "canteens")
private List<Employee> employees;
 
 @OneToMany(mappedBy="canteen")
 private List<DailyMenu>dailyMenus;
}

