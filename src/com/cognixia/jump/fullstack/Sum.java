package com.cognixia.jump.fullstack;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = null;
		boolean valid;
		int userinput = 0;
		int sum = 0;
		boolean flag = true;
		boolean valid2;
		//prompt
	  
	    
//		do {
//			System.out.println("Please enter a number: ");
//			input = new Scanner(System.in);
//			valid = input.hasNextInt();
//			if(valid) {
//				userinput = input.nextInt();
//			}
//			if(userinput > 50 && userinput != 101) {
//				System.out.println("Please enter a number less than 50");
//				valid = false;
//			}
//			if(userinput == 101) {
//				System.out.println("Goodbye");
//				System.exit(0);
//			}
//			
//	
//		} while(!valid);
//		//
//
//		for(int i = 1; i < 101; i++) {
//			if(i % userinput == 0) {
//				sum += i;
//			}
//		}
		
//		System.out.print("The sum of multiples of your userinput is:" + " " + sum);
//		input.close();
		while(flag) {
			System.out.println("Please enter a number: ");
			input = new Scanner(System.in);
			valid = input.hasNextInt();
			valid2 = input.hasNextLine();
			if(valid) {
				userinput = input.nextInt();
	
				for(int i = userinput; i < 101; i+=userinput) {
						sum += i;
					
				}
				
				System.out.println("Sum is: " + sum);
				
			}
			
			if(valid2) {
				System.out.println("Goodbye");
				System.exit(0);
			}
			
		
		
		}
		input.close();
	   
	}

}
