public class CountingNumbers {

	int evenResult;
	int oddResult;

	// Write the code for this lab in the method below
	public void countNumbers() {
		int[] numbers = new int[100];
		int evenSum = 0;
		int oddSum = 0;
		int counter = 0;

		for(int i =0; i<100; i++) {
			numbers[i] = i+1;
		}

		while (counter < numbers.length ) {
			if(numbers[counter] % 2 == 0) {
				evenSum = numbers[counter] + evenSum;
			} else {
				oddSum = numbers[counter] + oddSum;
			}
			counter++;
		}

		// Code for test runner, do not change
		evenResult = evenSum;
		oddResult = oddSum;
	}
}
