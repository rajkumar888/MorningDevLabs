package com.day7;


public class Child extends Parent{

	public Child m2() {
		System.out.println("m2 from child class invoked");
		return (new Child());
		
	}
	
	public String m2222222222() {
		System.out.println("m2 from child class invoked");
		return "child";
		
	}

	public void m3() {
			
		System.out.println("m3 from child class invoked");

	}
	
	
	public static void main(String[] args) {
		
//		Child obj = new Child();
//		
//		obj.m1();
//		
//		obj.m2();
//		
//		obj.m3();
		
//		Parent obj1 = new Child();
		
//		obj1.m1();
		
		
//		obj1.m2();
		
//		obj1.
		
//		((Child)obj1).m1();
//		
//		((Child)obj1).m2();
//		
//		((Child)obj1).m3();
//		
//		
//		Parent obj3 = new Parent();
//		obj3.m1();
//		
//		obj3.m2();
//		
////		((Child)obj3).m1();
		
		Parent obj4 = new Child();
		
//		Child obj5 = new Praent();
		
		
		
		obj4.m1();
		obj4.m2();
		
		
//		obj4.getClass().getSimpleName();
//		System.out.println(obj4.getClass().getSimpleName());
//		System.out.println(obj4.getClass().getSuperclass().getSimpleName());
//		
//		
//		// calling of overridden method m2 from parent class
//		try {
//			obj4.getClass()
//			.getSuperclass()
//			.getMethod("m1", new Class[]{})
//			.invoke(obj4.getClass().getSuperclass().newInstance(), new Object[]{});
//		
//			obj4.getClass()
//			.getSuperclass()
//			.getMethod("m2", new Class[]{})
//			.invoke(obj4.getClass().getSuperclass().newInstance(), new Object[]{});
//		
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		} 
		
		
		
		
		
		
	}

}
