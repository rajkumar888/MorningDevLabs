package com.day9;

public class PrimeNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int start=2; start<=20; start++ ){
			
			boolean prime=true;
			
			for(int i=2; i<=start/2 ; i++){
				
				if((start%i)==0){
					prime=false;
					break;
				}
			}
			
			if(prime){
				System.out.println(start+" Prime Numbrer");
			}else{
				System.out.println(start+" Not a Prime Numbrer");
			}
			
		}
		
		

	}

}
