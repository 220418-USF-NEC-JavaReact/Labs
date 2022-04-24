public class BonusSwitch {

	public char[] employeeLetters;
	public int[] resultBonuses;

	public void bonus() {
		int[] bonuses = new int[employeeLetters.length];
		int i = 0;

		do{
			switch(employeeLetters[i]){

				case 'A':
				bonuses[i] = 5000;
				i++;
				break;

				case 'B':
				bonuses[i] = 2500;
				i++;
				break;

				case 'C':
				bonuses[i] = 1000;
				i++;
				break;

				case 'D':
				bonuses[i] = 500;
				i++;
				break;

				case 'F':
				bonuses[i] = 0;
				i++;
				break;

			}
		}while(i < employeeLetters.length);

		// Code for the test runner, do not change
		resultBonuses = bonuses;
	}
}
