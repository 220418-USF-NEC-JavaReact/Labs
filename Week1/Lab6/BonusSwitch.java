public class BonusSwitch {

	public char[] employeeLetters;
	public int[] resultBonuses;

	public void bonus() {

		int[] bonuses = new int[employeeLetters.length];
		int lengthCounter = 0;
		do{
			switch(employeeLetters[lengthCounter]){
				case 'A':
					bonuses[lengthCounter] = 5000;
					break;
				case 'B':
					bonuses[lengthCounter] = 2500;
					break;
				case 'C':
					bonuses[lengthCounter] = 1000;
					break;
				case 'D':
					bonuses[lengthCounter] = 500;
					break;
				case 'F':
					bonuses[lengthCounter] = 0;
					break;
				default:
					break;
			}
			lengthCounter++;
		}while(lengthCounter < employeeLetters.length); 
		// Code for the test runner, do not change
		resultBonuses = bonuses;
	}
}
