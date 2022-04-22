public class TicTacToe {
	public char resultArr[][];

	// Write the code for the lab in the method below
	public void playTicTacToe() {

		char[][] tictactoe = { {'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

		//Player x chooses the center
		tictactoe[1][1] = 'X';

		//Player o chooses middle row left column
		tictactoe[1][0] = 'O';

		//Player X plays in the top row right column
		tictactoe[0][2] = 'X';
		
		//Player O plays in the bottom row left column
		tictactoe[2][0] = 'O';
	  	
		//Player X plays in the top row left column
		tictactoe[0][0] = 'X';
	  	
		//Player O plays in the bottom row middle column
		tictactoe[2][1] = 'O';
	   	
		//Player X plays in the top row middle column and WINS
		tictactoe[0][1] = 'X';


		// Code for the test runner, do not change
		this.resultArr = tictactoe;
	}
}
