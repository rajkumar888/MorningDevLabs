package com.day8;

import java.util.Scanner;

public class PositiveNegativeNumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		
	      Scanner console = new Scanner(System.in);
	      System.out.print("Enter any positive or negative number : ");
	      num = console.nextInt();
		
	      
	      if(num>=0){
	    	  System.out.println("Number is a positive number as "+num);
	      }else{
	    	  System.out.println("Number is a negative number as "+num);
	      }
		
	      
	}

}
