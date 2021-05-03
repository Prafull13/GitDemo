/*In a deck of playing cards there are 4 suits (club, diamond, heart, spade)
and 13 ranks (ace, deuce, three, four, five, six, seven, eight, nine, ten,
jack, queen, king). Write a program to generate a deck of cards and
hold within an appropriate data structure.
*/

package com.java.card.puzzle;

import java.util.Random;

public class PlayingCardsDeck
{
   // array of Card objects
   private PlayingCard deck[];
   // index of next Card to be dealt
   private int currentCard;
   // constant number of Cards
   private final int NUMBER_OF_CARDS = 52;
   // random number generator
   private Random randomNumbers;

   // Constructor fills deck of Cards
   public PlayingCardsDeck()
   {
      String faces[] = { "ace", "deuce", "three", "four", "five", "six", 
         "seven", "eight", "nine", "ten", "jack", "queen", "king" };
      String suits[] = { "club", "diamonds", "hearts", "spades" };

      // Create array of Card objects
      deck = new PlayingCard[ NUMBER_OF_CARDS ];
      // Set currentCard so first Card dealt is deck[ 0 ]
      currentCard = 0; 
      // Create random number generator
      randomNumbers = new Random(); 

      // Populate deck with Card objects
      for ( int count = 0; count < deck.length; count++ ) 
         deck[ count ] = 
            new PlayingCard( faces[ count % 13 ], suits[ count / 13 ] );
   } 

   // Shuffle deck of Cards with one-pass algorithm
   public void shuffle()
   {
      // After shuffling, dealing should start at deck[ 0 ] again
	  // Reinitialize currentCard
      currentCard = 0;

      // For each Card, pick another random Card and swap them
      for ( int first = 0; first < deck.length; first++ ) 
      {
         // Select a random number between 0 and 51 
         int second =  randomNumbers.nextInt( NUMBER_OF_CARDS );
         
         // Swap current Card with randomly selected Card
         PlayingCard temp = deck[ first ];        
         deck[ first ] = deck[ second ];   
         deck[ second ] = temp;            
      }
   } 

   // Deal one Card
   public PlayingCard dealCard()
   {
      // Determine whether Cards remain to be dealt
      if ( currentCard < deck.length )
    // return current Card in array
         return deck[ currentCard++ ]; 
      else        
    	// return null to indicate that all Cards were dealt
         return null;
   }
}