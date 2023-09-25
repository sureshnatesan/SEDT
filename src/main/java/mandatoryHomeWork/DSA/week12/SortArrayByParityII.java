package mandatoryHomeWork.DSA.week12;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParityII {

	/*
	 * https://leetcode.com/problems/sort-array-by-parity-ii/description/
	 * 
	 * Pseudo code
	 * 1. create a while to iterate and create two variable left and right respectively
	 * 2. 
	 * 
	 */

	@Test
	public void testData(){
		int[] a={888,505,627,846};
		int[]b= {4,2,5,7};
		//System.out.println(Arrays.toString(sortArrayByParityII(a)));
		System.out.println(Arrays.toString(sortArrayByParityII(b)));
	}
	
	//int[]b= {4,2,5,7};
	public int[] sortArrayByParityII(int[] nums) {
		int even=0;
		int odd =1;
		int[] sum=new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2==0) {
				sum[even]=nums[i];
				even+=2;
			}
			else {
				sum[odd]=nums[i];
				odd+=2;
			}
		}
		return sum;
	}
	/*public int[] sortArrayByParityII(int[] nums) {
		int left =0;
		int right=nums.length-1;	
		while(left<nums.length&&right>=0) {
			if(left%2==0&&nums[left]%2==0) {
				left++;
			}
			else if(left%2==0&&nums[left]%2!=0) {
				if()
			}
			else if(left%2!=0&&nums[left]%2!=0) {
				left++;
			}
			else  {
				int temp=nums[left];
				nums[left++]=nums[right];
				nums[right--]=temp;
			}
		}
		return nums;

	}*/


}
