public class CountingNumbers {
	int evenSum;
	int oddSum;
	int evenResult;
	int oddResult;

	// Write the code for this lab in the method below
	public void countNumbers() {

		int[] numbers = new int[100];

		for (int i=0;i<numbers.length;i++){
			numbers[i] = i + 1;
			System.out.println(numbers[i]);
		}
		int counter = 0;
		while (counter<100){
			if(numbers[counter]%2 == 0){
				evenSum += numbers[counter];


			}
			else{
				oddSum += numbers[counter];
			}
			counter++;
		}




		// Code for test runner, do not change
		evenResult = evenSum;
		oddResult = oddSum;
	}
}
