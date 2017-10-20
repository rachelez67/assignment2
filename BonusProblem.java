package assignment2;
import java.util.Scanner;

public class BonusProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();					// m = rows 
		int n = scan.nextInt();					// n = columns
		int userBoard[][] = new int[m][n];
		
	//	System.out.println(boardSize(userBoard,m,n,scan));
		System.out.print(printBoard(userBoard));
	}
//	public static int[][] boardSize(int board[][], int rows, int columns, Scanner scanInt ){
//			for (int i = 0; i < rows; i++){
//				for(int j = 0; j < columns; j++){
//					board[i][j] = scanInt.nextInt();
//				}
//			}
//		return board;
//	}
	
	public static int[][] printBoard(int[][] finalBoard){
		for (int i = 0; i < finalBoard.length; i++) {
			for (int j = 0; j < finalBoard[i].length; j++) {
				System.out.print(finalBoard[i][j]+ " ");
			}
			System.out.println();
		}
		return finalBoard;
	}	
}
