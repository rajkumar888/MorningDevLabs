package com.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemoWithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list = new ArrayList<Integer>();
//		System.out.println(list.isEmpty());
		
		list.add(0);
		list.add(100);
		list.add(20);
		list.add(30);
		list.add(80);
		list.add(90);
		list.add(200);
		list.add(50);
		list.add(70);
		
		System.out.println(list);
		
		System.out.println(list.contains(new Integer(20)));
		System.out.println(list.contains(20));
//		
//		System.out.println(list.isEmpty());
//		
//		Collections.sort(list);
//		System.out.println(list);
//		
//		Collections.reverse(list);
//		System.out.println(list);
		
		
//		 Iterator<Integer> iter = list.iterator();
//		
//		while(iter.hasNext()){
//			System.out.print(iter.next()+" ");
//		}
		
//		list.forEach(System.out::println); 
		
//		list.forEach(System.out::println);
//		list.forEach(System.out::print);
		
//		list.stream().forEach(s -> System.out.println(s));
		
//		list.clear();
//		System.out.println(".............");
//		list.stream().forEach(s -> System.out.println(s));
		
//		list.remove(new Integer(200));
//		System.out.println(".............");
//		list.stream().forEach(s -> System.out.println(s));
		
//		list.remove(1111);
//		System.out.println(".............");
//		list.stream().forEach(s -> System.out.println(s));
//		
		
		
	}

}
