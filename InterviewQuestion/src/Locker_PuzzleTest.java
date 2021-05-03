
public class Locker_PuzzleTest {

	public static void main(String[] args) {
		int NumberOfPeople = 1;
		boolean[] lockers = new boolean[NumberOfPeople];
		for (int student = 1; student <= NumberOfPeople; student++) {
			shuffle(lockers, student);
		}
		display(lockers);
	}

	public static void shuffle(boolean[] lockersOpenState, int start) {
		int nextLocker = start;
		for (int i = start - 1; i < lockersOpenState.length; i += nextLocker) {
			lockersOpenState[i] = !lockersOpenState[i];
		}
	}

	public static void display(boolean[] lockers) {
		int lockerCount = 0;
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i]) {
				System.out.printf("The open lockers are: %d \n", i + 1);
				lockerCount++;
				if (lockerCount % 10 == 0)
					System.out.println("");

			}
		}
	}
}