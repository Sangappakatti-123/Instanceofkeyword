package com.services.p1;

public class Student extends Person {
     String usn;
     double marks;
	public Student(String name, int age, char gender, String usn, double marks) {
		super(name, age, gender);
		this.usn = usn;
		this.marks = marks;
	}
     
}
