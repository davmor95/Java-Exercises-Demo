package com.cognixia.jump.fullstack.classesAndObjects;

enum Suit {
	CLUB, DIAMOND, HEART, SPADE;
}

enum Rank {
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING; 
}

public class Card {
	private Suit suit;
	private Rank rank;
	
	Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public Rank getRank() {
		return rank;
	}
	

}
