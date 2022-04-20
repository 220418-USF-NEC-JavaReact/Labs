public class CountingNumbers {

	int evenResult;
	int oddResult;

	// Write the code for this lab in the method below
	public void countNumbers() {
		//Initialize numbers array
		int numbers[] = new int[100];

		//fill numbers array with ints 1-100
		for(int i=0; i<numbers.length; i++){
			numbers[i] = i+1;
		}

		//initialize evensum, oddsum
		int evenSum = 0;
		int oddSum = 0;

		//while loop through array, tally even/odd sums
		int i = 0;
		while(i < numbers.length){
			if((numbers[i] % 2) == 0){
				evenSum += numbers[i];
				//System.out.println("Even added. numbers[i] = " + numbers[i]);
			}
			else if((numbers[i] % 2) == 1){
				oddSum += numbers[i];
				//System.out.println("Odd added. numbers[i] = " + numbers[i]);
			}
			else{
				System.out.println("modulus operator error: i = " + i);
				System.out.println("numbers[i] = " + Integer.toString(numbers[i]));
				System.out.println("numbers[i] % 2 = " + Integer.toString(numbers[i] % 2));
				break;
			}
			i++;
		}

		System.out.println("evenSum = " + evenSum);
		System.out.println("oddSum = " + oddSum);

		// Code for test runner, do not change
		evenResult = evenSum;
		oddResult = oddSum;
	}
}
