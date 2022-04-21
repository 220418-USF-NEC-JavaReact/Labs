public class TicTacToe {
	public char resultArr[][];

	// Write the code for the lab in the method below
	public void playTicTacToe() {
		char[][] tictactoe = new char[3][3];
		for(int a = 0; a < 3; a++){
			for(int b =0; b < 3; b++){
				tictactoe[a][b] = '_';
			}
		} 
		tictactoe[1][1] = 'x';
		tictactoe[1][0] ='0';
		tictactoe[0][2] ='x';
		tictactoe[2][0] ='0';
		tictactoe[0][0] ='x';
		tictactoe[2][1] ='0';
		tictactoe[0][1] ='x';

		// Code for the test runner, do not change
		this.resultArr = tictactoe;
	}
}
