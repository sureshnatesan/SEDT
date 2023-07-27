package HomeWorkWeek3;

import org.junit.Test;

import junit.framework.Assert;

public class ReplaceAllDigitswithCharacters {
	/*
	 * https://leetcode.com/problems/replace-all-digits-with-characters/description/
	 * 
	 * Pseudo code
	 * 1. create a for loop and check using charAt mtd if its a number;
	 * 2. if its the number get the prefix num value and num and add them and convert to char
	 * 3. use the replaceFirst mtd to replace the num
	 */
	
	@Test
	public void testData() {
		Assert.assertEquals("abcdef", soluction("a1c1e1"));
	}
	
	@Test
	public void testData1() {
		Assert.assertEquals("abbdcfdhe", soluction("a1b2c3d4e"));
	}
	
	
	public String soluction(String s) {
		
		for (int j = 1; j < s.length(); j+=2) {
			int a= Character.getNumericValue(s.charAt(j))+s.charAt(j-1);
			s=s.replaceFirst(s.charAt(j)+"", (char)a+"");
			
		}
		return s;
	}

}
