package com.day7;

public class MethodOverloadingImplementationDemo {

	public static void main(String[] args) {
		MethodOverLoadingDemo obj1 = new MethodOverLoadingDemo();
		obj1.display();
		obj1.display('A');
		obj1.display(10);
		obj1.display('a',10);
		obj1.display(100,'c');
		obj1.display(10,'a',"Hello");
		
		System.out.println("..................");
		String str="Hello";
		main();
		main(10);
	}
	
	
	public static void main() {
		
		System.out.println("no argument main method");
	}

	
	public static void main(int x) {
		
		System.out.println("int argument main method");
	}
}
