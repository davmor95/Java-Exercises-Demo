package com.cognixia.jump.Exercises;

public class ExceptionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A();
	}
	
	public static void A() {
		B();
	}

	private static void B() {
		// TODO Auto-generated method stub
		C();
	}

	private static void C() {
		// TODO Auto-generated method stub
		try {
			D();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void D() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Here please");
	}

}
