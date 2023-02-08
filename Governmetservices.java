package com.services.p1;

public class Governmetservices {
     void services(Person arg) {
    	 if(arg instanceof Student ) {
    		 Student s1=(Student)arg;
    		 if(s1.marks>=80.0) {
    			 System.out.println(s1.name+" is eligible for scholorship ");
    		 }
    		 else {
    			 System.out.println(" student is not eligible for scholorship ");
    		 }
    	 }
    	 else if(arg instanceof Employee) {
    		 Employee e1=(Employee)arg;
    		 if(e1.salary>=600000.00) {
    			 System.out.println("has to pay tax ");
    		 }
    		 else {
    			 System.out.println(" no need to pay tax enjoy ....");
    		 }
    	 }
    	 else if(arg instanceof Person) {
    		 System.out.println(" aadhar enrolled");
    	 }
     }
}
