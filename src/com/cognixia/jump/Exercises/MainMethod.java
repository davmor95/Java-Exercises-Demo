package com.cognixia.jump.Exercises;
import  java.util.Scanner;
public class MainMethod implements Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayInt[];
		int arraySize = getSizeArray();
		arrayInt = new int[arraySize];
		
		inputElements(arrayInt);
		iterateAndPrint(arrayInt);
	}
	
	public static int getSizeArray() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of the array:");
		int arraySize = scanner.nextInt();
		
		if(scanner.equals(null)) {
			scanner.close();
		}
		return arraySize;
	}
	
	public static void inputElements(int[] array) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter elements:");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		scanner.close();

	}
	
	public static void iterateAndPrint(int[] array) {
		for (int index = 0; index < array.length; index++) {

			if (array[index] % 5 == 0 && index == 0) {
				Operators.plus(String.valueOf(array[index]), String.valueOf(array[index]));
			} else if (array[index] % 5 == 0 && index != 0) {
				Operators.plus(String.valueOf(array[index]), String.valueOf(array[index - 1]));
			}

			else {
				if (index == 0) {
					Operators.plus(array[index], array[index]);
				}

				else {
					Operators.plus(array[index], array[index - 1]);
				}
			}

		}
	}

}
 