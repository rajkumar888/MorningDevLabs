package com.day7;

public class BankImplementationProgram {

	public static void main(String[] args) {
		
		System.out.println("Global Rate of Interest "+ Bank.rateOfIinterest);
		
		BankSBI objSbi = new BankSBI();
		System.out.println(objSbi.getRateOfInterest());
		
		System.out.println("..................");
		
		Bank objICICI = new BankICICI();
		
		System.out.println(objICICI.getRateOfInterest());

	}

}
