package com.day11;

import java.util.ArrayList;

public class PalindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "hello";
		
		boolean palindrome=true;
		
		
//		for(int i=0,j=str.length()-1 ; i<str.length()/2 ; i++,j--){
//			
//			if( str.charAt(i)!=str.charAt(j)){
//				palindrome=false;
//				break;
//			}
//			
//		}
		
		
		
		
		
		for(int start=0, end=str.length()-1; start<end ; start++,end--){
			if( str.charAt(start)!=str.charAt(end)){
				palindrome=false;
				break;
			}
		}
		
		
		
		if(palindrome==true){
			System.out.println("Given string is a palindrome "+str);
		}else{
			System.out.println("Given string is a not a palindrome "+str);
		}

			
			
	}

}
