package com.cognixia.jump.fullstack.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionsRunner {

	public static void main(String[] args) {
		
		//wrapper classes
		//left are primitives, right are classes(objects)
		//Process of autoboxing
		int i = 1;         Integer I = i;
		double d = 2.0;    Double D = d;
		boolean b = true;  Boolean B = b;
		char c = '3';      Character C = c;
		
		//unboxing
		int j = Integer.valueOf(c);
		
		// TODO Auto-generated method stub
		/* Linked List are acting different using polymorphism 
		 * Change behavior of how each link list is going to behave*/
		//List
		List<Animal> animalList = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();
		
		animalList.add(new WolfHybrid());
		animalList.add(new Elephant());
		animalList.add(new Elephant());
		
		Integer[] ints = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		
		intList = Arrays.asList(ints);
		System.out.println(intList);
		List<Animal> animalLL = new LinkedList<>(animalList);
		
		//Set
		Set<Animal> animalSet = new HashSet<>(animalList);
		//for the interview question
		//to get rid of duplicates
		Set<Integer> intSet = new HashSet<>(intList);
		System.out.println(intSet);
		//Queue
		Queue<Animal> animalQ = new LinkedList<>();
		
		//Deque
		Deque<Animal> animalDq = new LinkedList<>();
		
		//Map
		Map<Integer, String> map = new HashMap<>();
		
		//Taking the map keys and converting them into a list
		List<Integer> mapList = new ArrayList<>(map.keySet());
		List<String> valueList = new ArrayList<>(map.values());
//		for(Integer integer : mapList) {
//			if(map.containsKey(4)) {
//				map.remove(key, value);
//			}
//		}
		
		//how array list works
		ArrayList<Integer> al = new ArrayList<>(5);
		// a1.add x10 fill my starting array
		// i go to add the 11th item, but out of space (dont't worry)
		// 2nd array is created at 50% increased size (size = 15)
		// the items of the old array are copied over the same order
		// now i can fill items 12 - 15 without having to resize and then
		// at 15, I repeat the 50% growth process, and this keeps repeating
		al.add(9,9);
		
		
	}

}
