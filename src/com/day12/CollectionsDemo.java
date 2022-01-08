package com.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class CollectionsDemo {

	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>();

		arrlist.add("str1");
		arrlist.add("str2");
		arrlist.add("str3");
		arrlist.add("str4");
		arrlist.add("str5");

		System.out.println(arrlist);

		// Collections
		boolean b = Collections.addAll(arrlist, "abc1", "abc2", "abc3", "abc4", "abc5");

		System.out.println(b);

		System.out.println(arrlist);

		ArrayList<Integer> arrlistInt = new ArrayList<Integer>();
		arrlistInt.add(330);
		arrlistInt.add(10);
		arrlistInt.add(20);
		arrlistInt.add(50);
		arrlistInt.add(70);
		
		
		System.out.println("Max value is: " + Collections.max(arrlistInt));
		System.out.println("Max value is: " + Collections.min(arrlistInt));
		System.out.println(arrlistInt);
		Collections.sort(arrlistInt);
		System.out.println(arrlistInt);
		
		ArrayList<Integer> arrlistInt2 = new ArrayList<Integer>();
		arrlistInt2.add(400);
		arrlistInt2.add(400);
		arrlistInt2.add(400);
		arrlistInt2.add(400);
		arrlistInt2.add(400);
		
		Collections.copy(arrlistInt2, arrlistInt);
		System.out.println(arrlistInt2);
		
		
	}

}