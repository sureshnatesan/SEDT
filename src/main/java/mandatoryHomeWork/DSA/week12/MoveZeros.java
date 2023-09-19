package mandatoryHomeWork.DSA.week12;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeros {


	/*
	 * 
	 * Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Pseudo code
1. create two int variable , one with starting and another with 
2. use the for loop to iterate and if the starting index find zero swap the value
	 */

	@Test
	public void testData(){
		//Assert.assertArrayEquals(new int[] {1,3,12,0,0}, soluction(new int[] {0,1,0,3,12}));
		soluction(new int[] {0,1,0,3,12});
	}

	public int[] soluction(int[] a) {
		int start =0, end =0;
		
		while(start<a.length&&end<a.length) {
			if(a[start]==0&&a[end]!=0) {
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
			}
			else {
				if(a[start]!=0) {
					start++;
					end++;

				}
				else if(a[end]==0) {
					end++;
				}
			}
			
			/*if(a[start]>a[end]&&a[start]>0){
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
			}*/
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		return a;

	}

}
