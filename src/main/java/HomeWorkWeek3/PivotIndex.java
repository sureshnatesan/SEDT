package HomeWorkWeek3;

import org.junit.Test;

import junit.framework.Assert;

public class PivotIndex {
	
	/*
	 * https://leetcode.com/problems/find-pivot-index/description/
	 * pseudo code
	 * 
	 * 1. iterate using for loop and 
	 */
	
	@Test
	public void testData(){
		Assert.assertEquals(3, soluction(new int[] {1,7,3,6,5,6}));
	}
	
	@Test
	public void testData1(){
		Assert.assertEquals(-1, soluction(new int[] {1,2,3}));
	}
	
	@Test
	public void testData2(){
		Assert.assertEquals(0, soluction(new int[] {2,1,-1}));
	}
	
	public int soluction(int[] s) {
		for (int i = 0; i < s.length; i++) {
			int left=0,right=0;
			
			for (int j = i+1; j < s.length; j++) {
				right=right+s[j];
			}
			for (int k = i-1; k >=0; k--) {
				left+=s[k];
			}
			
			if(left==right) {
				return i;
			}
		}
		return -1;
	}

}
