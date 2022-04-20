public class BonusSwitch {

	public char[] employeeLetters;
	public int[] resultBonuses;

	public void bonus() {

		int[] bonuses = new int[employeeLetters.length];

		int numbers = 0;
		do {
			switch(employeeLetters[numbers]) {
				case 'A':
					bonuses[numbers] = 5000;
					break;

				case 'B':
					bonuses[numbers] = 2500;
					break;

				case 'C':
					bonuses[numbers] = 1000;
					break;

				case 'D':
					bonuses[numbers] = 500;
					break;

				case 'F':
					bonuses[numbers] = 0;
					break;
			}

			numbers++;
		} while(numbers < employeeLetters.length);

		// Code for the test runner, do not change
		resultBonuses = bonuses;
	}
}
