public class BonusSwitch {

	public char[] employeeLetters;
	public int[] resultBonuses;
	public int i = 0;
	public char letter;
	public int size;

	public void bonus() {
		size = employeeLetters.length;
		int bonuses[] = new int[size];

		do{
			letter = employeeLetters[i];

			switch(letter){
				case 'A':
				bonuses[i] = 5000;
				break;
				case 'B':
				bonuses[i] = 2500;
				break;
				case 'C':
				bonuses[i] = 1000;
				break;
				case 'D':
				bonuses[i] = 500;
				break;
				case 'F':
				bonuses[i] = 0;
				break;
				
			}
			i++;

		}while(i < employeeLetters.length);
		// Code for the test runner, do not change
		resultBonuses = bonuses;
	}
}
