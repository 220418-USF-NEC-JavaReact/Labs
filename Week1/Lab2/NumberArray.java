public class NumberArray{

	public int result;
	public int[] resultArr;
	
	
	//Place the code for the lab inside of the method below
	public void numberArray(){
		int[] fib = new int[5];
		fib[0] = 0;
		fib[1] = 1;
		fib[2] = 1;
		fib[3] = 2;
		fib[4] = 3;

		int fourthDigit = fib[3];

		//Code for the test runner, do not change
		result = fourthDigit;
		resultArr = fib;
	}
}
