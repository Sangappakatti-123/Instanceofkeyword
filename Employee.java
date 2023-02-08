package com.services.p1;

public class Employee extends Person {
     int id;
     double salary;
     int exp;
	public Employee(String name, int age, char gender, int id, double salary, int exp) {
		super(name, age, gender);
		this.id = id;
		this.salary = salary;
		this.exp = exp;
	}
}
