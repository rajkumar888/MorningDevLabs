package com.day7;

public class BankSBI implements Bank{

	
	public final float rateOfIinterest=10.5f;
	
	@Override
	public float getRateOfInterest() {
		System.out.print(" SBI rate of interest ");
		return rateOfIinterest;
	}

	
	public BankSBI(){
		
		System.out.println("BankSBI cosntructor is invoked");
	}
	
}
