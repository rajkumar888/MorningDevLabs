package com.day8;

public class LabQ1HigestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Write a program to print the largest of three
//		numbers using if
//		else if

		
		int a=-300;
		int b=-190;
		int c=-130;
		
		int max=0;
		
		
//		if(a>b){
//			max=a;
//		}else{
//			max=b;
//		}
//		
//		if(max<c){
//			max=c;
//		}
//		
//		System.out.println("max is "+max);
		
		
		if(a>=b && a>=c){
			max=a;
		} else if(b>=a && b>=c){
			max=b;
		} else{
			max=c;
		}
		
		System.out.println("max is "+max);
		
	}

}
