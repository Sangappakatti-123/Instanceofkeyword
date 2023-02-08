package com.services.p1;

public class  Mainclass5 {
   

public static void main(String[] args) {
	Governmetservices s1=new Governmetservices();
	Person p1=new Person("sangu",23,'m');
	Student a1=new Student("sangu",23,'m',"1sjj",125.00);
	Employee e1=new Employee("sangu",25,'m',13255,6000000.0,5);

	s1.services(p1);
	s1.services(a1);
	s1.services(e1);
}
  
}
