package com.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	
	int empNo;
	String name;
	int age;
	
	public Employee(int empNo, String name, int age) {
		this.empNo = empNo;
		this.name = name;
		this.age = age;
	}
	
	public Employee(){
		
	}
	
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		if (o1.age == o2.age)
			return 0;
		else if (o1.age > o2.age)
			return 1;
		else
			return -1;
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();

		Employee s1 = new Employee(101, "Vijay", 23);
		Employee s2 = new Employee(106, "Ajay", 27);
		Employee s3 = new Employee(105, "Jai", 21);
		
		
		Employee e4 = new Employee();
		al.add(s2);
		al.add(s1);
		al.add(s3);
		
		Collections.sort(al, e4);
		
		for (Employee st : al) {
			System.out.println(st.empNo + " " + st.name + " " + st.age);
		}
		
		
	}

	

}
