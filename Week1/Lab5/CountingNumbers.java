public class CountingNumbers {

	int evenResult;
	int oddResult;

	// Write the code for this lab in the method below
	public void countNumbers() {

		int[] numbers = new int[100];

		for (int a = 0; a < numbers.length; a++) {
			numbers[a] = a + 1;
		}

		int evenSum = 0;
		int oddSum = 0;
		int breakNum = 0;

		while (breakNum < numbers.length) {

			if(numbers[breakNum] % 2 == 0){
				evenSum += numbers[breakNum];
			} else {
				oddSum += numbers[breakNum];
			}
			breakNum++;
		}

		// Code for test runner, do not change
		evenResult = evenSum;
		oddResult = oddSum;
	}
}
