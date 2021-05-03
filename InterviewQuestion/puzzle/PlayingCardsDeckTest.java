/*In a deck of playing cards there are 4 suits (club, diamond, heart, spade)
and 13 ranks (ace, deuce, three, four, five, six, seven, eight, nine, ten,
jack, queen, king). Write a program to generate a deck of cards and
hold within an appropriate data structure.*/
package com.java.card.puzzle;


public class PlayingCardsDeckTest
{
   // execute application
   public static void main( String args[] )
   {
	  PlayingCard C;
      PlayingCardsDeck myDeckOfCards = new PlayingCardsDeck();
      myDeckOfCards.shuffle();
      

      // place Cards in random order
      
		/*
		 * // print all 52 Cards in the order in which they are dealt for ( int i = 0; i
		 * < 13; i++ ) { // deal and print 4 Cards System.out.printf(
		 * "%-20s%-20s%-20s%-20s\n", myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
		 * myDeckOfCards.dealCard(), myDeckOfCards.dealCard() ); } // end for
		 *  */  
      
		
		myDeckOfCards.shuffle();
		C = myDeckOfCards.dealCard();
		System.out.println( C.toString() );
      
      } 
} 