package mandatoryHomeWork.Foundation.HomeWorkWeek2;

import org.junit.Test;

import junit.framework.Assert;

public class ContainsDuplicate {
	/*
	 * Pseudo code
	 * 1. create two for loop
	 * 2. check if a[i]==a[j];
	 * 3. if its match update true, else update false
	 */

	@Test
	public void testData() {
		int[] a = {1,2,3,1};
		Assert.assertEquals(true, soluction(a));
	}
	
	@Test
	public void testData1() {
		int[] a = {1,2,3,4};
		Assert.assertEquals(false, soluction(a));
	}
	
	@Test
	public void testData2() {
		int[] a = {1,1,1,3,3,4,3,2,4,2};
		Assert.assertEquals(true, soluction(a));
	}

	
	public boolean soluction(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					return true;
				}
			}
		}
		return false;
		
	}
}
