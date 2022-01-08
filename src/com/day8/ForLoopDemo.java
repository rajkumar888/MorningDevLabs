package com.day8;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// wap to print 1 - 100

//		for (int i = 1; i <= 20;i = i + 2) {
//			System.out.print(i + ", ");
//		}

		
		int x=100;
		
//		
//		while(x>=1){
//			System.out.print((x--) + ", ");
//		}
//		
		
		int ch=65;
//		
//		while(ch<=90){
//			System.out.print(((char)ch++) + ", ");
//		}
//		System.out.println(".........");
//		ch=97;
//		while(ch<=122){
//			System.out.print(((char)ch++) + ", ");
//		}
		
		
		ch=0;
		while(ch<=255){
			System.out.print(ch+ "-> "+((char)ch++) + ", ");
		}
	}

}
