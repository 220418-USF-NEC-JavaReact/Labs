public class TicTacToe {
	public char resultArr[][];

	// Write the code for the lab in the method below
	public void playTicTacToe() {

		char[][] tictactoe = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
		tictactoe[1][1] = 'X';
		tictactoe[1][0] = 'O';
		tictactoe[0][2] = 'X';
		tictactoe[2][0] = 'O';
		tictactoe[0][0] = 'X';
		tictactoe[2][1] = 'O';
		tictactoe[0][1] = 'X';

		// Code for the test runner, do not change
		this.resultArr = tictactoe;
	}
}
