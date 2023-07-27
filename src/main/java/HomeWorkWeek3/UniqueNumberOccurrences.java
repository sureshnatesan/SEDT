package HomeWorkWeek3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class UniqueNumberOccurrences {
	/*
	 * https://leetcode.com/problems/unique-number-of-occurrences/description/
	 * 
	 * Pseudo code
	 * 1. sort the array
	 * 2, create a counter variable and assign 1 as initizal value and one more variable as k
	 *  
	 */


	@Test
	public void testData() {
		Assert.assertEquals(true, soluction1(new int[] {1,2,2,1,1,3}));
	}

	@Test
	public void testData1() {
		Assert.assertEquals(false, soluction1(new int[] {1,2}));
	}

	@Test
	public void testData2() {
		Assert.assertEquals(true, soluction1(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
	}

	//1,1,1,2,2,3
	public boolean soluction1(int[] a) {
		Arrays.sort(a);
		 
		int[] size = new int[a.length];
		int count=1, k=0; 
		for (int i = 0; i < a.length-1; i++) {
			
			if(a[i]==a[i+1]) {
				count++;
			}
			else {
				size[k++]=count;
				count=1;
			}

		}
		size[k]=count;

		for (int i = 0; i < size.length-1; i++) {
			if(size[i]!=0) {
				if(size[i]==size[i+1]) {
					return false;
				}
			}
		}
		return true;
	}



}
