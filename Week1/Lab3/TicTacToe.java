import org.w3c.dom.ls.LSException;

public class TicTacToe {
	public char resultArr[][];

	// Initialize 3x3 board
	private char[][] initialize (char[][] newBoard) {
		//initialize row to _
		for(int i = 0; i<=2; i++) {
			//initialize column to _
			for(int j = 0; j<=2; j++) {
				newBoard[i][j] = '_';
			}
		}

		return newBoard;
	}

	//is the space to be overwirtten occupied?
	private Boolean isOccupied (char[][] playBoard, int coordinates) {

		switch (coordinates) {
			case 11 :
				if (playBoard[0][0] == '_') {
					return false;
				}
			case 12 :
				if (playBoard[0][1]  == '_') {
					return false;
				}
			case 13 :
				if (playBoard[0][2] == '_') {
					return false;
				}
			case 21 :
				if (playBoard[1][0] == '_') {
					return false;
				}
			case 22 :
				if (playBoard[1][1] == '_') {
					return false;
				}
			case 23 :
				if (playBoard[1][2] == '_') {
					return false;
				}
			case 31 :
				if (playBoard[2][0] == '_') {
					return false;
				}
			case 32 :
				if (playBoard[2][1] == '_') {
					return false;
				}
			case 33 :
				if (playBoard[2][2] == '_') {
					return false;
				}
			default :
			//Throw exception in the future
			return true;
		}
	}

	//place player symbol on the board
	private char[][] replaceSpace (char[][] playBoard, char piece, int coordinates) {
		if (!isOccupied(playBoard, coordinates)) {
			switch (coordinates) {
				case 11 :
					playBoard[0][0] = piece;
					break;
				case 12 :
					playBoard[0][1] = piece;
					break;
				case 13 :
					playBoard[0][2] = piece;
					break;
				case 21 :
					playBoard[1][0] = piece;
					break;
				case 22 :
					playBoard[1][1] = piece;
					break;
				case 23 :
					playBoard[1][2] = piece;
					break;
				case 31 :
					playBoard[2][0] = piece;
					break;
				case 32 :
					playBoard[2][1] = piece;
					break;
				case 33 :
					playBoard[2][2] = piece;
					break;
				default : //No changes to the board
				return playBoard;
			}
		}
		return playBoard;
	}

	// Write the code for the lab in the method below
	public void playTicTacToe() {
		Boolean temp;

		char[][] tictactoe = new char[3][3];

		tictactoe = initialize(tictactoe);

		tictactoe = replaceSpace(tictactoe, 'X', 22);
		//isWin(tictactoe, x)	?
		tictactoe = replaceSpace(tictactoe, 'O', 21);
		//isWin(tictactoe, y) 	?
		tictactoe = replaceSpace(tictactoe, 'X', 13);
		tictactoe = replaceSpace(tictactoe, 'O', 31);
		tictactoe = replaceSpace(tictactoe, 'X', 11);
		tictactoe = replaceSpace(tictactoe, 'O', 32);
		tictactoe = replaceSpace(tictactoe, 'X', 12);
		

		// Code for the test runner, do not change
		this.resultArr = tictactoe;
	}
}
