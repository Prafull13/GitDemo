
public class GCDExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static int findGCD(int number1, int number2) { 
		if(number2 == 0){ 
			return number1; 
		} 
	return findGCD(number2, number1%number2); 
	}
}
