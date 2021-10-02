package com.aliciabrandt.week6;

public enum Suit {
	DIAMOND, CLUB, SPADE, HEART,
	
//	private final enum suit;

//	Suit(int suit) {
//		this.suit = suit;
//	}

	public String describe() {
		StringBuilder output = new StringBuilder();
		if (getSuit() == Suit.HEART) {
			output.append("♥");
		} else if (getSuit() == Suit.CLUB) {
			output.append("♣");
		} else if (getSuit() == Suit.SPADE) {
			output.append("♠");
		} else if (getSuit() == Suit.DIAMOND) {
			output.append("♦");
		}

	}

	Suit getSuit() {
		// TODO Auto-generated method stub
		return null;
	}
}
