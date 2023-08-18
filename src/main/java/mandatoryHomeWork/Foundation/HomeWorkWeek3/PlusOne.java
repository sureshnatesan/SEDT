package mandatoryHomeWork.Foundation.HomeWorkWeek3;

import org.junit.Assert;
import org.junit.Test;

public class PlusOne {


	/*
	 * https://leetcode.com/problems/plus-one/description/
	 * pseudo code
	 * Input:array int[]
	 * output:array int[]
	 * 
	 * 1. add one at the lostif <8
	 * 2. if >8, check for last-1 number
	 */
	
	@Test
	public void testData() {
		Assert.assertArrayEquals(new int[] {1,2,4}, soluction(new int[] {1,2,3}));
	}
	
	@Test
	public void testData1() {
		Assert.assertArrayEquals(new int[] {4,3,2,2}, soluction(new int[] {4,3,2,1}));
	}
	
	@Test
	public void testData2() {
		Assert.assertArrayEquals(new int[] {1,0}, soluction(new int[] {9}));
	}

	public int[] soluction(int[] a) {

		for (int i = a.length-1; i >=0; i--) {
			if(a[i]<9) {
				a[i]++;
				return a;
			}
			else {
				a[i]=0;
			}
		}
		int [] result = new int[a.length+1];
		result[0]=1;
		return result;
	}
}
