package com.cognixia.jump.Exercises;

public interface Operators {
	public static void plus(int curr_num, int prev_num) {
		int result = curr_num + prev_num;
		System.out.println("Not divisible by 5:  "  + result);
		
	}
	
	public static void plus(String curr_num, String prev_num) {
		//Concatenate current number to previous number
		String result = curr_num + prev_num;
		System.out.println("Divisble by 5: " + result);
	}

}
