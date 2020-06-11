package com.cognixia.jump.fullstack.interfaces;

public class Runner {

	public static void main(String[] args) {
		
		WolfHybrid hybrid = new WolfHybrid();
		
		hybrid.move();
		hybrid.bark();

		
		// Java 8 interface
		
		System.out.println(Calculator.sum(2,4));
//		System.out.println(Calculator.multiply(2,4));
		System.out.println(hybrid.multiply(4,5,6));
		
		System.out.println(hybrid.multiply(1));
	}

	
}
