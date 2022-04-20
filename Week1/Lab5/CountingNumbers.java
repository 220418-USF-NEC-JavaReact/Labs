public class CountingNumbers {

	int evenResult;
	int oddResult;

	// Write the code for this lab in the method below
	public void countNumbers() {

		int[] numbers = new int[100]; 
		for (int i=0; i < 100; i++){
			numbers[i] = i+1; 
		}
		int evenSum = 0;
		int oddSum = 0;
		int numCounter = 0;
		while(numCounter < 100){
			if(numbers[numCounter] % 2 == 0){
				evenSum += numbers[numCounter];
			}else{
				oddSum += numbers[numCounter];
			}
			numCounter++;
		}
		// Code for test runner, do not change
		evenResult = evenSum;
		oddResult = oddSum;
	}
}
