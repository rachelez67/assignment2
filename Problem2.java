package assignment2;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		aproximate();
	}
	
	public static void aproximate(){
		Scanner scan = new Scanner(System.in);
		int numb = scan.nextInt();
		double constant = 4;	
		double denom = 3; // starts @ 3
		double round = 4;
		
		//check if int is odd or even.
		for(int k = 1; k <= numb; k++) {
			if (k == 1) {
				continue;
			} 
			if (k % 2 == 0) {
				constant = constant - 4/denom; 
			}
			else constant = constant + 4/denom;
			
			denom = denom+2;
		}
		
		// round output to 2 decimal places
		round = Math.round(constant*100.0)/100.0;
		System.out.println(round);
			
		scan.close();
	}	
}
