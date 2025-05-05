package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee extends Person {
private String jobPosition;
public String getJobPosition() {
	return jobPosition;
}
public void setJobPosition(String jobPosition) {
	this.jobPosition = jobPosition;
}
@ManyToMany
private List<Canteen>canteens;
}
