public class CountingNumbers {

	int evenResult;
	int oddResult;
	int count =0 ;

	// Write the code for this lab in the method below
	public void countNumbers() {
	int numbers[] = new int[100];
	for(int i = 0; i<100; i++){
		numbers[i] = i + 1;

	}

	int evenSum = 0;
	int oddSum = 0;
	while(count < 100){
		if(numbers[count] % 2 == 0){
			evenSum = evenSum + numbers[count];
		} else {
			oddSum = oddSum + numbers[count];
		}
		count++;
	}
		// Code for test runner, do not change
		evenResult = evenSum;
		oddResult = oddSum;
	}
}
