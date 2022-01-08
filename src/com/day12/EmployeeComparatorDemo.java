package com.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class EmployeeComparatorDemo {

	int empNo;
	String name;
	int age;

	public EmployeeComparatorDemo(int empNo, String name, int age) {
		this.empNo = empNo;
		this.name = name;
		this.age = age;
	}

	public EmployeeComparatorDemo() {

	}

	public int getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		Vector<EmployeeComparatorDemo> al = new Vector<EmployeeComparatorDemo>();

		EmployeeComparatorDemo s1 = new EmployeeComparatorDemo(101, "Vijay", 23);
		EmployeeComparatorDemo s2 = new EmployeeComparatorDemo(106, "Ajay", 27);
		EmployeeComparatorDemo s3 = new EmployeeComparatorDemo(102, "Jai1", 21);
		EmployeeComparatorDemo s4 = new EmployeeComparatorDemo(104, "Jai3", 22);
		EmployeeComparatorDemo s5 = new EmployeeComparatorDemo(109, "Jai0", 18);
		EmployeeComparatorDemo s6 = new EmployeeComparatorDemo(100, "Jai2", 33);
		EmployeeComparatorDemo s7 = new EmployeeComparatorDemo(116, "Jai8", 29);
		EmployeeComparatorDemo s8 = new EmployeeComparatorDemo(115, "Jai9", 45);
		EmployeeComparatorDemo s9 = new EmployeeComparatorDemo(120, "Jai888", 45);
		EmployeeComparatorDemo s10 = new EmployeeComparatorDemo(188, "Jai77", 60);

		// EmployeeComparatorDemo e4 = new EmployeeComparatorDemo();
		al.add(s2);
		al.add(s1);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		al.add(s9);
		al.add(s10);

		Comparator<EmployeeComparatorDemo> cm1 = Comparator.comparing(EmployeeComparatorDemo::getName);

		Collections.sort(al, cm1);

		for (EmployeeComparatorDemo emp : al) {
			System.out.println(emp.empNo + " " + emp.name + " " + emp.age);
		}

		System.out.println("................................");

		Comparator<EmployeeComparatorDemo> cmgetEmpNo = Comparator.comparing(EmployeeComparatorDemo::getEmpNo);

		Collections.sort(al, cmgetEmpNo);

		for (EmployeeComparatorDemo emp : al) {
			System.out.println(emp.empNo + " " + emp.name + " " + emp.age);
		}

		System.out.println("................................");
		Comparator<EmployeeComparatorDemo> cmAge = Comparator.comparing(EmployeeComparatorDemo::getAge).reversed();

		Collections.sort(al, cmAge);

		for (EmployeeComparatorDemo emp : al) {
			System.out.println(emp.empNo + " " + emp.name + " " + emp.age);
		}

	}

}
