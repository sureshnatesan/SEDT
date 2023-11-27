package mandatoryHomeWork.DSA.week19;

import java.util.Arrays;

import org.junit.Test;

public class MaxmiumProduct {

	/*
	 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
	 */

	
	
	@Test
	public void testData(){
		int[] nums = {3,4,5,2};
		System.out.println(soluction(nums));
	}
	public int soluction(int[] nums){
		
		Arrays.sort(nums);
		return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
	}
}
