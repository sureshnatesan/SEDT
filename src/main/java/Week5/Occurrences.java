package Week5;

import org.junit.Test;

import junit.framework.Assert;

public class Occurrences {

	/*
	 * Pseudo code
	 * 
	 * ip->int[], int
	 * op ->int
	 * 1. Create a for loop to iterate the int[]
	 * 2. check for target in the loop, if rarget is available increase the count by
	 * 3. return the count
	 */
	
	@Test
	public void testData() {
		int a[] = {1, 1, 2, 2, 2, 2, 3};
		int s= 2;
		Assert.assertEquals(4, soluction(a,s));
	}
	

	@Test
	public void testData1() {
		int a[] = {1, 1, 2, 2, 2, 2, 3};
		int s= 3;
		Assert.assertEquals(1, soluction(a,s));
	}

	@Test
	public void testData2() {
		int a[] = {1, 1, 2, 2, 2, 2, 3};
		int s= 4;
		Assert.assertEquals(-1, soluction(a,s));
	}
	
	public int soluction(int[] arr, int target) {
		int count=0;
		if(arr.length==0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				count++;
			}
		}
		if(count==0) {
			return -1;
		}
		return count;
	}
}
