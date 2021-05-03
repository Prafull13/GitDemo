public class FibonacciNumbers {
	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}
	public static void printFibonacciSeries(int n) {
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}
	}
	public static void main(String args[]) {
		int n = 4;
		System.out.println(fibonacci(n));
		System.out.println(factorial(n));
	}
}