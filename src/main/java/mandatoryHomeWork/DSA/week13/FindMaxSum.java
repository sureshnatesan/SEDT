package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

public class FindMaxSum {

	/*
	 * input : [10,3,33,5,2,32,21,14,17,8,9] & k=3
	 * 
	 * 
	 * Pseudo code
	 * 1. create two int variable namely left and right both start from zero
	 * 2. increment the right and create the sum varable to store the values
	 */

	@Test
	public void testData(){
		int [] a= {10,3,33,5,2,32,21,14,17,8,9};
		int k=3;
		System.out.println(soluction(a,k));
	}

	public int soluction(int[] s,int k) {
		int sum=0;
		int left=0;
		int right=0;
		int count=Integer.MIN_VALUE;
		while(right<s.length){
			if(right>=k) {
				sum-=s[left];
				left++;
			}
			sum+=s[right++];
			if(count<sum) count=sum;
		}
		return count;
	}

}
