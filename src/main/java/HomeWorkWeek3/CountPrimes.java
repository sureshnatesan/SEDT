package HomeWorkWeek3;

import org.junit.Test;

import junit.framework.Assert;

public class CountPrimes {

	/*
	 * https://leetcode.com/problems/count-primes/description/
	 * 
	 * Pseudo code
	 * 1. check given number is prime or not
	 * 
	 */

	@Test
	public void testData() {
		Assert.assertEquals(4, soluction(10));
	}
	
	@Test
	public void testData2() {
		Assert.assertEquals(0, soluction(0));
	}
	
	@Test
	public void testData3() {
		Assert.assertEquals(0, soluction(1));
	}
	
	@Test
	public void testData4() {
		System.out.println(soluction(99797561));
	}
	
	public int soluction(int a) {
		String output="";
		for (int i = 0; i < a; i++) {
			if(primenumber(i)==true) {
				output=output+i+"";
			}
		}
return output.length();
	}

	public boolean primenumber(int a) {
		while(a>1) {
			for (int i = 2; i < a; i++) {
				if(a%i==0) {
					return false;
				}
			}

		}
		return false;
	}
}
