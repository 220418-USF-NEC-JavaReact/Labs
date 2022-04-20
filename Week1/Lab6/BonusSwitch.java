public class BonusSwitch {

	public char[] employeeLetters;
	public int[] resultBonuses;

	public void bonus() {
		int[] bonuses = new int[employeeLetters.length];
		int a = 0;
		do{
			switch(employeeLetters[a]){
			case 'A':
				bonuses[a] = 5000;
				break;
			case 'B':
				bonuses[a] = 2500;
				break;
			case 'C':
				bonuses[a] = 1000;
				break;
			case 'D':
				bonuses[a] = 500;
				break;
			case 'F':
				bonuses[a] = 0;
				break;
			default :
			}
			a++;
		}while(a < bonuses.length);
		// Code for the test runner, do not change
		resultBonuses = bonuses;
	}
}
