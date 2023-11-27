package mandatoryHomeWork.DSA.week19;

import org.junit.Test;

public class MaxConsecutiveOnes {


	/*
	 * https://leetcode.com/problems/max-consecutive-ones-iii/
	 * 
	 * Pseudo code
	 */


	@Test
	public void testData() {
		int[] a= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k=3;
		soluction(a,k);
	}

	private void soluction(int[] a, int k) {
	int left =0,right=0,counter=k,max=0;
	
	while(right<a.length) {
		if(a[right]==0&&k>=0) {
			k--;
		}
		if(k==0) {
			if(max<(right-left)) {
				max=right-left;
			}
			left++;
			right=left-1;
			k=counter;
		}
		right++;
	}
	
	System.out.println(max);
	System.out.println("hellow");
	}
}
