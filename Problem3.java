package assignment2;
import java.util.Scanner;

public class Problem3 {
	

	public static void main(String[] args) {
		//fields
		Scanner scan = new Scanner(System.in);
		
	
		int m = scan.nextInt(); 					// m = rows
		int n = scan.nextInt(); 					// n = columns
		int userArray[][] = new int [m][n];		
		 			
		
		int[][] matri= getMatrix(userArray, m, n);
		
		boolean exit = true;
		
		while(exit) {
			String letter = scan.nextLine();			// letter input 
			//System.out.println(letter);

		if (letter.equals("Q")) {
			exit = false;
			break;
		}
		else if(letter.equals("T")) {
			transpose(matri,m,n);
		}
		else if(letter.equals("R")) {
			rowMax(matri,m,n);
			}
		else if(letter.equals("C")) {
			columnSum(m,n,matri);
			}
		}
		scan.close();
	}
	
	/* get the user's Matrix */
	public static int[][] getMatrix(int [][] userArray, int m, int n){
		Scanner newScan = new Scanner(System.in);
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++) {
				userArray[i][j] = newScan.nextInt();		
			}
		}
		newScan.close();
		return userArray;
	}
	
	/* Print the matrix (debugging) */
	public static void printMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) { 
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	/* Flip matrix */
	public static void transpose(int[][] transposedArray, int m, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				//userArray[i][j] = transposedArray[n][m];
				System.out.print(transposedArray[j][i]+ " ");
			}
			System.out.println();
		}
	}
	
	/* Find greatest value in each row */
	public static void rowMax(int[][] userArray, int m, int n) {
		int max = 0;
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				if(userArray[j][i] > max) {
					max = userArray[j][i];
				}
			}
			System.out.print(max + " ");
		}
	}
	
	/* Get sum of all columns */
	//new matrix = transpose
	public static void columnSum(int m, int n, int [][]userArray){
		for(int j = 0; j < n; j++) {
			int colSum = 0;
			for (int i = 0; i < m; i++) {
				colSum += userArray[i][j];
			}
			System.out.print(colSum + " ");
		}
	}
}