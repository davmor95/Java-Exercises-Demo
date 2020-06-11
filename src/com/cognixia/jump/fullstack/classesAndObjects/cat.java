package com.cognixia.jump.fullstack.classesAndObjects;

public class cat extends Animal {
	private String type;
	
	private static int count = 0;
	private int id;
	
	public cat() {
		super(0, "");
		this.type = "";
		count++;
		this.id = count;
	}
	public cat(int weight, String name) {
		super(weight, name);
		// TODO Auto-generated constructor stub
	}

	cat(int weight, String name, String type) {
		super(weight, name);
		this.type = type;
		count++;
		this.id = count;
	}
	
	public static void printCatCount() {
		System.out.println("The number of cats : " + count);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public static int getCount() {
		return count;
	}
	
	@Override
	public void move() {
		System.out.println("the cat moved");
	}
	
	@Override
	public int noises(String sound, int volume) {
		System.out.println("Cat overrode this method.");
		return volume;
	}
	
	//method overload
	
	public void move(int x, int y) {
		System.out.println("Cat move x dist " + x + " y dist " +
	                       y);
	}
	
	@Override
	public String toString() {
		return "cat [type=" + type + ", id=" + id + ", getWeight()=" + getWeight() + ", getName()=" + getName() + "]";
	}
	
	
}
