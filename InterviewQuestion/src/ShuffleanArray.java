import java.util.Random;

public class ShuffleanArray {
	
	
	private static int[] shuffleArray(int[] array) {
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 70, 50, 30, 10, 20, 40, 60 };
		
		System.out.println(shuffleArray(arr));
		
	}

}
