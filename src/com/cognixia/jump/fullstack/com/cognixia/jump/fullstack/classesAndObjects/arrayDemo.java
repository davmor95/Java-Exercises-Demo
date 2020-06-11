package com.cognixia.jump.fullstack.classesAndObjects;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring array
		int[] intArray1;
		int intArray2[];
		cat cats[];
		
		//initializing
		intArray1 = new int[5];
		cats = new cat[5];
//		intArray2 = {50, 40, 35, 45, 10}; not valid
		
		//declare and initialize
		int intArray3[] = {50, 40, 35, 45, 10};
		cat litter[] = {new cat(10, "Mittens", "Toby"), 
				        new cat(), 
				        new cat()};
		
		//initial values
//		System.out.println(Arrays.toString(intArray1));
////		System.out.println(Arrays.toString(litter));
//		System.out.println(litter[0]);
//		System.out.println(litter[1]);
		
		//reading / writing / accessing array
		
		//iterating / looping through array 
		
		    // traditional for loop
			
//			for(int i = 0; i < intArray3.length; i++) {
//				System.out.println(intArray3[i]);
//			}
//			
//			System.out.println("---------------");
//			for(int i = intArray3.length - 1; i >= 0; i--) {
//				System.out.println(intArray3[i]);
//			}
		    // for each loop
		
//				//primitive array
//			for(int elem : intArray3) {
//				if(elem == 40) {
//					elem = 50;
//				}
//				System.out.println(elem);
//			}
			
			//test the write  for each loop with prim
//			System.out.println(Arrays.toString(intArray3));
//			for(cat cat : litter) {
//				if(cat.getName().equals("Mittens") ) {
////					cat = new cat(10, "Overridden", "New Cat");
////					cat = null;
//					cat.setName("Override"); //special case where write works
//					//able to change to override
//				}
//				System.out.println(cat);
//			}
//			
//			System.out.println("-----------------");
//			System.out.println(Arrays.toString(litter));
				//array of objects
		
		//Homogenous and hetrogenous arrays (inheritance)
			Animal[] animals = new Animal[3];
//			cats[0] = (cat) new Animal();
			animals[0] = new Animal();
			animals[1] = new cat();
		//array class static methods
			Array.getInt(intArray3, 4);
		
		//utility
//			String output = Arrays.toString(litter);
//			System.out.println(output);
			
			//Pass by ref and value
			//pass by value
			  //making copy of the data value
			  //for you method
			
			
			  // pass by reference is referring to the specific address in heap memory
			  // Not making a copy
			//Primitives are automatically pass by value
			int a = 4;
			int b = 10;
			int[] ints = new int[2];
			ints[0] = a;
			ints[1] = b; 
//			System.out.println(ints[0] + " " + ints[1]);
//			swapInts(ints);
//			System.out.println(ints[0] + " " + ints[1]);
			
			String regex = "dcaa cbd";
			boolean found = regex.matches(".*ca{2}.*");
			System.out.println("Regex fund: " + found);
			
			String str1 = "abcdefghijklmnopqrstuvwxyz";
			String str2 = str1.replaceAll("[aeiou]", "#");
	}
	
	public static void swapInts(int[] ints) {
		int c = ints[0];
		ints[0] = ints[1];
		ints[1] = c;
		System.out.println(ints[0] + " " + ints[1]);
	}
	
//	public static void swapInts(int a, int b) {
//		int c = a;
//		a = b;
//		b = c;
//		System.out.println(a + " " + b);
//	}
	
	public static int[] swapInts(int a, int b) {
		int[] arr = {b, a};
		return arr;
	}

}
