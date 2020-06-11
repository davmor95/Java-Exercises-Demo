package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class ReadWithException {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		int userInput = 0;
//		//prompt
//		System.out.println("Please enter a number: ");
//		try {
//		  userInput = input.nextInt();
//		} catch(Exception e) {
//			System.out.println("Please enter only numbers");
//		} finally {
//			input.close();
//		}
//		System.out.println(userInput);
		
		
		/* Section 2 
		 * */
		int userInput = 0;
		boolean valid = false;
		Scanner sc = null;
		while(true) {
//			int userInput = 0;
			//prompt
			
			System.out.println("Please enter a number: ");
			
			try {
			  sc = new Scanner(System.in);
			  valid = sc.hasNextInt();
			  userInput = sc.nextInt();
			 
			 
			} catch(Exception e) {
				System.out.println("Please enter only numbers");

			} finally {
				System.out.println("We are finally done.");
				if(valid) {
//					assert userInput > 0 : "Please dont type negatives";
					sc.close();
					break;
				}
	
			}
//			System.out.println("This didn't print:");
		
		}
		
		System.out.println("This printed fine:");
		
		
	}


}
