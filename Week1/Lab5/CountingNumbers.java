public class CountingNumbers {

	int evenResult;
	int oddResult;

	// Write the code for this lab in the method below
	public void countNumbers() {
		int[] numbers = new int[100];
		int evenSum = 0;
		int oddSum = 0;
		int count = 0;

		for (int i = 0; i<numbers.length; i++) {
			numbers[i] = i + 1;
		}

		while (count < numbers.length) {
			int number = numbers[count];
			
			if (number % 2 == 0) {
				evenSum += number;
			} else {
				oddSum += number;
			}

			count++;
		}

		// Code for test runner, do not change
		evenResult = evenSum;
		oddResult = oddSum;
	}
}
