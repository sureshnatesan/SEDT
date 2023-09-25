package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

public class Threshold {
	
	/*
	 * 
	 * Pseudo code
	 * 1. first try to sum the given into till k
	 * 2. increase the count, when sum/k>=threshold;
	 * 3. create a while to iterate the left+K<input.length
	 * 
	 */

	@Test
	public void testData(){
		int [] a= {2,2,2,2,5,5,5,8};
		System.out.println(numOfSubarrays(a,3,4));
	}
	  public int numOfSubarrays(int[] arr, int k, int threshold) {
		  int sum=0;
		  int count=0;
		  int i=0;
		  while(i<k) {
			  sum+=arr[i++];
		  }
		
		  int left=0;
		  if(sum/k>=threshold) count++;
		 while(left+k<arr.length) {
			 sum+=arr[left+k]-arr[left++];	
			 if(sum/k>=threshold) count++;
		 }
		 return count;
	  }
}
