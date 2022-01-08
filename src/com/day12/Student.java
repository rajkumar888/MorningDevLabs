package com.day12;

import java.util.ArrayList;
import java.util.Collections;

public class Student  {
	int rollno;
	String name;
	int age;

	public Student() {

	}

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 = new Student(101, "Vijay", 23);
		Student s2 = new Student(106, "Ajay", 27);
		Student s3 = new Student(105, "Jai", 21);

		al.add(s2);
		al.add(s1);
		al.add(s3);
		
		Collections.sort(al, new StudentRollNoComparator());
		
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		
		System.out.println("...........................");
		Collections.sort(al, new StudentAgeComparator());
		
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		
		System.out.println("...........................");
		Collections.sort(al, new StudentNameComparator());
		
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}