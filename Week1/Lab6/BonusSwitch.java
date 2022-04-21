public class BonusSwitch {
	
	public char[] employeeLetters;
	public int[] resultBonuses;



	public void bonus() {
		 int[] bonuses = new int[employeeLetters.length];

		 int counter = 0;
		 do{
			 switch(employeeLetters[counter]){
				case 'A':
				 bonuses[counter] = 5000;
				 	break;
				case 'B':
				bonuses[counter] = 2500;
					break;
				case 'C':
				bonuses[counter] = 1000;
					break;
				case 'D':
				bonuses[counter] = 500;
					break;
				case 'F':
				bonuses[counter] = 0;

			 }
			 counter++;
			 	
		 } while(counter< employeeLetters.length);


		// Code for the test runner, do not change
		resultBonuses = bonuses;
	}
}
