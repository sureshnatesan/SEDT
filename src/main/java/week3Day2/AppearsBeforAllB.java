package week3Day2;

import org.junit.Test;

import junit.framework.Assert;

public class AppearsBeforAllB {
	/*
	 * pseudo code
	 * 1. use the lastindex of a and first index of B
	 * 2. if lastindex of a< b ?true: false
	 * 
	 */
	
	
	@Test
	public void testData() {
		Assert.assertEquals(true,  soluction("aaabbb"));
	}
	
	@Test
	public void testData1() {
		Assert.assertEquals(false,  soluction("abab"));
	}
	@Test
	public void testData2() {
		Assert.assertEquals(true,  soluction("bbb"));
	}
	
	@Test
	public void testData3() {
		Assert.assertEquals(true,  soluction("aaa"));
	}
	
	private boolean soluction(String a) {
		return (a.lastIndexOf('a')<	a.indexOf('b') ? true:false) || a.indexOf('b')==-1 ?true : false;
	}

}
