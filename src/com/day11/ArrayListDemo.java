package com.day11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList test = new ArrayList();
		
		System.out.println(test.size());
		test.add("Hello");
		test.add("world");
		test.add('C');
		test.add(true);
		test.add(10.4);
		test.add(110.34f);
		test.add("Hello");
		test.add(null);
		test.add(null);
		System.out.println(test.size());
		
		
//		System.out.println(test);
		
		for(int i=0; i< test.size() ; i++){
			System.out.print(test.get(i)+" ");
		}
		System.out.println("................");
		for(Object  obj : test){
			System.out.print(obj+" ");
		}
		
		System.out.println("................");
		
		
		for(int i=test.size() -1 ; i>=0 ; i--){
			System.out.print(test.get(i)+" ");
		}
		System.out.println("................");
		
////		Collections.sort(test);
//		
//		for(int i=0; i< test.size() ; i++){
//			System.out.print(test.get(i)+" ");
//		}
//		System.out.println("................");

	}

}
