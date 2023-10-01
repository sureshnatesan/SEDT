package mandatoryHomeWork.DSA.week14;

import org.junit.Test;

public class TwoSum {


	/*
	 * 
	 * 
	 * https://leetcode.com/problems/two-sum/description/
	 * 
	 * 1.create left and right int variable start at 0 and one respectively
	 * 2.use the if condition to check the sum of left and right is target
	 * 3. if not increament the right alone and if right reaches the maximum length 
	 * 4. increase the left the decrease the right
	 * 5. And the while condition should be left should equals to less the length
	 */

	//1,3,4,2,6
	
	
	
	
	@Test
	public void testData(){
		int [] a= {2,7,11,15};
		int k=9;
		
		
		System.out.println(twoSum(a,k));
	}

	public int[] twoSum(int[] nums, int target) {
		int[] sum= new int[2];
		int left=0;
		int right=1;

		while(left<nums.length) {
			if(nums[left]+nums[right]==target) {
				sum[0]=left;
				sum[1]=right;
			}
			else if(nums[left]+nums[right]!=target&&right<nums.length) {
				right++;
			}
			else if(nums[left]+nums[right]!=target&&right==nums.length) {
				left++;
				right=left+1;
			}
			
		}
		return sum ;
	}
}
