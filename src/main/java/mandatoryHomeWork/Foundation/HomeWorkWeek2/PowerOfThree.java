package mandatoryHomeWork.Foundation.HomeWorkWeek2;

import org.junit.Test;

import junit.framework.Assert;

public class PowerOfThree {

	/*
	 * pseudo code
	 * 1. create a while loop 
	 * 2. initialise the i =2 and use % operator 
	 */

	@Test
	public void testData() {
		Assert.assertEquals(true, soluction(27));
	}

	@Test
	public void testData1() {
		Assert.assertEquals(false, soluction(0));
	}

	@Test
	public void testData2() {
		Assert.assertEquals(false, soluction(-1));
	}

	@Test
	public void testData3() {
		Assert.assertEquals(true, soluction(64));
	}

	@Test
	public void testData4() {
		Assert.assertEquals(true, soluction(2197));
	}

	public boolean soluction(int a) {
		int i=2;
		while(i<a) {
			if(a%i==0) {
				int temp =i*i*i;
				System.out.println(temp);
				if(temp==a)
				{
					return true;
				}
			}
			i++;
		}
		return false;

	}

}
