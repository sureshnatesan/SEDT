package mandatoryHomeWork.Foundation.HomeWorkWeek3;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class SecondLargestDigit {

	/*
	 * 
	 * https://leetcode.com/problems/second-largest-digit-in-a-string/description/
	 * 
	 * Pseudo code
	 * 1.Input String 
	 * 2. out int
	 * 1. get only number form string and convert to int
	 * 2. add them in a array
	 * 3. use the sort operation 
	 * 4. return the send value if second is lesser than last
	 * 
	 */

	@Test
	public void testData() {
		String a= "dfa12321afd";
		Assert.assertEquals(2, soluction(a));
	}
	
	@Test
	public void testData1() {
		String s = "abc1111";
		Assert.assertEquals(-1, soluction(s));
	}
	
	public int soluction(String a) {

		a= a.replaceAll("[^0-9]", "");
		int[] value=new int[a.length()];
		for (int i = 0; i < value.length; i++) {
			value[i]=Character.getNumericValue(a.charAt(i));
		}
		Arrays.sort(value);
		if(value[value.length-1]>value[value.length-2]) {
			System.out.println();
			return value[value.length-2];
		}
		else {
			return -1;
		}
	}
}
