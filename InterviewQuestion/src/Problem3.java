public class Problem3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // declare coin
        boolean[] coin;
        // allocates coin
        coin = new boolean[100];
        // Init the coin
        for (int i = 0; i < 100; ++i) {
            coin[i] = false;
        }
        // logic
        int counter = 1;
        for (int i = 0; i < 100; ++i) {
            // the first student - Open very coin
            if (i == 0) {
                for (int j = i; j < 100; ++j) {
                    coin[j] = true;
                }
                counter++;
                continue;
            }
            // the second student - Begin with the coin 2 and close every other coin
            if (i == 1) {
                for (int j = i; j < 100; ++j) {
                    coin[j] = false;
                }
                counter++;
                continue;
            }
            // Logic for normal
            //System.out.print((i + 1) + " : ");
            for (int j = i; j < 100; ++j) {
                if (j % counter == i) {
                    //System.out.print((j + 1) + " ");
                    if (coin[j] == true) {
                        coin[j] = false;
                    } else {
                        coin[j] = true;
                    }
                }
            }
            //System.out.println("");
            counter++;
        }

        for (int i = 0; i < 100; ++i) {
            if (coin[i] == true) {
            	
//            	Number of Heads - 
                System.out.println("coin " + (i + 1) + " is Head");
            }
        }

    }

}
 