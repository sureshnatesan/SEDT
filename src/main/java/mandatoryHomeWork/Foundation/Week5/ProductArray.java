package mandatoryHomeWork.Foundation.Week5;

import org.junit.Test;

import junit.framework.Assert;

public class ProductArray {

	/*
	 * 
	 * Pseudo code
	 * 
	 * 1. Create a for loop to iterate
	 * 2. Create one more int variable to store the product
	 * 3. check if product is lessthan 0 return -1, greater than 0 return 1, else return 0
	 */

	@Test
	public void testData() {
		Assert.assertEquals(-1,arraySign(new int[] {41,65,14,80,20,10,55,58,24,56,28,86,96,
				10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}));

	}



	
	public int arraySign(int[] nums) {
		int sum=nums[0];
		if(nums.length<2){
			if(sum>0){
				return 1;
			}
			else if(sum==0){
				return 0;
			}
			else{
				return -1;
			}
		}
		for(int i=1;i<nums.length;i++){
			sum=sum*nums[i];
			if(sum>1) {
				sum=1;
			}
			else if(sum<0) {
				sum=-1;
			}
		}
		if(sum>0){
			return 1;
		}
		else if(sum==0){
			return 0;
		}
		else{
			return -1;
		}
	}



}
