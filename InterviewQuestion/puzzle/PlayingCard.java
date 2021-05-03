/*In a deck of playing cards there are 4 suits (club, diamond, heart, spade)
and 13 ranks (ace, deuce, three, four, five, six, seven, eight, nine, ten,
jack, queen, king). Write a program to generate a deck of cards and
hold within an appropriate data structure.
*/

package com.java.card.puzzle;

public class PlayingCard {
	private String face;
	private String suit;

	// Constructor initializes two arguments card's face and suit
	public PlayingCard(String cardFace, String cardSuit) {
		// Initialize face of card and suit of card
		face = cardFace;
		suit = cardSuit;
	}

	// Return String representation of Card
	public String toString() {
		return face + " of " + suit;
	}
}