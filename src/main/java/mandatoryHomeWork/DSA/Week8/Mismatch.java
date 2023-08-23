package mandatoryHomeWork.DSA.Week8;



import java.util.Arrays;

import org.junit.Test;

public class Mismatch {

	/*
	 * https://leetcode.com/problems/set-mismatch/
	 * 
	 * Pseudo code
	 * 1. sort the array, and create a for loop and iterate
	 * 2. if iterate value is not equal to i return i-1,i in the new array and return
	 * 
	 * 
	 * 
	 */
	@Test
	public void testData() {
		int s[]=soluction(new int[]{1,5,3,2,2,7,6,4,8,9});
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	public int[] soluction(int nums[]) {
		int sum[] = new int[2];
		int count=0;
		int count2=0;
		boolean status =false;
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					count2=nums[j];
					nums[j]=0;
					break;
				}
			}
		}
		Arrays.sort(nums);
		for (int i = 1; i <nums.length; i++) {
			if(nums[i]!=i) {
				count=i;
				//a[i-1]=count;
				break;
			}
		}
	if(count==0) {
		count=nums.length;
	}

			sum[0]=count2;
			sum[1]=count;
			
		

		return sum;
	}
}
