package mandatoryHomeWork.Foundation.HomeWorkWeek3;

import org.junit.Test;

import junit.framework.Assert;

public class Maximum69Number {
	
	/*
	 * https://leetcode.com/problems/maximum-69-number/description/
	 * 
	 * Pseudo code
	 * 1.convert the int to string
	 * 2. use the replaceFirst, method to replace the 6 to 9 and covert
	 * the string to int
	 * 	 
	 * */

	@Test
	public void testData() {
		Assert.assertEquals(9969, soluction(9669));
	}
	
	@Test
	public void testData1() {
		Assert.assertEquals(9999, soluction(9996));
	}
	
	@Test
	public void testData2() {
		Assert.assertEquals(9999, soluction(9999));
	}
	
	public int soluction(int a) {
	String valueOf = String.valueOf(a);
	valueOf=valueOf.replaceFirst('6'+"", '9'+"");
	return Integer.parseInt(valueOf);
	}
}
