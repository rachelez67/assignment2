package assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class BonusProblem {
	static int WIN = 4;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();							// m = rows 
		int n = scan.nextInt();							// n = columns
		int userBoard[][] = new int[m][n];
		//int playerMove = scan.nextInt();
		
		/* Calling Methods */
	printBoard(userBoard);
	}
	
	/* Create Board */
	public static int[][] printBoard(int[][] finalBoard){
		for (int i = 0; i < finalBoard.length; i++) {
			for (int j = 0; j < finalBoard[i].length; j++) {
				System.out.print(finalBoard[i][j]+ " ");
			}
			System.out.println();
		}
		return finalBoard;
	}	

	public static int playerTurn(int[][]matrixBoard, int player, int gameRows, int playerMove) {
		boolean moved = false;
		gameRows -= 1;
				
		while (moved == false){
			if (matrixBoard[gameRows][playerMove] > 0 ) {
				playerMove -= 1;
			}
			else {
				if (player == 1){
					matrixBoard[gameRows][playerMove] = player;
					moved = true;
					break;
				}
				else if (player == 2) {
					matrixBoard[gameRows][playerMove] = player;
					moved = true;
					break;
				}
				else {
					moved = false;
				}
			}
		}
		return player;
	}
	
	public static boolean checkWin(int[][] matrixBoard, int player) {
		
		int [] winList = new int[4];
		
		int winCol = 0;
		int winDiag = 0;
		
		for(int i = 0; i < matrixBoard.length; i++){
			for(int j = 0; j <matrixBoard[i].length; j++){
				if (matrixBoard[i][j] == player) {
					int count = 0;
					for(int k = 0; k<WIN; k++) {
						if(matrixBoard[i][j+k] == player) {
							count++;
							if(count == WIN) {
								return true;
							}
						}
					}
				}
			}
		
		}
		return false;
	}
}
