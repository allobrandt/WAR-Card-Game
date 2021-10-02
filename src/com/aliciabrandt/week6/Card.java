package com.aliciabrandt.week6;

public class Card {
	
	// Field: value (#s 2-14 representing 2, 3, 4, 5, 6, 7, 8, 9, 10, Jacks - 11,
	// Queens -12, Kings -13, Aces -14
	// Field: name (e.g. Ace of Diamonds, Two of Hearts, etc
	// Method: getters & setters
	// Method: describe (prints out information about a card)

	private int value; // Player 1's card value will be compared to Player 2's card value
	int[] values = new int[52]; {
		for (int index = 0; index <53; index++); }
	private String name; // Clubs, Diamonds, Hearts, and Spades
	private Suit suit;
	
	// Constructor
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

	// Getters and Setters
	public int getValue() {return value;}
	public void setValue(int value) {this.value = value;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	// ---
	

	public String describe() {
		return name + ", value=" + value;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
}
