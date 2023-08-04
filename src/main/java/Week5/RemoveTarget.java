package Week5;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTarget {

	/*
	 * 
	 * Pseudo code
	 * 
	 * 1. find the length of the int[]
	 * 2. use the for loop iterate the value and create the new int variable
	 * 3.check for the target value if avaiable increase count ++
	 * 4. create a new array and length should int[].length-count 
	 *5. create one more for loop and add value except the target value;
	 */

	@Test
	public void testData(){
		int[] a= {2, 3, 3, 4, 5};
		Assert.assertArrayEquals(new int[] {2,4,5}, soluction(a,3));
	}

	public int[] soluction(int[] a, int s) {

		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==s) {
				count++;
			}
		}

		int[] sum = new int[a.length-count];
		count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=s) {
				sum[count++]=a[i];
			}

		}
		return sum;
	}

}
