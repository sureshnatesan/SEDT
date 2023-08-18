package mandatoryHomeWork.Foundation.Problem1;

import org.junit.Test;

import junit.framework.Assert;

public class PrimeNumber {

	//Psudeo code
	/*
	 * 1. create a for loop for the given input
	 * 2. use the % operation to find the reminder
	 * 3. use the if condtion to check the reminder 0 or not
	 */

	@Test//postive
	public void testData() {
		//System.out.println(soluction(127));
		Assert.assertEquals(true, soluction(127));
	}
	
	@Test//negative
	public void testData1() {
		//System.out.println(soluction(141));
		Assert.assertEquals(false, soluction(141));
		
	}
	@Test//edge
	public void testData2() {
		System.out.println(soluction(1));
		Assert.assertEquals(true, soluction(1));
		
	}

	public boolean soluction(int input) {
		for (int i = 2; i < input; i++) {
			if(input%i==0) {
				return false;
			}
		}
		return true;
	}


}
