package mandatoryHomeWork.Foundation.Week5;

import org.junit.Test;

import junit.framework.Assert;

public class LastIndex {
	/*
	 * 
	 * Pseudo code
	 * 1. create the for loop to iterate and check for '1' in a string
	 * *2. if contains update the iterator index in a variable and return the same
	 */

	@Test
	public void testData() {
		Assert.assertEquals(4, lastIndex("00001"));
		Assert.assertEquals(4, lastIndex1("00001"));
	}
	@Test
	public void testData1() {
		Assert.assertEquals(-1, lastIndex("00004"));
		Assert.assertEquals(-1, lastIndex1("00004"));
	}
	
	@Test
	public void testData12() {
		Assert.assertEquals(0, lastIndex("10004"));
		Assert.assertEquals(0, lastIndex1("10004"));
	}
	
	@Test
	public void testData13() {
		Assert.assertEquals(2, lastIndex("00104"));
		Assert.assertEquals(2, lastIndex1("00104"));
	}

	public int lastIndex( String s) {
		return s.lastIndexOf('1');
	}
	
	public int lastIndex1( String s) {
		int count=-1;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='1') {
				count=i;
			}
		}
		return count;
	}
}
