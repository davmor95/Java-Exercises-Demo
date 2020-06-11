package com.cognixia.jump.Exercises;

import java.util.Scanner;

public class StringExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string:");
		String StringInput = sc.nextLine();
		String newString = "";
		char[] ch = StringInput.toCharArray();
		char curr_char = ch[0];
		newString = newString + curr_char;
		
		for(char c : ch) {
			if(curr_char != c) {
				curr_char = c;
				newString = newString + curr_char;
			}
		}
		
		System.out.println("New String: " + newString);
		
		//How to remove character next to each other
		//Use recursion
		
		
		
	}

}
