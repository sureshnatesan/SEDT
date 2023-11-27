package mandatoryHomeWork.DSA.week19;

import java.util.Arrays;

import org.junit.Test;

public class SquareAndSortArray {
	
	
	/*
	 * 
	 * Pseudo Code
	 * 
	 * 1. iterate the input using for loop 
	 * 2. multiple each input with same input value and update in Array 
	 * 3. Sort and return the result
	 */

	
	@Test
	public void testData(){
		int[] nums = {-4,-1,0,3,10};
		soluction1(nums);
				
	}

	private void soluction(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i]=nums[i]*nums[i];
		}
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	
	/*
	 * 
	 * Pseudo code
	 * 1.create pointer namely left,counter and right
	 * 2.use the while loop to iterate
	 * 3.use the math.abs method and compare with nums of left and right indies respectively
	 * 4. if right is greather then assign the right value in sum array and decreament right
	 * 5. if left value is greather then assign the left value and increment left
	 * 
	 */
	private void soluction1(int[] nums) {
		int[] sum= new int[nums.length];
		int left=0,right=nums.length-1, counter=nums.length-1;

		while(left<right) {
			int absleft = Math.abs(nums[left]);
			int absright = Math.abs(nums[right]);
			if(absleft<=absright) {
				sum[counter--]=absright*absright;
				right--;
			}
			else {
				sum[counter--]=absleft*absleft;
				left++;
			}
		}

		System.out.println(Arrays.toString(sum));
	}
	
	
}
