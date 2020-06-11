package com.cognixia.jump.Exercises;
import java.util.Scanner;

public interface Input {
	public default int getInt() {
		
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		
		//check that the input is valid 
		while(!scanner.hasNextInt()) {
			System.out.println("Not a number.");
			System.out.println("Do not enter tabs, newlines, or spaces.");
			scanner.nextLine();
		}
		
		//assign the int and at the end return it
		result = (int) scanner.nextInt();
		System.out.println("Number entered: " + result);
		
		if(scanner.equals(null)) {
			scanner.close();
		}
		return result;
		
	}
}
