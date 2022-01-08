package com.day10;

public class StackOverFlowErrorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String str="Hello";
		
		while(true){
			
			str=str.concat(" test ");
			
			System.out.println(" Hello ");
			
		}
		

	}

}
