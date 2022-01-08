package com.day9;

public class PyramidShapePrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char ch='*';
		
		
		
		
			for(int row=1; row<=10; row++){
				
				int max=10-row;
				
				for(int space=max; space>=0; space--){
					System.out.print(" ");
				}
				
				for(int col=1; col<=row; col++){
					System.out.print(ch+" ");
				}
				System.out.println();
			}
		
		
		
		
		

	}

}
