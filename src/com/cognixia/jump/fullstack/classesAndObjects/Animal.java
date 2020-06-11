package com.cognixia.jump.fullstack.classesAndObjects;

public class Animal {
	public Animal(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	// Attributes
	protected int weight;
	private String name;
	//Constructors
	
	
	//methods
	
	

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.println("The is animal move.");
		
	}
	
	public int noises(String sound, int volume) {
		System.out.println("The animal makes a " + sound + " at volume "
				+ volume);
		return volume;
	}
	
	public void copyPaste() {
		System.out.println("this is original.");
	}
}
