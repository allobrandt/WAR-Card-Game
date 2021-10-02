package com.aliciabrandt.week6;

import java.util.*;

public class Deck {
	//playDeck = buildDeck(); // constructor
	//public ArrayList buildDeck() {
	//	Array newDeck[52]
	//		suitList [Diamonds, Hearts, Clubs, Spades]
	//			for each suit
	//				for (i=2; i<=14; i++);
						
	//}
	
	List<Card> Cards = new ArrayList<>(52);

	private List<?> playDeck;
	
// Arrays from Jeff
	private static final String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
	private static final String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
	public static String[] getSuits() {
		return suits;
	}
	public static String[] getNames() {
		return names;
	}
	
	
	//for (outer - enhanced: String suit : suits) //cycle through the suits
		//for (inner - Traditional for loop) //cycle through names
		// for (int i = 0; i < names.length; i++)
				//Pass in the cardName and the cardValue into a Card Object
				// String name = name[i] + " of " + suit
				// int cardValue = i + 2;
				//Card card = new Card(cardValue, cardName);
				//cards.add(card);
			// suits = Clubs names = Two 1st time through the loop
			
	
	public void shuffle() {	
		Collections.shuffle(this.playDeck);
	}
	public void draw() { }
	
		
}
