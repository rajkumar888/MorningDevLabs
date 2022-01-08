package com.day7;

public class PerimeterOverloadingCodeMinimization {


	void perimeter(int length, int breadth){
		System.out.println("Permeter of Rectangle is "+(2* (length+breadth)));
	}
	
	void perimeter(int length){
		System.out.println("Permeter of Square is "+(4* length));
	}
	
	void perimeter(float radius){
		System.out.println("Permeter of circle is "+(2* (float)(22.0/7)*radius));
	}

	public static void main(String[] args) {
		PerimeterOverloadingCodeMinimization obj = new PerimeterOverloadingCodeMinimization();
		obj.perimeter(10, 20);
		obj.perimeter(20);
		obj.perimeter(5.0f);
	}
}
