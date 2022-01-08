package com.day10;

public class NullPointerException {

	static NullPointerException obj1;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of the program");
		
		try {
			System.out.println(obj1.hashCode());
			Thread.sleep(5000);
		}
		
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("inside of finally block");
		}
		
		
		
		NullPointerException obj = new NullPointerException();
		System.out.println(obj);
		System.out.println("End of the program");

	}

}

