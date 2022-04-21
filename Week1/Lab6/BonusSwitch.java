public class BonusSwitch {

	public char[] employeeLetters;
	public int[] resultBonuses;

	public void bonus() {

		int size = employeeLetters.length;
		int[] bonuses = new int[size];
		int index = 0;

		do {
			switch (employeeLetters[index]) {
				case 'A':
					bonuses[index] = 5000;
					break;
				case 'B':
					bonuses[index] = 2500;
					break;
				case 'C':
					bonuses[index] = 1000;
					break;
				case 'D':
					bonuses[index] = 500;
					break;
				case 'F':
					bonuses[index] = 0;
					break;
			}

			index++;
		} while (index < size);

		// Code for the test runner, do not change
		resultBonuses = bonuses;
	}
}
