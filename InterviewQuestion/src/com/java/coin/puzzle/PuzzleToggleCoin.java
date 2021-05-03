/*There are 1100 coins with one side as heads and other side as tails and there are 1100 people
First person goes and places all the coins to show heads 
Second person goes and places every second coin (2, 4, 6, …) to show tails
The third person goes to every third coin (3, 6, 9, ...) and, if it is heads,
then places it to show tails, and if it is tails, then places it to show Heads
The fourth person does this to every fourth coin (4, 8, 12, ...), and so on.*/

package com.java.coin.puzzle;

public class PuzzleToggleCoin {

	public static int face;

	private static int coinToggleMethod(int numberOfPeople) {
		int total = 0;
		int head = 1;
		int tail = 0;

		int coin_array = numberOfPeople + head;

		// array is used for the all Number of coins
		int coins[] = new int[coin_array];
		
		// For loop that Switched Heads all of the coins to begin
		for (int i = 0; i < numberOfPeople; i++) {
			// In this particular case we are dealing with 1100 coins and 1100 people
			coins[i] = 0;
		}
		// loop that simulates people appear for changing the face of coins
		for (int people = 1; people < numberOfPeople; people++) {

			// Nested for loop that each people switching face
			for (int coinNum = 0; coinNum < numberOfPeople; coinNum = coinNum + people) {

				// Sets the beginning coin number to the people that has change face of coin.
				if (coinNum == 0) {
					coinNum = people;
				}
				// for non special case after people 1 and 2. They will change the face to head
				// or tail.
				if (people >= 3) {
					// The people checks to see if the face is head, if it is they toggle to
					if (coins[coinNum] == tail)
					// tail it. If its tail they toggle to head it.
					{
						face = head;
					} else {
						face = tail;
					}
				}
				// special case for people 2
				if (people == 2) {
					face = tail;
				}
				// special case for people 1
				if (people == 1) {
					face = head;
				}
				// sets the head of the coin
				coins[coinNum] = face;
			}
		}
		// Loop for counting head coins in your coins array
		for (int i = 1; i < numberOfPeople; i++) {
			total = total + coins[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		int total = coinToggleMethod(1100);
		System.out.println("Total Head coins: " + total);
	}
}
