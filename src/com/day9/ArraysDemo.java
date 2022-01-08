package com.day9;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		// int row=5;
		//
		// int col=6;
		//
		// int[] arr1 = new int[row]; //creation of array;

		// int[] arr2 = {55,66,44,33,22,87}; //creation and initialization
		//
		//
		// System.out.println(arr2[5]);
		//
		// System.out.println(arr2.length);
		//
		// arr2[3]=7890;
		//
		// System.out.println(arr2[3]);
		//
		// for(int i=0; i<arr2.length ; i++){
		//
		// System.out.print(arr2[i]+" ");
		//
		// }

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		arr[0] = 66;
		arr[1] = 33;
		arr[2] = 11;
		arr[3] = 22;
		arr[4] = 45;
		arr[5] = 61;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("...............");
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
			int sum=0;
			
			for (int i = 0; i < arr.length; i++) {
				sum=sum+arr[i];
			}
			
			
			System.out.println("Sum of Array "+sum);
			
			System.out.println("Average of Array "+((float)sum/arr.length));


		
	}

}
