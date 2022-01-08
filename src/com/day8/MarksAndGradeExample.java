package com.day8;

public class MarksAndGradeExample {

	public static void main(String[] args) {

		//  marks range 90 - 100 - A
		
		// Marks range 75 -89  - B
		
		// marks range 60 - 74  - C
		
		// marks range 45 - 59 - D
		
		// Marks range < 45 - F
		
		
		
		int marks = 101;
		
		
//		if(marks <= 100 && marks >=90){
//			System.out.println("Grade A");
//		} else if(marks <= 89 && marks >=75){
//			System.out.println("Grade B");
//		}else if(marks <= 74 && marks >=60){
//			System.out.println("Grade C");
//		}else if(marks <= 59 && marks >=45){
//			System.out.println("Grade D");
//		} else {
//			System.out.println("Grade F");
//		}

		if(marks>100){
			System.out.println("Invalid Marks!!!!");
		} else if(marks >= 90 ){
			System.out.println("Grade A");
		}else if(marks >= 75 ){
			System.out.println("Grade B");
		}else if(marks >= 60 ){
			System.out.println("Grade C");
		}else if(marks >= 45 ){
			System.out.println("Grade D");
		}else {
			System.out.println("Grade F");
		}

		
		
	}

}
