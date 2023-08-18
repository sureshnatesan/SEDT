package mandatoryHomeWork.Foundation.week7;

import org.junit.Test;

import junit.framework.Assert;

public class FindtheCapital {
	
	/*
	 * 
	 * Pseudo code
	 * 
	 * 1. Create a for loop to iterate and use the charAt method to get the character
	 * 2. Subtract each character with capital A and if return 0<26, increase the count
	 * 3. return the count variable
	 */
	
	@Test
	public void postiveTest(){
		Assert.assertEquals(3,soluction("ILoveIndia"));
		Assert.assertEquals(5,soluction("ABCDE"));
	}
	
	@Test
	public void negativeTest(){
		Assert.assertEquals(0,soluction("iloveindia"));
	}
	@Test
	public void edgeTest(){
		Assert.assertEquals(0,soluction("  "));
		Assert.assertEquals(0,soluction(" *************(* "));
	}
	
	public int soluction(String s) {
		int count =0;
		for (int i = 0; i < s.length(); i++) {
			if((s.charAt(i))-'A'<26&&(s.charAt(i))-'A'>=0) {
				count++;
			}
		}
		return count;
	}

}
