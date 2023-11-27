package mandatoryHomeWork.DSA.week19;

import java.util.Arrays;

import org.junit.Test;

public class MaximumSumExactlyKElements {
	
	
	
	/*
	 * https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/description/
	 */

	
	@Test
	public void testdata() {
		int [] a= {1,2,3,4,5};
		int k=3;
		System.out.println(soluction(a,k));

	}

	public int soluction(int[] a,int k) {
		Arrays.sort(a);
		int sum=a[a.length-1];
		int counter=a[a.length-1];
		for (int i = 1; i <k; i++) {
			counter++;
			sum+=counter;
		}
		return sum;
	}
}
