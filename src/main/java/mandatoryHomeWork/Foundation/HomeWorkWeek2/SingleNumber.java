package mandatoryHomeWork.Foundation.HomeWorkWeek2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class SingleNumber {


	/*
	 * https://leetcode.com/problems/single-number/description/
	 * Pseudo code
	 * 1.find the length of the array
	 * 2. create a two for looop
	 * 3. compare two loop if 1st loop value match with second loop break the loop
	 * 4 . if it loop does not break return that particular.
	 * 
	 * 
	 */
	
	@Test
	public void testData() {
		int[] a= {2,2,1};
		Assert.assertEquals(1, soluction(a));
	}
	
	@Test
	public void testData1() {
		int[] a= {4,1,2,1,2};
		Assert.assertEquals(4, soluction(a));
	}
	
	@Test
	public void testData2() {
		int[] a= {1};
		Assert.assertEquals(1, soluction(a));
	}
	
//4,1,2,1,2
	public int soluction(int a[]) {
		int output=0;
		 for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]) {
					count=count+1;
				}
			}
			if(count==1) {
				output=a[i];
			}
			  
		}
		 return output;
	}
}


