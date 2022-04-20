public class CountingNumbers {

	int evenResult;
	int oddResult;

	// Write the code for this lab in the method below
	public void countNumbers() {


		int numbers[] = new int[100];

		//fill numbers array with ints 1-100
		for(int i=0; i<100; i++){
			numbers[i] = i+1;
		}

		//two new integer variables
		int evenSum = 0;
		int oddSum = 0;


		int i = 0;
		while(i <= 100){
			if(i  % 2 == 0){
				evenSum++;
			}
			else{
				oddSum++;
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
