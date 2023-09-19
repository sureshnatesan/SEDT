package mandatoryHomeWork.DSA.week12;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class SubArrayThreshold {
	
	/*
	 * https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
	 * 
	 * 1. create a while loop to iterate
	 * 2. create a two int variable
	 * 3. 
	 * 
	 */
	
	@Test
	public void testData(){
		int[] z= {2,2,2,2,5,5,5,8};
		Assert.assertEquals(3, numOfSubarrays(z,3,4));
	}
	
    public int numOfSubarrays(int[] arr, int k, int threshold) {
    	 int sum=0;
         int left=0;
         int count=0;
         for (int i = 0; i < k; i++) {
 			sum+=arr[i];
 		}  
           if(sum/k>=threshold) count++;
         while(left+k<arr.length) {
         	sum+=arr[left+k]-arr[left];
         	left++;
              if(sum/k>=threshold) count++;
         }
         return count;
    }
}
