package mandatoryHomeWork.DSA.week12;

import org.junit.Test;

public class ArrayConcatenationValue {



	/*
	 * https://leetcode.com/problems/find-the-array-concatenation-value/description/
	 * Pseudo code

    Pseudo code
    1. create a two int variable namely left and right
    2. create a while to iterate
    3. compain the point and convert to int again
	 */
	
	@Test
	public void testData(){
		int[] a= {5,14,13,8,12};
		System.out.println(findTheArrayConcVal(a));
	}
	
	 public long findTheArrayConcVal(int[] nums) {
   		long sum=0;
		int left =0;
		int right =nums.length-1;
		while(left<right){
			String s= nums[left++]+""+nums[right--];
			sum=sum+(long)Integer.parseInt(s);
		}
		if(nums.length%2!=0) return sum+nums[(nums.length)/2];
		return sum;
 }
}
