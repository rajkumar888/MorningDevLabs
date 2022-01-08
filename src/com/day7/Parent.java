package com.day7;

public class Parent {
	
	public void m1(){
		
		System.out.println("m1 from Parent class invoked");
		
	}
	
	public Parent m2(){
		
		System.out.println("m2 from Parent class invoked");
		return new Parent();
		
	}
	
	public Object m2222222222(){
		
		System.out.println("m2 from Parent class invoked");
		return "Parent";
		
	}

}
