package com.day11;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		 LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi111");  
		  al.add("Ajay");  
		  
//		  Iterator<String> itr=al.iterator(); 
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  
//		  }
		  
//		  System.out.println(al);
		  
		  for(int i=0; i<al.size(); i++){
			  System.out.println(al.get(i));
		  }
	}
}
