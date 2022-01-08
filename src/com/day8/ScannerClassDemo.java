package com.day8;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {

		int age=0;
		  

	      // Create a Scanner object for keyboard input.
		
		
	      Scanner console = new Scanner(System.in);

	      // Get the year.
	      System.out.print("Enter your age : ");
	      age = console.nextInt();
	      
	      
	      if(age >= 18 ){
	    	  System.out.println(" You can vote ");
	      } else{
	    	  System.out.println("You can't vote");
	      }
		
	}

}
