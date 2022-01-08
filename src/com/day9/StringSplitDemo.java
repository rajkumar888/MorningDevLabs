package com.day9;

public class StringSplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String test="Welcome to java course";
		
		
//			String[] arr = test.split(" ");
//			
//				for( int i=arr.length - 1; i>=0 ; i-- ){
//					
//					System.out.println(arr[i]);
//				}
				

		
		System.out.println(test.substring(10));
		
		System.out.println(test.substring(11,15));
		
		String test1=test.replaceAll("a", "");
		
		System.out.println(test1);
		
		System.out.println(test.length() - test1.length());
		
		
		String teste = test.replaceAll("e", "");
		
		System.out.println(test.length() - teste.length());
		
		
		
		String str666 = "Hello";
		String str777 = "hello";
		
		System.out.println(str666.equals(str777));
		
		System.out.println(str666.equalsIgnoreCase(str777));
		
		
		String str555 = "This is a java proram";
		
		String str999 = "Java";
		
		
		System.out.println(str555.contains(str999));
		
		String str6666666 = str555.replaceAll("java", "TestHello");
		
		System.out.println(str6666666);
		
		
		
	}

}
