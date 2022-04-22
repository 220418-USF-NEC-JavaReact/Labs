public class CountingNumbers {

	int evenResult;
	int oddResult;

	// Write the code for this lab in the method below
	public void countNumbers() {

		int[] numbers = new int[100];

		for(int i = 0; i < numbers.length; i++){
			numbers[i] = i+1;
		}

		int evenSum = 0;
		int oddSum = 0;

		int i = 0;

		while(i < numbers.length){
			if((numbers[i] %2) == 0){
				evenSum = evenSum + numbers[i];
				i++;
			}
			else{
				oddSum = oddSum + numbers[i];
				i++;
			}
		}

		// Code for test runner, do not change
		evenResult = evenSum;
		oddResult = oddSum;
	}
}
