package assignment2;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		wordlist();

	}
	
	public static void wordlist() {
		Scanner scan = new Scanner(System.in);
		
		int wrdlsize = scan.nextInt();	//wrdlsize = wordListSize
		String wordlist[] = new String[wrdlsize];	
		
		for(int c = 0; c < wrdlsize; c++) {	//go thru user input
			wordlist[c] = scan.next();
		}
	
		int numbcount[] = new int[26];	// alphabet size
		int maxnumber = 0;
		
		//word and letter counter
		for (int i = 0; i < wrdlsize; i++){
			for(int a = 0; a < wordlist[i].length(); a++){
				numbcount[wordlist[i].toCharArray()[a]-97]++;
			}
		} for(int b = 1; b < 26; b++) {
				if (numbcount[maxnumber] < numbcount[b] ) {
					maxnumber = b;
				}
			}
		System.out.print((char)(maxnumber + 97));

		scan.close();
	}
		
}

	
