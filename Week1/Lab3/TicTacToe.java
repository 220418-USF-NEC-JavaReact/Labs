public class TicTacToe {
	public char resultArr[][];

	// Write the code for the lab in the method below
	public void playTicTacToe() {

		char[][] tictactoe = new char[3][3];

		tictactoe[0][0] = 'X';
		tictactoe[0][1] = 'X';
		tictactoe[0][2] = 'X';
		tictactoe[1][0] = 'O';
		tictactoe[1][1] = 'X';
		tictactoe[1][2] = '_';
		tictactoe[2][0] = 'O';
		tictactoe[2][1] = 'O';
		tictactoe[2][2] = '_';

		// Code for the test runner, do not change
		this.resultArr = tictactoe;
	}
}
