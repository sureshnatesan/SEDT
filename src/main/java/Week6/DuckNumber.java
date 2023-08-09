package Week6;

import org.junit.Test;

import junit.framework.Assert;

public class DuckNumber {


	/*
	 * 
	 * Pseudo code
	 * 1. Use the div operator to remove the leading zero
	 * 2. use the modular operator to get the reminder and check for zero
	 * 3. if zero present return true
	 */


	//@Test
	public void postiveData() {
		Assert.assertEquals(true, soluctionrt(3056));
		Assert.assertEquals(true, soluctionrt(10045));
		Assert.assertEquals(true, soluctionrt(770));
	}
	
	@Test
	public void negativeData() {
		int a=0144;
		Assert.assertEquals(false, soluctionrt(a));
		//Assert.assertEquals(false, soluctionrt(0123));
	}/*
	
	@Test
	public void edgeData() {
		Assert.assertEquals(true, soluction(0));
		Assert.assertEquals(true, soluction(010));
		Assert.assertEquals(false, soluction(000001));
	}
*/
	public boolean soluctionrt(int a) {
		System.out.println(a);
		a=a*1;
		System.out.println(a);
		while(a>0) {
			if(a%10==0) {
				return true;
			}
			a=a/10;
		}
		return false;
	}

}
