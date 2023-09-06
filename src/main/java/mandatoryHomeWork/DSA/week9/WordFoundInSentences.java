package mandatoryHomeWork.DSA.week9;

import org.junit.Test;

import junit.framework.Assert;


public class WordFoundInSentences {

	/*
	 * 
	 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
	 * 1. use the for loop and use the split method to get each word and return the maximum
	 * 
	 */

	@Test
	public void testData() {
		Assert.assertEquals(6, soluction(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
	}
	public int soluction(String [] str) {
		int count =0;
		for (int i = 0; i < str.length; i++) {
			String[] values= str[i].split(" ");
			if(values.length>count) {
				count=values.length;
			}
		}
		return count;
	}

}
