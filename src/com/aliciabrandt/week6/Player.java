package com.aliciabrandt.week6;

import java.util.ArrayList;
import java.util.List;

public class Player {
//	// Field: score (set to 0 in the constructor)
//	// Field: name
//	// Method: describe (prints out info about the 
//	//		player and calls the describe method for 
//	//		each card in the Hand list)
//	// Method: flip (removes & returns the top card of the hand)
//	// Method: draw (takes a Deck as an argument and 
//	//		calls the draw method on the deck, adding 
//	//		the returned card to the hand field)
//	// Method: incrementScore (adds 1 to the player's score field)
//	
	String hand; // needs to be a list
	int score;
	String name;

	ArrayList<Card> Hand = new ArrayList<>(52);
	// default array list size is 10, max hand size is 52
	// cardsAsList.add("two of hearts");

	public void flip() {
	}

	public void draw() {
	}

	public void incrementScore() {
	}
}
