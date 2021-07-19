/*	
 * 	author: Kean Jaycox
 * 	date: 7/19/2021
 * 	This is my solution to code challenge on r/dailyprogrammer
 *	[2021-07-19] Challenge #399 [Easy] Letter value sum
 *	https://www.reddit.com/r/dailyprogrammer/comments/onfehl/20210719_challenge_399_easy_letter_value_sum/
 * 
 */


public class Challenge399Easy {

	public  static int letterSum(String t) {
		int sum = 0;
		for (int i=0; i < t.length(); i++) {				// moves through length of word
			if(t.charAt(i) >= 'a' && t.charAt(i) <= 'z')	// only counts lower case alphas
				sum += t.charAt(i) - 96;					// gets correct value from ascii
		}
		return sum;
	}
	
	public static void main(String args[]) {
		
		System.out.println(letterSum("abcdef"));
	}
}