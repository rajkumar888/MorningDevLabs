package com.day8;

public class StringArraryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to SDET Program";

		System.out.println(str);
		System.out.println(str.length());

		for (char ch : str.toCharArray()) {

			System.out.print(ch + " ");
		}
		
		
		System.out.println("....");
		for (int i = 0; i < str.length(); i++) {

			System.out.print(str.charAt(i) + " ");
		}

		System.out.println("....");
		for (int i = str.length()-1; i >=0 ; i--) {

			System.out.print(str.charAt(i) + " ");
		}

		
		
		
	}

}
