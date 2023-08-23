package mandatoryHomeWork.DSA.Week8;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Arraypartition {
	
	
	/*https://leetcode.com/problems/array-partition/
	 * Pseudo code
	 * 1. form the pair and sum of the minimum number and return the result
	 * 
	 * 
	 */
	@Test
	public void testData() {
		Assert.assertEquals(4, soluction(new int[] {1,4,3,2}));
		Assert.assertEquals(9, soluction(new int[] {6,2,6,5,1,2}));
	}
	public int soluction(int a[]) {
		int sum=0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i+=2) {
			sum=sum+a[i];
		}
		return sum;
	}

}
