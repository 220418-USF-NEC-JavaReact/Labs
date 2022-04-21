import java.io.*;
import java.util.*;

public class BonusSwitch {

	public char[] employeeLetters = {'A','B','C','D','F'};
	public int[] resultBonuses = new int[employeeLetters.length];

	// an integer array called bonuses the same size as the given character array
	// use the length property of the array object to find the size
	public int[] bonuses = new int[employeeLetters.length];
	
	public void bonus() {

		// loop through the given char array - employeeLetters
		int i = 0; // counter
		do {
			// switch on characters given from an index of the character array and
			// fill in bonuses array inside of the switch statement
			switch(employeeLetters[i]){
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
				case 'E':
				    bonuses[i] = 0;
					break;
			}
			i++;
		} while(i < employeeLetters.length);

		// Code for the test runner, do not change
		resultBonuses = bonuses;
	}

	public static void main(String args[]){
		BonusSwitch bonus = new BonusSwitch();
		bonus.bonus();
		System.out.println(Arrays.toString(bonus.resultBonuses));
	}
}
