package com.cognixia.jump.Exercises;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TimeTest {
    //The point of the program is to time how fast each data structure inserts and deletes each integer
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do {
			choice = getChoice();
			long startTime = System.currentTimeMillis();
			switch (choice) {
				case 1:
					RunArrayList();
					break;
				case 2:
					RunHashSet();
					break;
				case 3:
					RunLinkedList();
					break;
				case 4:
					RunArrayDeque();
					break;
				case 5:
					RunHashMap();
					break;
				default:
					break;
			}
			
			long endTime = System.currentTimeMillis();
			long duration = (endTime - startTime);
			long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
			long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
			System.out.println("Time duration minutes: " + minutes);
			System.out.println("Time duration seconds: " + seconds);
			System.out.println("Time duration milliseconds: " + duration);
			
			
		} while(choice > 0);
	}
	
	static int getChoice() {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("    ADT MENU   ");
		System.out.println("0.Quit");
		System.out.println("1.ArrayList");
		System.out.println("2.HashSet");
		System.out.println("3.LinkedList");
		System.out.println("4.ArrayDeque");
		System.out.println("5.HashMap");
		System.out.println("Your choice:");
		
		choice = sc.nextInt();
		return choice;
	}
	
	static void RunArrayList() {
		List<Integer> myList = new ArrayList<Integer>();
		
//		for(int i = 1; i <= 500000; i++) {
//			myList.add(i);
//		}
		
		for(int i = 0; i < 500000; i++) {
			myList.add(i);
		}
		
//		for(int i = 0; i < 10; i++) {
//			myList.remove(i);
//		}
		//Remove all elements
		myList.removeAll(myList);
		
	}
	
	static void RunHashSet() {
		HashSet<Integer> myHash = new HashSet<Integer>();
		//inserting elements into hashset
		for(int i = 1; i <= 500000; i++) {
			myHash.add(i);
		}
 				
		//deleting elements of hashset
		for(int i = 1; i <= 500000; i++) {
			myHash.remove(i);
		}
		
		
	}
	
	static void RunLinkedList() {
		LinkedList<Integer> myList = new LinkedList<Integer>();
		//inserts
		for(int i = 0; i < 500000; i++) {
			myList.add(i);
		}
		
		//deletes
		while(!myList.isEmpty()) {
			myList.remove();
		}
		
	}
	
	static void RunArrayDeque() {
		Deque<Integer> myDeque = new ArrayDeque<Integer>(500000);
		
		for(int i = 1; i <= 500000; i++) {
			myDeque.add(i);
		}
		
		while(!myDeque.isEmpty()) {
			myDeque.remove();
		}
		
	}
	
	static void RunHashMap() {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < 500000; i++) {
			map.put(i, i + 1);
		}
		
		for(int i = 0; i < 500000; i++) {
			map.remove(i);
		}
	}
	
	
}
