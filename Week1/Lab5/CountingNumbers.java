public class CountingNumbers {

	int evenResult;
	int oddResult;

	//two new integer variables
	int evenSum, oddSum;

	// int array with 100 indexes
	int[] numbers = new int[100];

	CountingNumbers(){
		// fill the numbers array with the numbers 1 to 100
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = i;
		}
		evenSum = 0;
		oddSum = 0;
	}

	// Write the code for this lab in the method below
	public void countNumbers() {

		// if the number in the array is even add it to the evenSum variable
		// or to the odd sum if it is odd
		int i = 0;
		while (i < numbers.length) {
			if(numbers[i] % 2 == 0) { evenSum += numbers[i]; }
			else { oddSum += numbers[i]; }
				i++;
        }

		// Code for test runner, do not change
		evenResult = evenSum;
		oddResult = oddSum;
	}

	public static void main(String args[]){
		CountingNumbers count = new CountingNumbers();
		count.countNumbers();
		System.out.println("Even Result: " + count.evenResult);
		System.out.println("Odd Result: " + count.oddResult);
	}
}
