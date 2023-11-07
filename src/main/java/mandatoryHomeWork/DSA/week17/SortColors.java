package mandatoryHomeWork.DSA.week17;

import java.util.Arrays;

import org.junit.Test;

public class SortColors {

	/*
	 * https://leetcode.com/problems/sort-colors/
	 */

	@Test
	public void testData(){
		int[] a= {2,0,2,1,1,0};
		System.out.println(Arrays.toString(sortColors(a)));
	}
	public int[] sortColors(int[] nums) {
		int count=0;
		int left=0;
		int right =left+1;
		while(count<nums.length&& right<nums.length){
			
			if(nums[left]>nums[right]){
				int temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
			}
			left++;
			right++;
			if(right==nums.length){
				left=0;
				right=1;
				count++;  
			}
		}
		return nums;
	}
}
