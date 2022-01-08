package com.day12;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListListIteratorExample1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> arrlist = new ArrayList<String>();

		arrlist.add("str1");
		arrlist.add("str2");
		arrlist.add("str3");
		arrlist.add("str4");
		arrlist.add("str5");
		
//		System.out.println(arrlist); // [d,
//										// dd,
//										// ddd,
//										// dddd,
//										// ddddd]
		

		ListIterator<String> listiter = arrlist.listIterator(arrlist.size());
		
//		while( listiter.hasNext()){
//			
//			System.out.print(listiter.next()+" ");
//		}
//		
//		System.out.println();
		
		while( listiter.hasPrevious()){
			
			System.out.print(listiter.previous()+" ");
		}
		System.out.println();
		
//		ListIterator<String> iterator = arrlist.listIterator();
//		
//		while (iterator.hasNext()) {
//			String i = iterator.next();
//			System.out.println(i);
//		}
	}

}