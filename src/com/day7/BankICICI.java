package com.day7;

public class BankICICI implements Bank{

	
	public final float rateOfIinterest=9.51f;
	
	@Override
	public float getRateOfInterest() {
		System.out.print(" Icici rate of interest ");
		return rateOfIinterest;
	}

	public BankICICI(){
		
		System.out.println("BankICICI cosntructor is invoked");
	}
	
	
}
