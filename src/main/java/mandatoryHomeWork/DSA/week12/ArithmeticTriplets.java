package mandatoryHomeWork.DSA.week12;

import org.junit.Test;

public class ArithmeticTriplets {

	/*
	 * 
	 * https://leetcode.com/problems/number-of-arithmetic-triplets/
	 * Pseudo code
	 * 
	 * 1.create a two pointer, one with left and right, and one boolean variable
	 * 2. Create a while to iterate, and initate the left should be 0 and right should be in left+1;
	 * 3. if one match is found, then increase the right alone, no match for any value check for right == nums.length-1, then left by 1 and right to left
	 * 
	 */

	@Test
	public void testData(){
		int [] nums= {0,1,4,6,7,10};
		System.out.println(arithmeticTriplets(nums,3));
	}



	public int arithmeticTriplets(int[] nums, int diff) {
//{0,1,4,6,7,10};
		int left=0;
		int right =left+1;
		boolean status= false;
		int count=0;
		while(left+1<nums.length&&right<nums.length) {
			if(nums[right]-nums[left]==diff) {
				status=true;
			}
			if(status==true) {
				if(nums[right]-nums[left]==diff*2) {
					count++;
				}
			}
			if(right==nums.length-1) {
				left++;
				right=left;
				status=false;
			}
			right++;
		}
		return count;
	}
}
