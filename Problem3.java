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
		
		if (letter == "Q") {
			exit = false;
		}
			else if(letter == "T") {
				System.out.println(transpose(matri,m,n,matri));
				//System.out.println("did t");
			}
			else if(letter == "R") {
				rowMax(matri,m,n);
				System.out.println("did r");
			}
			else if(letter == "C") {
				columnSum(n,matri);
				System.out.println("did c");
			}
		
		}
	}
	
	/* get the user's Matrix */
	public static int[][] getMatrix(int [][] userArray, int m, int n){
		Scanner newScan = new Scanner(System.in);
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++) {
				userArray[i][j] = newScan.nextInt();		
			}
		}
		
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
	public static int[][] transpose(int[][] transposedArray, int m, int n, int[][] userArray) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				//userArray[i][j] = transposedArray[n][m];
				transposedArray[i][j] = userArray [j][i];
				}
			}
		System.out.print(transposedArray[n][m]);
		return transposedArray;
		
	}
	
	/* Find greatest value in each row */
	public static int rowMax(int[][] userArray, int m, int n) {
		int max = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(userArray[i][j] > max) {
					max = userArray[i][j];
					}
				}
			}
		return max;
	}
	
	/* Get sum of all columns */
	//new matrix = transpose
	
	public static int columnSum(int colSum, int [][]userArray){
		for(int i = 0; i < userArray.length; i++) {
			colSum = 0;
			for (int j = 0; j < userArray[i].length; j++) {
				colSum += userArray[j][i];
			}
		}
		return colSum;
	}
}