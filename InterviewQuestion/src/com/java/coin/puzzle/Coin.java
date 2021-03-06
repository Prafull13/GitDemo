package com.java.coin.puzzle;

import java.util.HashMap;

class Coin {
	private final int HEADS = 0;
	private final int TAILS = 1;

	private int face;

	
//	Array [1100]
//			
//	1.		n=10-- heads (10*n)   (HHHHHHHHHH)
//	2.      [2,4,6,8,10]-- Tails -- [5] [(10*n)/2]-[HTHTHTHTHT]
//	3. 		[3,6,9] --- (10*n/3) --[HTTTHHHTTT]
//	4.		[4,8] --- (10*n/4)--[HTTHHHHHTT]
//  5. 		[5,10] 	[HTTHTHHHTH]
//	6. 		[6]  	[HTTHTTHHTH]
//	7. 				[HTTHTTTHTH]
//	8. 				[HTTHTTTTTH]
//	9. 				[HTTHTTTTHH]
//	10. 			[HTTHTTTTHT]
	
	
	
	// HEADS = 6
//			
//			HashMap<Integer,String> hm = new HashMap<Integer,String>();
//	
//	
//	Function toggel()
//	
//	
//	
//	
//	
	public Coin() {
		flip();
	}

	// -----------------------------------------------------------------
	// Flips the coin by randomly choosing a face value.
	// -----------------------------------------------------------------
	public void flip() {
		face = (int) (Math.random() * 2);
	}

	// -----------------------------------------------------------------
	// Returns true if the current face of the coin is heads.
	// -----------------------------------------------------------------
	public boolean isHeads() {
		return (face == HEADS);
	}

	// -----------------------------------------------------------------
	// Returns the current face of the coin as a string.
	// -----------------------------------------------------------------
	public String toString() {
		String faceName;

		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";

		return faceName;
	}
}
