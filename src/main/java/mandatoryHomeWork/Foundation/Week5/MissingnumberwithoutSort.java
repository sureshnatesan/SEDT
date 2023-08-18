package mandatoryHomeWork.Foundation.Week5;

import org.junit.Test;

import junit.framework.Assert;

public class MissingnumberwithoutSort {
	
	/*
	 * 
	 * Pseudo code
	 * 1. Create one int variable , Consider the length+1 as n
	 * 2. use the logic to sum of all number including the missing number
	 * 3. create a for loop to iterate and subtract the sum with iterate value
	 */
	
	
	@Test
	public void testData() {
		int [] a= {1, 2, 3, 5};
		Assert.assertEquals(4, soluction(a));
	}
	
	@Test
	public void testData1() {
		int [] a= {1, 2, 4, 3};
		Assert.assertEquals(5, soluction(a));
	}
	
	@Test
	public void testData2() {
		int [] a= {1, 4, 3};
		Assert.assertEquals(2, soluction(a));
	}
	
	public int soluction(int[] arr) {

		int n= arr.length+1;
		
		int sum=(n*(n+1))/2;
		
		for (int i = 0; i < arr.length; i++) {
			sum=sum-arr[i];
		}
		
		return sum;
	}

}
