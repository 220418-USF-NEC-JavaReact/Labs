public class BonusSwitch {

	public char[] employeeLetters;
	public int[] resultBonuses;

	public void bonus() {
		int[] bonuses = new int[employeeLetters.length];
		int k = 0;
		do {
			switch(employeeLetters[k]) {
				case 'A':
				bonuses[k] = 5000;
				break;
				case 'B':
				bonuses[k] = 2500;
				break;
				case 'C':
				bonuses[k] = 1000;
				break;
				case 'D':
				bonuses[k] = 500;
				break;
				case 'F':
				bonuses[k] = 0;
				break;
				default:
			}
			k++;
		}
		while(k < bonuses.length);

		// Code for the test runner, do not change
		resultBonuses = bonuses;
	}
}
