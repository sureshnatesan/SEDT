package mandatoryHomeWork.DSA.week14;

import org.junit.Test;

public class SentenceIsPangram {
	
	/*
	 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
	 * 
	 * Pseudo code
	 * 1.
	 */

	@Test
	public void testData(){
		System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}
	public boolean checkIfPangram(String sentence) {
		int[] sum= new int[26];
		for (int i = 0; i < sentence.length(); i++) {
			int a=sentence.charAt(i)-'a';
				sum[a]++;
		}
		for (int i = 0; i < sum.length; i++) {
			if(sum[i]==0) {
				return false;
			}
		}

		return true;
	}
}
