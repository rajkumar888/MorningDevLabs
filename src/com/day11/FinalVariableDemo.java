package com.day11;

public class FinalVariableDemo {

	final int speedlimit;// final variable
	final int testfinal2;
	final int testfinal;
	
//	final int x;
	

//	void run() {
//		x = 400;
//	}

	public FinalVariableDemo(){
		testfinal2=100;
		System.out.println("value of testfinal2 "+testfinal2);
	}
	
	// initializer block
	{
		System.out.println("initializer block1 in java");
		speedlimit=180;
		System.out.println("value of speedlimit "+speedlimit);
		testfinal=200;
		System.out.println("value of testfinal "+testfinal);
	}
	
	{
		System.out.println("initializer blok2 in java");
		
	}
	
	
	public static void main(String args[]) {
		final FinalVariableDemo obj = new FinalVariableDemo();
		
		final int y;
		
		y=200;
		
		
		
		 
//		 obj = new Bike9();
		 
//		obj.run();
	}
}// end of class