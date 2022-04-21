public class CountingNumbers {

	int evenResult;
	int oddResult;

	// Write the code for this lab in the method below
	public void countNumbers() {
		int[] numbers = new int[100];
		for(int a = 0; a < numbers.length; a++){
			numbers[a] = a + 1;
		}
		int evenSum = 0;
		int oddSum = 0;
		int i = 0;
		while(i < numbers.length){
			if((numbers[i] % 2) == 0){
				evenSum += numbers[i];

			}
			else{
				oddSum += numbers[i];

			}
			i++;
		}

		// Code for test runner, do not change
		evenResult = evenSum;
		oddResult = oddSum;
	}
}
