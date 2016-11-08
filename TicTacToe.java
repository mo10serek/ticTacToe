import java.util.Scanner;

public class TicTacToe {
	static String newline = System.getProperty("line.separator");
	static Scanner input = new Scanner(System.in);

	static char[] board = new char[] {' ', ' ', ' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' '};
	
	static int playerSpot;
	static int computerSpot;
	
	public static void main(String[] args) {
		System.out.println(" ||1 " + board[0] + " ||2 " + board[1] + " ||3 " + board[2] + newline + " ||4 " + board[3] + " ||5 " + board[4] + " ||6 "  + board[5] + newline + " ||7 " + board[6] + " ||8 " + board[7] + " ||9 " + board[8]);
		
		boolean stopGame = true;
		
		do {
			
			
			System.out.println("which spot you want to put an X on");
			playerSpot = input.nextInt();
			while (board[playerSpot - 1] == 'O') {
				System.out.println("this spot has been already selected. Try another spot");
				playerSpot = input.nextInt();
			}
			board[playerSpot - 1] = 'X';
				
			System.out.println(" ||1 " + board[0] + " ||2 " + board[1] + " ||3 " + board[2] + newline + " ||4 " + board[3] + " ||5 " + board[4] + " ||6 "  + board[5] + newline + " ||7 " + board[6] + " ||8 " + board[7] + " ||9 " + board[8]);

			if ((board[0] == 'X' && board[1] == 'X' && board[2] == 'X') || (board[3] == 'X' && board[4] == 'X' && board[5] == 'X') || (board[6] == 'X' && board[7] == 'X' && board[8] == 'X') || (board[0] == 'X' && board[3] == 'X' && board[6] == 'X') || (board[1] == 'X' && board[4] == 'X' && board[7] == 'X') || (board[2] == 'X' && board[5] == 'X' && board[8] == 'X') || (board[0] == 'X' && board[4] == 'X' && board[8] == 'X')|| (board[2] == 'X' && board[4] == 'X' && board[6] == 'X')) {
				System.out.println("computer won");
				stopGame = false;
			}
			
			System.out.println("which spot you want to put an O on");
			computerSpot = input.nextInt();
			while (board[computerSpot - 1] == 'X') {
				System.out.println("this spot has been already selected. Try another spot");
				computerSpot = input.nextInt();
			}
			board[computerSpot - 1] = 'O';
		
			System.out.println(" ||1 " + board[0] + " ||2 " + board[1] + " ||3 " + board[2] + newline + " ||4 " + board[3] + " ||5 " + board[4] + " ||6 "  + board[5] + newline + " ||7 " + board[6] + " ||8 " + board[7] + " ||9 " + board[8]);
		
			if ((board[0] == 'O' && board[1] == 'O' && board[2] == 'O') || (board[3] == 'O' && board[4] == 'O' && board[5] == 'O') || (board[6] == 'O' && board[7] == 'O' && board[8] == 'O') || (board[0] == 'O' && board[3] == 'O' && board[6] == 'O') || (board[1] == 'O' && board[4] == 'O' && board[7] == 'O') || (board[2] == 'O' && board[5] == 'O' && board[8] == 'O') || (board[0] == 'O' && board[4] == 'O' && board[8] == 'O')|| (board[2] == 'O' && board[4] == 'O' && board[6] == 'O')) {
				System.out.println("computer won");
				stopGame = false;
			}
		
		} while (stopGame == true);
	}
	 
}	   