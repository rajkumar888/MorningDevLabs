package com.day11;

public class GarbageCollectorFinalizeMethodDemo {
	
	
	protected void finalize() throws Throwable {
		System.out.println("Garbage collector is invoked ");
	}
	
	
	public GarbageCollectorFinalizeMethodDemo(){
		System.out.println("Construrctor is invoked");
	}
		
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.gc();
		
		GarbageCollectorFinalizeMethodDemo obj1 = new GarbageCollectorFinalizeMethodDemo();
		
		new GarbageCollectorFinalizeMethodDemo();
		new GarbageCollectorFinalizeMethodDemo();
		new GarbageCollectorFinalizeMethodDemo();
		System.gc();
		obj1=null;
		System.out.println(".....................");
		System.gc();
		System.out.println(".....................");
		new GarbageCollectorFinalizeMethodDemo();
//		System.gc();
		
		Runtime.getRuntime().gc();
		
	}

}
