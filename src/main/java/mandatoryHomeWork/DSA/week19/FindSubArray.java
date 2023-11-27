package mandatoryHomeWork.DSA.week19;

import org.junit.Test;

public class FindSubArray {

	
	/*
	 * 
	 * Pseudo code
	 * 
	 * 1.create a variable name count and max to store the max value
	 * 2.create a while loop to iterate
	 * 3. use the if condition to verfiy the nums[left]<nums[right]
	 *4. if above condition true , increment right
	 *5. if condition fail, find right-left difference and store in a max vaale
	 *6. and move left to right
	 */
	
	@Test
	public void testData(){
		int[] a= {4,4,1,2,3,5,6,7,9};
		soluction(a);
	}

	private void soluction(int[] a) {
		int left=0,right=0,count=0, max=1;
		while(right<a.length-1) {
			if(a[right]<a[right+1]) {
				right++;
			}
			else {
				count=right-left;
				if(max<count) {
					max=count;
				}
				count=0;
				left=right++;
			}
			if(right==a.length-1) {
				count=right-left;
				if(max<count) {
					max=count;
				}
			}
		}
		System.out.println(max);
	}
	

}
