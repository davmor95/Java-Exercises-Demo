package com.cognixia.jump.fullstack.classesAndObjects;
import java.util.Arrays;
public class MatchingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arrsize1 = 0;
//		int arrsize2 = 0;
		int array1[] = {1, 3, 5, 0};
		int array2[] = {0, 5, 1, 4};
		int match = 0;
		for(int i : array1) {
			for(int j : array2) {
				if(i == j) {
					match++;
				}
			}
		}
//		
////		for(int i : array1) {
////			boolean test = Arrays.indexOf()
////			if(test == false) {
////				System.out.println("This array doesn't match");
////			}
////		}
////		
////		System.out.println("This array matches");
////		
//		if(match == array1.length) {
//			System.out.println("This array matches");
//		}
//		
//		else {
//			System.out.println("This array doesn't match");
//		}
		
//		int array1 = {1, 3, 5, 0};
//		int array2 = {0, 5, 1, 4};
//		
//		String con1;
//		String con2;
		
	}
	
}
