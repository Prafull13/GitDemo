package com.java.coin.puzzle;
/*There are 1100 coins with one side as heads and other side as tails and there are 1100 people
First person goes and places all the coins to show heads 
Second person goes and places every second coin (2, 4, 6, …) to show tails
The third person goes to every third coin (3, 6, 9, ...) and, if it is heads,
then places it to show tails, and if it is tails, then places it to show Heads
The fourth person does this to every fourth coin (4, 8, 12, ...), and so on.*/

public class FlipTheFaceOfCoin {
	static int totalNumberOfPeople = 1100;

	public static void toggleFaceOfCoin(boolean[] coinOfHeadFace, int start) {
		int nextCoin = start;
		for (int i = start - 1; i < coinOfHeadFace.length; i += nextCoin) {
			coinOfHeadFace[i] = !coinOfHeadFace[i];
		}
	}

	public static void displayTotalCoinFace(boolean[] coins) {
		int coinCount = 0;
		for (int i = 0; i < coins.length; i++) {
			if (coins[i]) {
				coinCount++;

				if (coinCount % 10 == 0)
					System.out.println("");
			}
		}
		System.out.printf("The total count of coins side will be showing Heads are:: %d \n", coinCount);
	}

	public static void main(String[] args) {

		boolean[] coins = new boolean[totalNumberOfPeople];
		for (int people = 1; people <= totalNumberOfPeople; people++) {
			toggleFaceOfCoin(coins, people);
		}
		displayTotalCoinFace(coins);
	}
}