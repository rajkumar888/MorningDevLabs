package com.day13;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("six");
		set.add("seven");
		set.add("eight");
		set.add("nine");
		set.add("ten");
		set.add(null);
		set.add("Three");
		set.add("seven1");
		set.add("seven2");
		set.add("seven3");
		set.add("seven4");
		set.add("seven5");
		
		System.out.println(set.size());
		
//		System.out.println(set);

//		Iterator<String> i = set.iterator();
//		
//		
//		while (i.hasNext()) {
//			
//			System.out.println(i.next());
//		}
		
		
		for(String   s :set){
			System.out.print(s+" ");
		}
		
		set.remove("One");  
		
		set.remove("Hello");  
		System.out.println("........");
		
		for(String   s :set){
			System.out.print(s+" ");
		}
		
		
		set.clear(); 
		
		System.out.println("\nAfter clearing "+set);
	}

}
