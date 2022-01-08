package com.day8;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 200;
		
		int y = 100;
		
		if(true){
			
			System.out.println("inside if and condition is ture");
			
			if(x<y){
				System.out.println("inside nested if and condition is true");
			} else{
				System.out.println("inside nested if and condition is false");
			}
		}  // closing of outer if
		
		x = 30;
		y=10;
		
		if( x == 30 ) {
	         if( y == 10 ) {
	            System.out.print("value of y compare is true");
	         } else{
	        	 System.out.println("Value of y compare is false");
	         }
	      }

	}

}
