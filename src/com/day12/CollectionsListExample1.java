package com.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class CollectionsListExample1 {
	
	
	
	public static void main(String[] args) {
		// Create vector and array list
		Vector<Integer> v1 = new Vector<Integer>();
		
		Vector<String> v = new Vector<String>();
		// Populate the vector
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
		// Create enumeration
		
		System.out.println("Value of vector : " + v);
		
		Enumeration<String> e = v.elements();
		// Get the list
		
		List<String> arrlist = Collections.list(e);
		
		System.out.println("Value of returned list: " + arrlist);
	}
}