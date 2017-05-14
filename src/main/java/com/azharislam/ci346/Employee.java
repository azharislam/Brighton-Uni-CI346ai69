package com.azharislam.ci346;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	public @Id @GeneratedValue Long id;
	public String firstName;
	public String lastName;
	public String shift;

	public Employee() {}

	public Employee(String firstName, String lastName, String shift) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.shift = shift;
	}
}