public class MatrixMinNUmber {
	public static void main(String[] args) {
		int abc[][] = { { 8, 5, 9 }, { 8, 6, 5 }, { 9, 5, 7 } };
		int min = abc[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
				}
			}
		}
		System.out.println(min);
	}
}
