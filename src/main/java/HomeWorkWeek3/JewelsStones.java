package HomeWorkWeek3;

import org.junit.Test;

import junit.framework.Assert;

public class JewelsStones {
	
	
	
	/*
	 * https://leetcode.com/problems/jewels-and-stones/description/
	 * Pseudo code
	 * 1.create a for loop with count variable
	 * 2. compare and increase count if it getting matched
	 * 
	 */
	
	@Test
	public void testData() {
		Assert.assertEquals(3, soluction("aA","aAAbbbb"));

	}
	
	@Test
	public void testData1() {
		Assert.assertEquals(0, soluction("Z","zz"));

	}
	
	
	public int soluction(String jewels, String stones) {
		
		int count =0;
		for (int i = 0; i < jewels.length(); i++) {
			for (int j = 0; j < stones.length(); j++) {
				if(jewels.charAt(i)==stones.charAt(j)) {
					count++;
				}
			}
		}
		return count;
		
	}

}
