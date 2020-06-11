package com.cognixia.jump.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cognixia.jump.Exercises.Athlete.Sport;

public class AthleteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Athlete> athleteList = new ArrayList<Athlete>();
		GetAthletes(athleteList);
		
		
	}
	
	public static void GetAthletes(List<Athlete> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter athlete's first name, last name, DOB, current sport in format (David Morales 01/06/95 TENNIS(the sport has to be captialized):");
		System.out.println("Please enter DONE to exit the program!");
		while(sc.hasNextLine()) {
			String person = sc.nextLine();
			String[] parts = person.split(" ");
			if(parts[0].equals("DONE")) {
				System.out.println("Goodbye!");
				break;
			}
			else if(parts.length > 4 || parts.length < 4) {
				System.out.println("You have entered nothing or you have entered more than 4 attributes! Please try again!");
				continue;
			}
//			else if(person.length() < 4) {
//				System.out.println("Dont forget to enter all four attributes! Please try again!");
//				continue;
//			}
//			else if(person.length() > 4) {
//				System.out.println("You entered more than 4 attributes! Please try again!");
//				continue;
//			}
			else {
				String name = parts[0];
				String last = parts[1];
				String DOB = parts[2];
				Sport sport = Sport.valueOf(parts[3]);
				System.out.println(parts[3]);
				Athlete athlete = new Athlete(name, last, DOB, sport);
				list.add(athlete);
			}
			
		}
		System.out.println("Out of the loop");
		System.out.println(list);
		sc.close();
		
	}

}
