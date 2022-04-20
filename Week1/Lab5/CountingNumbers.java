public class CountingNumbers {

	int evenResult;
	int oddResult;

	// Write the code for this lab in the method below
	public void countNumbers() {

		int[] numbers = new int[100];

		for(int num = 1; num < 101; num++){
			numbers[num-1] = num;
		}

		int evenSum = 0;
		int oddSum = 0;
		int index = 0;

		while(index < 100){
			if(numbers[index] % 2 == 0){
				evenSum += numbers[index];
			}
			else{
				oddSum += numbers[index];
			}
			index++;			
		}

		// Code for test runner, do not change
		evenResult = evenSum;
		oddResult = oddSum;
	}
}
