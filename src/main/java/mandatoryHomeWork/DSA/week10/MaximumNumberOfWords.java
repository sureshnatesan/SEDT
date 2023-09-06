package mandatoryHomeWork.DSA.week10;

import org.junit.Test;

public class MaximumNumberOfWords {
	/*
	 * Pseudo code
	 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/
	 * 1.create a for loop and use the split operation to get the count
	 */
	
	@Test
	public void testData() {
		String[] sentences = {"please wait", "continue to fight", "continue to win"};
		System.out.println(mostWordsFound(sentences));
		
	}
	
	

	public static int mostWordsFound(String[] str) {
		int count =0;
		for (int i = 0; i < str.length; i++) {//O(n)
			String[] values= str[i].split(" ");
			if(values.length>count) {
				count=values.length;
			}
		}
		return count;
	}

}
