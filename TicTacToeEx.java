/*
* Created by: Michael balcerzak
* Created on: 7-Nov-2016
* Created for: ICS3U
* Daily Assignment – Unit#3-06
* This program runs the tic tac toe game
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeEx {
		
	static String newline = System.getProperty("line.separator");
	static Scanner input = new Scanner(System.in);
		
	static int playerSpot;
	static int computerSpot;
		
	public static char[] Computer(int counter, char[] board) {
		char letter;

		if((counter%2)==0) {
			letter = 'O';
		} else {
			letter = 'X';
		}

		//base case
		if (board[0] == 'X' && board[1] == 'X' && board[2] == 'X' && board[3] == 'X' && board[4] == 'X' && board[5] == 'X' && board[6] == 'X' && board[7] == 'X' && board[8] == 'X') {
			return board;
		} else if (board[0] == letter && board[1] == letter) {
			board[2] = letter;	
			return board;
		} else if (board[1] == letter && board[2] == letter) {
			board[0] = letter;	
			return board;
		} else if (board[3] == letter && board[4] == letter) {
			board[5] = letter;	
			return board;
		} else if (board[4] == letter && board[5] == letter) {
			board[3] = letter;	
			return board;
		} else if (board[6] == letter && board[7] == letter) {
			board[8] = letter;	
			return board;
		} else if (board[7] == letter && board[8] == letter) {
			board[6] = letter;	
			return board;
		} else if (board[0] == letter && board[3] == letter) {
			board[6] = letter;	
			return board;
		} else if (board[6] == letter && board[3] == letter) {
			board[0] = letter;
			return board;
		} else if (board[1] == letter && board[4] == 'X') {
			board[7] = letter;	
			return board;
		} else if (board[7] == letter && board[4] == letter) {
			board[1] = letter;	
			return board;
		} else if (board[2] == letter && board[5] == 'X') {
			board[8] = letter;	
			return board;
		} else if (board[8] == letter && board[5] == letter) {
			board[2] = letter;	
			return board;
		} else if (board[0] == letter && board[4] == 'X') {
			board[8] = letter;	
			return board;
		} else if (board[8] == letter && board[4] == letter) {
			board[0] = letter;	
			return board;
		} else if (board[2] == letter && board[4] == 'X') {
			board[6] = letter;	
			return board;
		} else if (board[6] == letter && board[4] == letter) {
			board[2] = letter;	
			return board;
		}		
		
		for (int counter2 = 0; counter2 < board.length; counter2++){ 			
			board[counter2] = letter;
			board = Computer(counter, board);			
		}
		return board;
		
	}
	
	public static void Game(boolean stopGame, char[] board){
			
		System.out.println("which spot you want to put an X on");
		playerSpot = input.nextInt();
		while (board[playerSpot - 1] == 'O') {
			System.out.println("this spot has been already selected. Try another spot");
			playerSpot = input.nextInt();
		}
		board[playerSpot - 1] = 'X';
	
		System.out.println(" ||1 " + board[0] + " ||2 " + board[1] + " ||3 " + board[2] + newline + " ||4 " + board[3] + " ||5 " + board[4] + " ||6 " + board[5] + newline + " ||7 " + board[6] + " ||8 " + board[7] + " ||9 " + board[8]);

		if ((board[0] == 'X' && board[1] == 'X' && board[2] == 'X') || (board[3] == 'X' && board[4] == 'X' && board[5] == 'X') || (board[6] == 'X' && board[7] == 'X' && board[8] == 'X') || (board[0] == 'X' && board[3] == 'X' && board[6] == 'X') || (board[1] == 'X' && board[4] == 'X' && board[7] == 'X') || (board[2] == 'X' && board[5] == 'X' && board[8] == 'X') || (board[0] == 'X' && board[4] == 'X' && board[8] == 'X')|| (board[2] == 'X' && board[4] == 'X' && board[6] == 'X')) {
			System.out.println("player1 won");
			stopGame = false;
		} 
		
		
		if (stopGame == true) {			
			int counter2 = 2;
			
			board = Computer(counter2, board);

			System.out.println(" ||1 " + board[0] + " ||2 " + board[1] + " ||3 " + board[2] + newline + " ||4 " + board[3] + " ||5 " + board[4] + " ||6 " + board[5] + newline + " ||7 " + board[6] + " ||8 " + board[7] + " ||9 " + board[8]);
	
			if ((board[0] == 'O' && board[1] == 'O' && board[2] == 'O') || (board[3] == 'O' && board[4] == 'O' && board[5] == 'O') || (board[6] == 'O' && board[7] == 'O' && board[8] == 'O') || (board[0] == 'O' && board[3] == 'O' && board[6] == 'O') || (board[1] == 'O' && board[4] == 'O' && board[7] == 'O') || (board[2] == 'O' && board[5] == 'O' && board[8] == 'O') || (board[0] == 'O' && board[4] == 'O' && board[8] == 'O')|| (board[2] == 'O' && board[4] == 'O' && board[6] == 'O')) {
				System.out.println("player2 won");
				stopGame = false;
			}
			
			if (stopGame == true){
				Game(stopGame, board);
			}
		}
	}
	
	public static void main(String[] args) {
		char[] board = new char[] {' ', ' ', ' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' '};
		boolean stopGame = true;
		
		System.out.println(" ||1 " + board[0] + " ||2 " + board[1] + " ||3 " + board[2] + newline + " ||4 " + board[3] + " ||5 " + board[4] + " ||6 " + board[5] + newline + " ||7 " + board[6] + " ||8 " + board[7] + " ||9 " + board[8]);
		
		Game(stopGame, board);
	}
}	

