public class CountingNumbers {

	int evenResult;
	int oddResult;

	// Write the code for this lab in the method below
	public void countNumbers() {

		int[] numbers = new int[100];
		for(int i = 1; i < 101; i++) {
			numbers[i-1] = i;
		}
		int evenSum = 0;
		int oddSum = 0;

		int ind = 0;
		while(ind < 100) {
			int num = numbers[ind];
			if(num % 2 == 1) { 	// is Odd
				oddSum += num;
			} else {			// is Even
				evenSum += num;
			}
			ind++;
		}
		
		// Code for test runner, do not change
		evenResult = evenSum;
		oddResult = oddSum;
	}
}
