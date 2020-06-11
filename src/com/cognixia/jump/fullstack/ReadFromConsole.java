package com.cognixia.jump.fullstack;
import java.util.Scanner;
public class ReadFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//prompt
		System.out.println("Please enter a number: ");
		String userInput = input.nextLine();
		
		System.out.println(userInput);
		input.close();
	}

}
