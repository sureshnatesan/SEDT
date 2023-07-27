package HomeWorkWeek2;

import org.junit.Test;

import junit.framework.Assert;

public class PowerOfTwo {

	/*
	 * pseudo code
	 * 1.check if input%2==0, else return false
	 * 2.use the while loop
	 */

	@Test
	public void testData1() {
		Assert.assertEquals(true, soluction(16));
	}
	
	@Test
	public void testData2() {
		Assert.assertEquals(true, soluction(1));
	}
	
	@Test
	public void testData3() {
		Assert.assertEquals(false, soluction(3));
	}

	public boolean soluction(int n) {
		int sum=1;
		if(n%2==0) {
			while(sum<n) {
				sum=sum*2;
			}
			if(sum==n) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(n==1) {
			return true;
		}
		else {
			return false;
		}
	}
}
