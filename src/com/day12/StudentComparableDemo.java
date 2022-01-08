package com.day12;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparableDemo implements Comparable<StudentComparableDemo> {
	int rollno;
	String name;
	int age;

	public StudentComparableDemo() {

	}

	public StudentComparableDemo(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

//	public int compareTo(Student st) {
//		if (age == st.age)
//			return 0;
//		else if (age > st.age)
//			return 1;
//		else
//			return -1;
//	}
	
	
//	public int compareTo(Student st) {
//		if (rollno == st.rollno)
//			return 0;
//		else if (rollno > st.rollno)
//			return 1;
//		else
//			return -1;
//	}
	
	public int compareTo(StudentComparableDemo st) {
		return name.compareTo(st.name);
		
//		if (name.compareTo(st.name)==0)
//			return 0;
//		else if (name.compareTo(st.name)> 0)
//			return 1;
//		else
//			return -1;
	}

	public static void main(String args[]) {

		ArrayList<StudentComparableDemo> al = new ArrayList<StudentComparableDemo>();

		StudentComparableDemo s1 = new StudentComparableDemo(101, "Vijay", 23);
		StudentComparableDemo s2 = new StudentComparableDemo(106, "Ajay", 27);
		StudentComparableDemo s3 = new StudentComparableDemo(105, "Jai", 21);

		al.add(s2);
		al.add(s1);
		al.add(s3);

		Collections.sort(al);

		for (StudentComparableDemo st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}