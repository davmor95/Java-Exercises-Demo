package com.cognixia.jump.Exercises;

public class Athlete {
	public enum Sport {
		TENNIS, FOOTBALL, SOCCER;
		
	}
	String firstName;
	String LastName;
	String dateOfBirth;
	Sport sport;
	
	//Default constructor
	
	
	//Constructor given by the user
	Athlete(String first, String last, String DOB, Sport sport) {
		this.firstName = first;
		this.LastName = last;
		this.dateOfBirth = DOB;
		this.sport = sport;
	}
	

}
