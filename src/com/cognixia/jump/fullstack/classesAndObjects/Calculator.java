package com.cognixia.jump.fullstack.classesAndObjects;

public class Calculator {
	// attributes
		int one;
		int two;
		static int opsCount = 0;
		
		{
			System.out.println("This is the code block");
		}
		
		static {
			System.out.println("this is a static code block");
		}
		
		static {
			System.out.println("this is the second static block");
		}
		
		// constructor
		Calculator(){
			System.out.println("this is the constructor");
		}
		Calculator(int one, int two) {
			
			this.one = one;
			this.two = two;
			
		}
		
		// methods
		public static void sumOfTwoNumbers(int one, int two) {
			System.out.println(one + two);
			opsCount++;
		}
		
		// make a sum method for 2 numbers that takes them as parameters
		// and then returns the sum itself
		
		public static void multiply(int one, int two) {
			System.out.println(one * two);
			opsCount++;
		}
		
		// the () are the parameters - which is the data in
		public static double divide(double dividend, double divisor) {

			double quotient = dividend / divisor;
			opsCount++;
			// the return is the data out
			return quotient;
		}
}
