public class TicTacToe {
	public char resultArr[][];

	// Write the code for the lab in the method below
	public void playTicTacToe() {
		char tictactoe[][] = { { '_', '_', '_' },
				{ '_', '_', '_' },
				{ '_', '_', '_' } };

		int row, col;

		// Player X plays in the exact middle spot
		row = 1;
		col = 1;
		tictactoe[row][col] = 'X';

		// Player O plays in the middle row left column
		row = 1;
		col = 0;
		tictactoe[row][col] = 'O';

		// Player X plays in the top row right column
		row = 0;
		col = 2;
		tictactoe[row][col] = 'X';

		// Player O plays in the bottom row left column
		row = 2;
		col = 0;
		tictactoe[row][col] = 'O';

		// Player X plays in the top row left column
		row = 0;
		col = 0;
		tictactoe[row][col] = 'X';

		// Player O plays in the bottom row middle column
		row = 2;
		col = 1;
		tictactoe[row][col] = 'O';

		// Player X plays in the top row middle column and WINS
		row = 0;
		col = 1;
		tictactoe[row][col] = 'X';

		// Code for the test runner, do not change
		this.resultArr = tictactoe;
	}
}