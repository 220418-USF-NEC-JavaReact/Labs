public class BonusSwitch {

	public char[] employeeLetters;
	public int[] resultBonuses;

	// function which returns single bonus instance
	int letterToBonus(char letterGrade){
		switch (letterGrade) {
			case 'A': return 5000;
			case 'B': return 2500;
			case 'C': return 1000;
			case 'D': return 500;
			case 'F': return 0;
			default:
					System.out.println("Invalid char entered");
					return -1;
		}
	}


	public void bonus() {
		int i = 0;
		int[] bonuses = new int[employeeLetters.length];
		do {
			bonuses[i] = letterToBonus(employeeLetters[i]);
			i++;
		}while (i<employeeLetters.length);


		// Code for the test runner, do not change
		resultBonuses = bonuses;
	}
}
