public class NumberArray{

	public int result;
	public int[] resultArr;
	
	//Place the code for the lab inside of the method below
	public void numberArray(){
			int fib[] = {0, 1, 1, 2, 3};
			int fourthDigit = fib[2];
			System.out.println("third number of the fibonacci sequence " + fourthDigit);

			//Code for the test runner, do not change
			result = fourthDigit;
			resultArr = fib;
	}
}
