package com.day7;

public class PerimeterOverloadingDemo {

	int length;
	int breadth;
	float radius;
	float pm;

	void perimeter(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
		pm = 2* (this.length+ this.breadth); 
		System.out.println("Permeter of Rectangle is "+pm);
	}
	
	void perimeter(int length){
		this.length = length;
		this.breadth = length;
		pm = 2* (this.length+ this.breadth); 
		System.out.println("Permeter of Square is "+pm);
	}
	
	void perimeter(float radius){
		this.radius = radius;
		pm = 2* (float)(22.0/7)*radius; 
		System.out.println("Permeter of circle is "+pm);
	}

	public static void main(String[] args) {
		
		
		PerimeterOverloadingDemo obj = new PerimeterOverloadingDemo();
		
		obj.perimeter(10, 20);
		
		obj.perimeter(20);
		
		obj.perimeter(5.0f);

	}

}
