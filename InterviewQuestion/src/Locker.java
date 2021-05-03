public class Locker {
    public static void main(String[] args) {
        boolean[] coins = new boolean[11];
        //Open all multiples of 1 before moving on to 2
        for (int i = 1; i < coins.length; i++) {
        	coins[i] = true;
        }


        //open every locker for every multiple of i
        for (int i = 2; i <= 10; i++) {
            for (int j = 1; i * j <= 10; j++) {
            	coins[i * j] = (coins[i * j] == true) ? false : true;
            }
        }

        //Display the indices of the open lockers
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == true)
                System.out.println("Coins " + i + " is Head.");
        }
    }
}