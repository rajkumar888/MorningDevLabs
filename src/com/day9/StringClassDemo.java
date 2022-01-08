package com.day9;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str1 = "hello";
		
		
		System.out.println(str1);
		
		
		
		String str2 = str1;
		
		System.out.println(str2);
		
		System.out.println(str1 == str2 );
		
		System.out.println(str1.hashCode());
		
		System.out.println(str2.hashCode());
		
		StringClassDemo obj = new StringClassDemo();
		
		System.out.println(obj.hashCode());
		
		StringClassDemo obj1 = new StringClassDemo();
		System.out.println(obj1.hashCode());
		
		
		
		String str3 = new String("Test");
		
		String str4 = new String("TestHello");
		
//		System.out.println(str3.hashCode());
//		System.out.println(str4.hashCode());
		
		String str5 = new String(str4);
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		
		
		System.out.println(str4 == str5);		//heap memory area
		
		System.out.println( str4.equals(str5));		// heap memory but content comparison
		
		System.out.println( str4.intern() == str5.intern());  // string constant pool
		
		
		
		char[] vowels = {'a','e','i','o','u'};
		
		String strdemo = new String(vowels);
		
		System.out.println(strdemo);
		
		
		System.out.println(vowels);
		
		
		System.out.println(String.valueOf(vowels));
		
		String test="Welcome to java course";
		
		
		System.out.println(test.toUpperCase());
		System.out.println(test.toLowerCase());
		
		
		
		
	}

}
