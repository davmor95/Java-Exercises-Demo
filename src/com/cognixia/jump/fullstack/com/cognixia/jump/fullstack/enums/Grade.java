package com.cognixia.jump.fullstack.enums;

public enum Grade {
	FRESHMAN, SOPHMORE, JUNIOR, SENIOR;
	
	//All Enum's constructor is run once for each value. This statement will print
	Grade() {
		System.out.println("A " + this.toString() + " has been"
				+ "in high scbool for "
				+ (this.ordinal() + 1) + " years(s)");
	}
	
	//this method is available to all enums of this type
	
	public void hello() {
		System.out.println("Hello this student is a " + this.toString());
	}
}
