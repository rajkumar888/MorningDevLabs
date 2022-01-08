package com.day7;

public class MethodOverLoadingDemo {
	
	// without any argument
	public void display(){
		System.out.println(" no argument method");
		
	}
	
	
	protected int display(int x){
		System.out.println(" integer argument method");
		return 1;
	}
	
	
	public void display(char letter){
		System.out.println(" char argument method");
		
	}


	public void display(int x, char letter){
		System.out.println(" int and char argument method");
		
	}
	
	void display(int x, char letter, String name){
		System.out.println(" default int and char and String argument method");
		
	}
	
	
	public void display(char letter, int x){
		System.out.println(" char and int argument method");
		
	}
	
}
