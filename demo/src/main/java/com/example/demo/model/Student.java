package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Student extends Person {
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	private String degree;
	
	@OneToMany(mappedBy="student")
	private List<FoodOrder>orders;
}
