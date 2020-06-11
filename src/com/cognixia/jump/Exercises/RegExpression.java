package com.cognixia.jump.Exercises;

import java.util.Scanner;

public class RegExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		boolean valid = false;
		String userInput = "";
		while(true) {
			while(true) {
				System.out.print("Please enter a string: ");
				
				try {
					sc = new Scanner(System.in);
					valid = sc.hasNextLine();
					userInput = sc.nextLine();
				} catch(Exception e) {
					System.out.println("Please enter a string");
				} finally {
					
					
					if(valid) {
						sc.close();
						break;
					}
				}
			}
			
			if(userInput.equals("DONE")) {
				return;
			}
			else {
				Regex(userInput);
			}
		}
		
//		try {
//			boolean found = userInput.matches(".*ca{2}.*");
//			System.out.println("Regex fund: " + found);
//		} catch(Exception e) {
//			System.out.println("Something went wrong");
//		}
	}
	
	public static void Regex(String str) {
		try {
			boolean found = str.matches(".*ca{2}.*");
			System.out.println("Regex fund: " + found);
		} catch(Exception e) {
			System.out.println("Something went wrong");
		
	    }
	}

}
