package com.day8;

public class SwitchBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = " hello ";
		
		
		name=name.trim().toUpperCase();

		switch (name) {

		case "HELLO":
			System.out.println("Value is found as " + name);
			break;

		case "hello":
			System.out.println("Value is found as " + name);
			break;

		case "Hello":
			System.out.println("Value is found as " + name);
			break;

		default:
			System.out.println("Value is not matched as " + name);
			break;

		}

	}

}
