package com.day8;

import java.util.Arrays;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		
		do{
			System.out.print((i++) +", ");
			
		}while(i<=10);
		
		
		// integer type array
		
		int[] arr = {10, 40, 20, 89, 88, 55 };
		
		System.out.println("......");
		System.out.println(arr.length);
		
		// for each loop
		for(int a : arr){
			System.out.print(a+", ");
		}
		
		System.out.println("......");
		for(int x=0; x<arr.length; x++){
			System.out.print(arr[x]+", ");
		}
		System.out.println("......");
		for(int x=arr.length-1; x>=0; x--){
			System.out.print(arr[x]+", ");
		}
		System.out.println("......after sorting");
		Arrays.sort(arr);
		for(int x=0; x<arr.length; x++){
			System.out.print(arr[x]+", ");
		}

	}

}
