package com.cognixia.jump.fullstack.classesAndObjects;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
public class DateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a date in format (April 13, 2020): ");
		Scanner input = new Scanner(System.in);
		String stringDate = input.nextLine();
		String noComma = stringDate.replace(",","");
		System.out.println("output string: " + noComma);
		int month = 0;
		int day = 0;
		int year = 0;
		String[] tokens = noComma.split(" ");
		
//		String[] tokens = stringDate.split(" ");
//		
		System.out.println("output string: " + Arrays.toString(tokens));
		
		
		
		/* Now convert the string to a date object 
		 * First convert monthString to monthInt */
		
		month = monthConv(tokens[0]);
		day = Integer.parseInt(tokens[1]);
		year = Integer.parseInt(tokens[2]);
		
		@SuppressWarnings("deprecation")
		Date d1 = new Date(year, month, day);
		
		System.out.println("Current date is " + d1);
		
		
		input.close();
	}
	
	
	public static int monthConv(String monthString) {
		int monthInt = 0;
		
		switch (monthString) {
		case "January":
			monthInt = 1;
			break;
		case "February":
			monthInt = 2;
		case "March":
			monthInt = 3;
			break;
		case "April":
			monthInt = 4;
		case "May":
			monthInt = 5;
		case "June":
			monthInt = 6;
			break;
		case "July":
			monthInt = 7;
		case "August":
			monthInt = 8;
			break;
		case "September":
			monthInt = 9;
		case "October":
			monthInt = 10;
		case "November":
			monthInt = 11;
		case "December":
			monthInt = 12;
		default:
			break;
		}
		
		return monthInt;
		
	}
	
}
