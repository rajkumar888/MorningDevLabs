package com.day11;

import java.util.ArrayList;
import java.util.List;

public class ArryListEequalsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(0);
		list.add(100);
		list.add(20);
		list.add(30);
		list.add(80);
		list.add(90);
		list.add(200);
		list.add(50);
		list.add(70);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(0);
		list2.add(100);
		list2.add(20);
		list2.add(30);
		list2.add(80);
		list2.add(90);
		list2.add(200);
		list2.add(50);
		list2.add(70);
//		list2.add(70);
		
		System.out.println(list.equals(list2));
		
		
		Integer[] arr = (Integer[]) list.toArray();
		
		
		
		

	}

}
