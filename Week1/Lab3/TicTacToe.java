// import scanner class
import java.util.Scanner;
import java.util.*;

public class TicTacToe {
	public char resultArr[][];
	// 2d array
	public char[][] tictactoe = new char[3][3];

	// intialize tictactoe with underscores
	TicTacToe(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				tictactoe[i][j] = '_';
			}
		}
	}

	// Write the code for the lab in the method below
	public void playTicTacToe() {
		// show board
		for (int n = 0 ; n < tictactoe.length ; n++)
        {
            System.out.println(Arrays.toString(tictactoe[n])); 
        }

		// create scanner object
		Scanner player = new Scanner(System.in);

		// accept player input
		System.out.println("Player X: ");
		tictactoe[1][1] = player.nextLine().charAt(0);

		// show board
		for (int n = 0 ; n < tictactoe.length ; n++)
        {
            System.out.println(Arrays.toString(tictactoe[n])); 
        }

		// accept player input
		System.out.println("Player O: ");
		tictactoe[1][0] = player.nextLine().charAt(0);

		// show board
		for (int n = 0 ; n < tictactoe.length ; n++)
        {
            System.out.println(Arrays.toString(tictactoe[n])); 
        }

		// accept player input
		System.out.println("Player X: ");
		tictactoe[0][2] = player.nextLine().charAt(0);

		// show board
		for (int n = 0 ; n < tictactoe.length ; n++)
        {
            System.out.println(Arrays.toString(tictactoe[n])); 
        }

		// accept player input
		System.out.println("Player O: ");
		tictactoe[2][0] = player.nextLine().charAt(0);

		// show board
		for (int n = 0 ; n < tictactoe.length ; n++)
        {
            System.out.println(Arrays.toString(tictactoe[n])); 
        }

		// accept player input
		System.out.println("Player X: ");
		tictactoe[0][0] = player.nextLine().charAt(0);

		// show board
		for (int n = 0 ; n < tictactoe.length ; n++)
        {
            System.out.println(Arrays.toString(tictactoe[n])); 
        }

		// accept player input
		System.out.println("Player O: ");
		tictactoe[2][1] = player.nextLine().charAt(0);

		// show board
		for (int n = 0 ; n < tictactoe.length ; n++)
        {
            System.out.println(Arrays.toString(tictactoe[n])); 
        }

		// accept player input
		System.out.println("Player X: ");
		tictactoe[0][1] = player.nextLine().charAt(0);

		// show board
		for (int n = 0 ; n < tictactoe.length ; n++)
        {
            System.out.println(Arrays.toString(tictactoe[n])); 
        }

        // display te winner
		System.out.println("Player X WINS");

		// Code for the test runner, do not change
		this.resultArr = tictactoe;
	}
}
