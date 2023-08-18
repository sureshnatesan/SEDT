package mandatoryHomeWork.Foundation.HomeWorkWeek3;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class MissingNumber {

	/*
	 * 
	 * https://leetcode.com/problems/missing-number/description/
	 * pseudo code
	 * 1.Input array
	 * 2. out put int
	 * find the length of the array and iterate one by one
	 */
	
	@Test
	public void testData() {
	Assert.assertEquals(2, soluction1(new int[] {3,0,1}));
	}
	
	@Test
	public void testData1() {
	Assert.assertEquals(2, soluction1(new int[] {0,1}));
	}
	
	@Test
	public void testData2() {
	Assert.assertEquals(8, soluction1(new int[] {9,6,4,2,3,5,7,0,1}));
	}
	
	
	public int soluction1(int[] a) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if(i!=a[i]) {
				return i;
			}
		}
		return a.length;
	}
	
	public int missingNo(int[] num)
	{
		int sum=0;
		int totalSum=num.length;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
			totalSum=totalSum+i;
		}
		
		return totalSum-sum;
	}
}
