package com.cognixia.jump.fullstack.classesAndObjects;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "c"; //in the string pool
		String s2 = new String("c"); // in the heap memory
		String s3 = s2; // refers to the same address
		String s4 = "c";
		
		System.out.println(s1.equals(s2)); // this checks if the value is
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s2));
		System.out.println("------------");
		System.out.println(s1==s2);// this refers to the same address
		System.out.println(s1==s4);
		System.out.println(s2==s3);
		String testString = "DavidMorales";
		//looping through a string
//		for(int i = 0; i < testString.length(); i++) {
//			System.out.println(testString.toCharArray()[i]);
//		}
		
		
		StringBuilder builder = new StringBuilder("Starter String");
		
		StringBuffer buff = new StringBuffer(builder); // want to be thread safe
		
	
		System.out.println(builder.reverse().toString());
		
		//pass by ref and pass by value
		
	}
	
	public static int sum(int... inputs) {
		int sum = 0;
		for(int i : inputs) {
			sum+=1;
		}
		
		return sum;
	}
	

}
