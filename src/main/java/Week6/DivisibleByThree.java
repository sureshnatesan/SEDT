package Week6;

import org.junit.Test;

import junit.framework.Assert;

public class DivisibleByThree {
	
	/*
	 * https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/
	 * Pseudo code
	
	 * 1.Create a for loop and iterate and check the modular operator which gives 0 for 2 & 3
	 * 2. create one int variable to capture the count of the numbers and use for div operation to get the average
	 *
	 *
	 */
	
	@Test
	public void testData1(){
		Assert.assertEquals(9,soluction(new int[] {1,3,6,10,12,15}));
	}
	
	@Test
	public void testData2(){
		Assert.assertEquals(0,soluction(new int[] {1,2,4,7,10}));
	}
	
	public int soluction(int[] a) {
		int count =0;
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0 && a[i]%3==0) {
				sum=sum+a[i];
				count++;
			}
		}
		
		if(count>0) {
			return sum/count;
		}
		else {
			return count;
		}
	}
	

}
