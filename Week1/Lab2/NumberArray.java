public class NumberArray{

	public int result;
	public int[] resultArr;
	
	//Place the code for the lab inside of the method below
	public void numberArray(){

		//Create int array of first 5 fib nums
		int fib[] = {0,1,1,2,3};

		//New integer to store 4th digit of fib
		int fourthDigit = fib[3];

		//Code for the test runner, do not change
		result = fourthDigit;
		resultArr = fib;
	}
}
