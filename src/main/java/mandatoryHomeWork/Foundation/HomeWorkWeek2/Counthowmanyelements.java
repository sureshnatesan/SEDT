package mandatoryHomeWork.Foundation.HomeWorkWeek2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Counthowmanyelements {

	/*
	 * pseudo code
	 * 
	 * 1.find the length of array
	 * 2. create a int output variable with initialisation 0
	 * 3.itreate using the two for loop
	 * 4.a[i]+1==a[j]
	 * count=count+1
	 * 
	 */

	@Test
	public void testData() {
		int[] a= {1, 2, 3};
		Assert.assertEquals(2, soluction(a));
	}
	
	
	@Test
	public void testData1() {
		int[] a= {1, 1, 3, 3, 5, 5, 7, 7};
		Assert.assertEquals(0, soluction(a));
	}
	
	@Test
	public void testData2() {
		Assert.assertEquals(2, soluction(new int[]{1,1,2}));
	}
	
	@Test
	public void testData3() {
		Assert.assertEquals(4, soluction(new int[]{1,2,2,3}));
	}
	
	@Test
	public void testData4() {
		Assert.assertEquals(4, soluction(new int[]{3,2,2,1}));
	}
	
	@Test
	public void testData5() {
		Assert.assertEquals(5, soluction(new int[]{1,2,2,3,0}));
	}
	
	public int soluction(int[] a) {
		Arrays.sort(a);
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]+1==a[j]) {
					count=count+1;
				}
			}
		}
		return count;
	}

}
