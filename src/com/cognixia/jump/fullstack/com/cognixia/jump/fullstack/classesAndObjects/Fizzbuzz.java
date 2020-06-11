package com.cognixia.jump.fullstack.classesAndObjects;
import java.util.Scanner;
public class Fizzbuzz {
	public static void main(String[] args) {
		
	    
		Scanner input = null;
		boolean flag = true;
		boolean valid;
		
		while(flag) {
		//Prompt
			System.out.println("Please enter a number");
			input = new Scanner(System.in);
			
			valid = input.hasNextInt();
			int userInput = input.nextInt();
			
			System.out.println("Do you want to include Prime? (Say yes if so)");
			if(valid) {
				for(int i = 1; i < userInput; i++) {
					
					if(isPrime(i)) {
						continue;
					}
					
					if(i % 3 == 0) {
						System.out.println("Fizz");
					}
					
					if(i % 5 == 0) {
						System.out.println("Buzz");
					}
					
					if(i % 3 == 0 && i % 5 == 0) {
						System.out.println("FizzBuzz");
					}
				}
	        }
	        else {
	        	System.out.println("Goodbye!");
	        	System.exit(0);
	        }
		}
		input.close();
		
	}
	

	public static boolean isPrime(int n) {
		
		boolean flag = false;
		for(int i = 2; i <= n/2; ++i) {
			
			//condition for non prime
			if(n % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			return true;
		}
		else {
			return false;
		}
	}
}
